# Documento de cambios del diagrama de clases
 
Comparativa entre la versión 1 y la versión 2 del diagrama de clases del sistema de evaluación.
 
## 1. Resumen
 
La versión 2 pasa de un modelo con un solo rol especializado (Administrador) a un modelo con tres roles definidos por herencia, cada uno con responsabilidades propias. También se redefine la relación entre usuarios y evaluaciones para distinguir quién evalúa y quién es evaluado, y se agrega la ponderación de los indicadores. La estructura central (Periodo, Evaluación, Indicador, Respuesta) se mantiene sin cambios.
 
| Aspecto | Versión 1 | Versión 2 |
|---|---|---|
| Roles | Usuario y Administrador | Usuario, Administrador, DirectoraAdministracion y ServidorPublico |
| Relación Usuario–Evaluación | Una asociación: *realiza* | Dos asociaciones: *emite* y *recibe* |
| Generación de reportes | Administrador | DirectoraAdministracion |
| Indicador | Sin ponderación | Se agrega `ponderacion` |
| Validación de antigüedad | Solo en Evaluacion | En Usuario y en Evaluacion |
 
## 2. Cambios en las clases
 
### 2.1 Nuevas clases (especializaciones de Usuario)
 
**DirectoraAdministracion** (nueva). Es el rol que consulta resultados y genera reportes.
- Métodos: `consultarResultados()`, `generarReporte()`.
- Asume la responsabilidad de reportes que en la versión 1 era del Administrador.
**ServidorPublico** (nueva). Es el rol evaluado, que participa en su propia evaluación.
- Métodos: `realizarAutoevaluacion()`, `consultarEvaluacionPropia()`.
- Introduce el concepto de autoevaluación, que antes no estaba modelado.
### 2.2 Clases modificadas
 
**Usuario**
- Se agrega el método `validarAntigüedad()`. Esto indica que la antigüedad es una característica de la persona (a partir de `fechaIngreso`) y no solo de la evaluación.
- Se mantienen los mismos atributos y los métodos de sesión.
**Indicador**
- Se agrega el atributo `ponderacion`, que permite que cada indicador pese distinto en la calificación final de la evaluación.
### 2.3 Clases sin cambios
 
- **Administrador**: conserva `registrarUsuario()`, `modificarUsuario()`, `eliminarUsuario()` y `establecerPeriodoEvaluacion()`. Pierde, por la relación con Reporte, la capacidad de generarlos (ver 3.3).
- **Evaluacion**, **PeriodoEvaluacion**, **Respuesta** y **Reporte**: mismos atributos y métodos.
## 3. Cambios en las relaciones
 
### 3.1 Herencia
 
| Relación | V1 | V2 |
|---|---|---|
| Usuario → Administrador | Sí | Sí |
| Usuario → DirectoraAdministracion | No | Sí |
| Usuario → ServidorPublico | No | Sí |
 
Todos los roles heredan los datos de acceso y los métodos de sesión de Usuario, así que no se duplica la lógica de autenticación.
 
### 3.2 Usuario y Evaluación: de *realiza* a *emite* / *recibe*
 
En la versión 1, `Usuario 1 -- * Evaluacion : realiza` solo dice que un usuario realiza evaluaciones. En la versión 2 esa asociación se divide en dos:
 
- `Usuario 1 -- * Evaluacion : emite` (quien evalúa).
- `Usuario 1 -- * Evaluacion : recibe` (quien es evaluado).
Este es el cambio estructural más importante: el modelo ya puede representar evaluaciones de un usuario hacia otro y también autoevaluaciones (cuando emisor y receptor son la misma persona).
 
### 3.3 Reportes: de Administrador a DirectoraAdministracion
 
La relación `generar` con Reporte (1 a muchos) pasa de Administrador a DirectoraAdministracion. El efecto es una separación de funciones: el Administrador gestiona usuarios y periodos, y la Directora consulta resultados y emite reportes.
 
### 3.4 Relaciones que se mantienen
 
- `PeriodoEvaluacion 1 -- * Evaluacion : rige`.
- `Evaluacion 1 *-- * Indicador : contiene` (composición: los indicadores no existen sin su evaluación).
- `Indicador 1 -- 1 Respuesta : recibe`.
## 4. Impacto a lo largo del proyecto
 
- **Autenticación y permisos**: el control de acceso puede apoyarse en la jerarquía de roles, no solo en el atributo `tipoUsuario`.
- **Flujo de evaluación**: el ServidorPublico captura su autoevaluación y quien corresponda emite la evaluación; ambas se guardan como `Evaluacion` ligadas al periodo vigente.
- **Cálculo de resultados**: con `ponderacion`, la calificación global debe calcularse como suma ponderada de los indicadores, no como promedio simple.
- **Reportes**: la funcionalidad de reportes, exportación e impresión queda bajo la DirectoraAdministracion. Si el Administrador también necesita reportes, habría que restituir esa relación.
- **Base de datos**: se requieren la columna de ponderación en indicadores y dos referencias de usuario en evaluaciones (emisor y receptor).
