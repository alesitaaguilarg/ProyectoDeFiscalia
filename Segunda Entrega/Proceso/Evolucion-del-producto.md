# Resumen de Evolución del Producto (Primera a Segunda Entrega)

Este documento detalla los cambios, mejoras y artefactos completados por el equipo de trabajo durante la transición entre la primera y la segunda entrega del sistema **SEDFGEY** (Sistema de Evaluación del Desempeño de la Fiscalía General del Estado de Yucatán).

---

## 1. Ingeniería de Requisitos y Refinamiento
* **Reorganización y Priorización:** Se reestructuraron formalmente los Requisitos Funcionales (RF) y No Funcionales (RNF), clasificándolos de acuerdo con su criticidad y valor operativo para la institución.
* **Historias de Usuario y Casos de Uso:** Se refinaron las historias de usuario incorporando criterios de aceptación detallados y verificables. Asimismo, se ampliaron los casos de uso para contemplar flujos alternativos, de excepción y actores involucrados.

## 2. Diseño Arquitectónico y Trazabilidad (MVC)
* **Diagrama de Clases (Nueva Versión):** Se evolucionó el modelado orientado a objetos en UML, definiendo con precisión los atributos, métodos, visibilidad y relaciones estructurales (como la herencia entre `Usuario` y `Administrador`, y las asociaciones con `Evaluacion`, `Indicador` y `Reporte`).
* **Tabla de Correspondencia:** Se implementó una matriz de trazabilidad que cruza los RF y RNF con los componentes del Diagrama de Clases, garantizando que el diseño arquitectónico responda a cada necesidad del sistema.
* **Estructura MVC:** Se estructuraron las bases técnicas para el patrón arquitectónico Modelo-Vista-Controlador (MVC), separando la lógica de negocio, la interfaz y el manejo de datos en paquetes de Java/Maven (`src/main`).

## 3. Gestión de Procesos, Métricas y Calidad
* **Seguimiento con GitHub Projects:** Se utilizó el tablero Kanban del equipo para gestionar el ciclo de vida de las tareas (`Backlog`, `Ready`, `In Progress`, `Done`), vinculando cada avance mediante Pull Requests hacia la rama `Segunda-Entrega`.
* **Bitácoras y Sprints:** Se documentó la planeación del sprint, la distribución de actividades, los roles y las minutas de reuniones con acuerdos y seguimiento de pendientes.
* **Métrica de Contribución Individual:** Se implementó la métrica cuantitativa y objetiva solicitada por la academia para auditar el porcentaje de participación y cumplimiento de tareas de cada integrante en el repositorio.

## 4. Presentación y Competencias
* **Material Audiovisual:** Se integraron las diapositivas de apoyo y la grabación del video de presentación (ajustado al límite de 5 minutos), el cual expone de forma clara la comparativa de avances entre ambas entregas.
* **Argumentación de Competencias:** Se documentó cómo el desarrollo del proyecto promueve las competencias genéricas (trabajo en equipo, control de versiones, autogestión) y específicas (ingeniería de software, modelado UML, arquitectura limpia) del perfil profesional.