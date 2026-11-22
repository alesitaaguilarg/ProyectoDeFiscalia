# Diseño del Sistema

En esta sección se concentran los artefactos de diseño arquitectónico y modelado orientado a objetos del sistema **SEDFGEY**, iterados a partir de la retroalimentación y el refinamiento de requisitos de la primera entrega.

## Criterios de Diseño Cubiertos

1. **Proceso de Abstracción e Iteración:** Se refinó el Diagrama de Clases definiendo con mayor claridad las responsabilidades de cada entidad, sus atributos, métodos y las relaciones entre clases (asociación, agregación, composición y herencia/implementación).
2. **Trazabilidad y Verificación (RF/RNF):** Se construyó una matriz de correspondencia que vincula cada Requisito Funcional y No Funcional con las clases específicas del diseño que los satisfacen, garantizando que ningún requerimiento quede sin cobertura arquitectónica.
3. **Patrón Arquitectónico MVC:** El diseño de clases se alinea directamente con la implementación en código dentro del directorio [`src/main`](../../src/main), separando la lógica de negocio y entidades (**Modelo**), la interfaz de interacción (**Vista**) y la gestión de eventos/flujo (**Controlador**).

## Artefactos de la Carpeta

| Archivo | Descripción Detallada |
| :--- | :--- |
| [**Diagrama de Clases**](./Diagrama-de-clases.md) | Modelo UML actualizado de las clases del sistema, detallando atributos, métodos, visibilidad y relaciones estructurales. |
| [**Correspondencia de Requisitos**](./Correspondencia_Requisitos.md) | Tabla de verificación y trazabilidad que cruza los RF y RNF con las clases y métodos diseñados en el Diagrama de Clases. |
| [**Implementación en Código (MVC)**](../../src/main) | Acceso directo a los paquetes del proyecto donde se materializa el diseño en clases de Java. |