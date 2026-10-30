# Requisitos No Funcionales
  Categoría | Requisito No Funcional (RNF) | Descripción / Especificación |
| :--- | :--- | :--- |
| **01 Rendimiento** | Tiempos de respuesta | Menos de 3 s para inicio de sesión, carga de evaluaciones y guardado; menos de 5 s para consultas y menos de 10 s para reportes en PDF/Excel. |
| **02  Rendimiento** | Concurrencia | Soporte para el acceso simultáneo de los servidores públicos evaluados conectados a la red institucional de la FGE Yucatán. |
| **03 Seguridad** | Control de acceso y autenticação | Autenticación por credenciales y control de acceso basado en roles (Directora de Administración con gestión/resultados y usuarios limitados). |
| **04 Seguridad** | Restricción de red | Restricción de acceso exclusivo desde equipos conectados a la red institucional de la FGE Yucatán, bajo sus políticas y protocolos. |
| **05 Seguridad** | Integridad y validación | Validación de entradas, bloqueo de modificaciones en evaluaciones ya enviadas, respaldos y cumplimiento normativo institucional. |
| **06 Fiabilidad** | Persistencia de datos | Conservación de respuestas registradas y prevención de pérdida o duplicación de datos ante errores de red o del sistema. |
| **07 Fiabilidad** | Historial de procesos | Mantenimiento y consulta disponible de los registros históricos de evaluaciones desde la puesta en marcha. |
| **08 Disponibilidad** | Operatividad | Disponibilidad mínima del 99% durante el periodo de evaluación, con mantenimientos programados fuera del horario operativo. |
| **09 Disponibilidad** | Recuperación ante fallas | Recuperación automática del servicio en un tiempo máximo de 30 minutos ante fallas internas. |
| **10 Mantenibilidad** | Soporte y gestión | Mantenimiento técnico a cargo del equipo de desarrollo y tareas operativas o estadísticas periódicas gestionadas por el administrador. |
| **11 Portabilidad** | Despliegue y arquitectura | Arquitectura basada en estándares web abiertos y componentes independientes, desplegable en la infraestructura de servidores de la Fiscalía. |
| **12 Interfaces Externas** | Interfaz de Usuario | Pantallas de inicio de sesión, principal, evaluación, autoevaluación, resultados y administración, apegadas al estilo, colores y tipografía de la Institución. |
| **13 Interfaces Externas** | Interfaz de Hardware | Operación en equipos de cómputo estándar conectados a la red institucional de la FGE Yucatán mediante teclado, mouse y monitor. |
| **14 Interfaces Externas** | Interfaz de Software | Compatibilidad con el SGBD institucional para almacenamiento/recuperación y soporte de software para archivos PDF y Excel. |
| **15 Interfaces Externas** | Interfaz de Comunicación | Uso exclusivo de la intranet y protocolos de red de la FGE Yucatán para el intercambio seguro de datos entre estaciones y servidor. |