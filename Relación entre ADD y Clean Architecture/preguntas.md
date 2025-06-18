# Preguntas


## 1. ¿Qué es Attribute-Driven Design (ADD) y cuál es su propósito en el diseño de software?

**Attribute-Driven Design (ADD)** es un enfoque sistemático para diseñar arquitecturas de software que parte de los **atributos de calidad** (como rendimiento, seguridad, mantenibilidad, etc.) como principal motor de decisiones. Su propósito es construir una arquitectura que no solo satisfaga los requerimientos funcionales, sino que **cumpla explícitamente los atributos no funcionales** que son críticos para el éxito del sistema.

---

## 2. ¿Cómo se relaciona ADD con Clean Architecture en el proceso de diseño de sistemas?

ADD define **qué necesidades arquitectónicas** debe cumplir el sistema, mientras que **Clean Architecture define cómo organizar el código** para satisfacer esas necesidades. En conjunto:

- **ADD guía el diseño** basado en atributos como escalabilidad, disponibilidad o mantenibilidad.
- **Clean Architecture proporciona una estructura modular y desacoplada** que permite implementar esas decisiones de forma sostenible y adaptable.

---

## 3. ¿Cuáles son los pasos principales del método ADD para definir una arquitectura de software?

1. **Identificar estímulos y atributos de calidad clave.**
2. **Seleccionar patrones arquitectónicos base** que puedan satisfacer los atributos identificados.
3. **Dividir el sistema en módulos o responsabilidades principales.**
4. **Asignar responsabilidades a cada módulo y definir interfaces.**
5. **Identificar dependencias y restricciones tecnológicas.**
6. **Refinar la arquitectura en pasos iterativos** (bottom-up o top-down).
7. **Documentar las decisiones arquitectónicas** y justificarlas según los atributos de calidad.

---

## 4. ¿Cómo se identifican los atributos de calidad en ADD y por qué son importantes?

Los atributos de calidad se identifican a través de:

- Revisión de los requerimientos del negocio y del sistema.
- Análisis de partes interesadas (stakeholders).
- Uso de escenarios de calidad (ej. “el sistema debe responder en menos de 1 segundo”).

Son importantes porque **influyen directamente en las decisiones arquitectónicas**, como la elección de patrones, frameworks, lenguajes o separación de servicios. Cumplir con ellos asegura que el sistema no solo funcione, sino que sea confiable, eficiente y mantenible.

---

## 5. ¿Por qué Clean Architecture complementa ADD en la implementación de una solución?

Clean Architecture complementa ADD porque:

- Ofrece una **estructura modular, desacoplada y adaptable**, ideal para cumplir atributos como mantenibilidad y testabilidad.
- Permite aplicar las **decisiones arquitectónicas tomadas en ADD** de forma consistente en el código.
- Separa los intereses técnicos y de negocio, lo que facilita ajustar la infraestructura sin comprometer la lógica principal.

---

## 6. ¿Qué criterios se deben considerar al definir las capas en Clean Architecture dentro de un proceso ADD?

- **Separación de responsabilidades**: cada capa debe tener una función clara y única.
- **Aislamiento de tecnología**: la lógica de negocio no debe depender de frameworks o bases de datos.
- **Facilidad de prueba y mantenimiento**: diseño que favorezca pruebas unitarias y cambios controlados.
- **Compatibilidad con atributos de calidad**: las capas deben contribuir a cumplir requisitos como rendimiento, escalabilidad o seguridad.

---

## 7. ¿Cómo ADD ayuda a tomar decisiones arquitectónicas basadas en necesidades del negocio?

ADD traduce las **necesidades del negocio** en **atributos de calidad**, que luego se convierten en **requisitos arquitectónicos concretos**. Esto permite tomar decisiones como:

- Usar microservicios si se requiere escalabilidad y despliegue independiente.
- Priorizar la modularidad si se requiere mantenibilidad.
- Introducir colas de mensajes si se requiere resiliencia y desacoplamiento.

---

## 8. ¿Cuáles son los beneficios de combinar ADD con Clean Architecture en un sistema basado en microservicios?

- **Alineación con los objetivos del negocio**, gracias a ADD.
- **Estructura limpia y desacoplada** para cada microservicio, gracias a Clean Architecture.
- **Facilidad de evolución tecnológica**, con bajo impacto en la lógica de negocio.
- **Escalabilidad y resiliencia**, al separar bien las responsabilidades e interfaces.
- **Mejor gestión del cambio y mantenimiento** en cada servicio.

---

## 9. ¿Cómo se asegura que la arquitectura resultante cumpla con los atributos de calidad definidos en ADD?

- **Definiendo escenarios medibles** para cada atributo de calidad.
- **Documentando las decisiones arquitectónicas** y cómo se relacionan con los atributos.
- **Aplicando revisiones técnicas** (peer reviews, auditorías) enfocadas en esos atributos.
- **Realizando pruebas de rendimiento, seguridad, disponibilidad**, etc., desde fases tempranas.

---

## 10. ¿Qué herramientas o metodologías pueden ayudar a validar una arquitectura diseñada con ADD y Clean Architecture?

- **ATAM (Architecture Tradeoff Analysis Method)**: para evaluar cómo la arquitectura satisface los atributos de calidad.
- **ADR (Architecture Decision Records)**: para documentar decisiones arquitectónicas y su justificación.
- **Pruebas automatizadas** (unitarias, integración, carga).
- **Modelado con C4 Model o ArchiMate**: para visualizar la arquitectura.
- **SonarQube y linters**: para verificar calidad del código.
- **CI/CD pipelines** con validaciones automáticas de arquitectura.

---
