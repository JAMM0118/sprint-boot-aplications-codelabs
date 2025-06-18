# Preguntas

## 1. ¿Cuál es el propósito principal de Clean Architecture en el desarrollo de software?

El propósito principal de Clean Architecture es organizar el código en capas bien definidas y desacopladas, permitiendo que la lógica de negocio este no este amarrada a los detalles técnicos como frameworks,Api ,bases de datos, etc. De esta manera se facilita la mantenibilidad, escalabilidad y adaptabilidad del software.

---

## 2. ¿Qué beneficios aporta Clean Architecture a un microservicio en Spring Boot?

- **Desacoplamiento** de la lógica de negocio respecto a Spring, JPA, etc.
- **Facilita pruebas unitarias** sin cargar el contexto de Spring.
- **Escalabilidad estructurada** al crecer la lógica de negocio.
- **Claridad en la estructura** del código.

---

## 3. ¿Cuáles son las principales capas de Clean Architecture y qué responsabilidad tiene cada una?


1. **Domain**  
   - Contiene el **modelo de negocio (entidades)**.
   - Define las **reglas de negocio puras** y **sin dependencias externas**.
   - Todo el sistema gira en torno a esta capa.

2. **Application**  
   - Implementa los **casos de uso** del sistema.
   - Orquesta la lógica de negocio usando las entidades del dominio.
   - Llama a interfaces (como repositorios o servicios externos) definidas en el dominio, sin conocer sus implementaciones.

3. **Infrastructure**  
   - Contiene las **implementaciones técnicas** de los contratos definidos en `domain` (repositorios, servicios externos, adaptadores).
   - Incluye detalles como bases de datos (JPA, MongoDB), servicios REST, mensajería, etc.
   - Esta capa **depende de las capas superiores**, pero **nunca al revés**.

4. **Presentation**  
   - Es la **capa de entrada del sistema**, normalmente formada por controladores HTTP (REST, GraphQL, etc.).
   - Se encarga de recibir las solicitudes del usuario, convertirlas en comandos o DTOs, y delegarlas a la capa de `application`.
   - También transforma las respuestas a un formato adecuado para el cliente.
---

## 4. ¿Por qué se recomienda desacoplar la lógica de negocio de la infraestructura en un microservicio?

- Permite reutilizar la lógica de negocio en diferentes contextos.
- Facilita pruebas sin depender de tecnologías externas.
- Permite cambiar tecnologías sin afectar el dominio.
- Evita acoplamientos innecesarios con frameworks o herramientas.

---

## 5. ¿Cuál es el rol de la capa de aplicación y qué tipo de lógica debería contener?

La capa de aplicación ejecuta los casos de uso del sistema. Coordina el flujo de trabajo y la interacción entre entidades, repositorios y servicios externos. No contiene lógica de persistencia ni lógica técnica.

---

## 6. ¿Qué diferencia hay entre un UseCase y un Service en Clean Architecture?

| **UseCase** | **Service** |
|----------------------------------|------------------------------------|
| Orquesta reglas del negocio.     | Implementa tareas técnicas.        |
| Llama a interfaces del dominio.  | Usa tecnologías específicas.        |
| Independiente de frameworks.     | Puede depender de Spring, JPA, etc.|

---

## 7. ¿Por qué se recomienda definir Repositories como interfaces en la capa de dominio en lugar de usar directamente JpaRepository?

- Se abstrae el dominio de la tecnología de persistencia.
- Se permite cambiar la implementación sin afectar la lógica.
- Se facilita el uso de mocks para pruebas.
- Se aplica el principio de inversión de dependencias (D de SOLID).

---

## 8. ¿Cómo se implementa un UseCase en un microservicio con Spring Boot y qué ventajas tiene?

**Pasos para implementarlo:**

1. Definir una interfaz de repositorio en el dominio.
2. Crear el caso de uso que usa dicha interfaz.
3. Implementar el repositorio con JPA en la capa de infraestructura.
4. Inyectar y usar el caso de uso desde un controlador.

**Ventajas:**

- Código independiente de frameworks.
- Lógica de negocio más limpia y testeable.
- Mayor control sobre las dependencias y responsabilidades.

---

## 9. ¿Qué problemas podrían surgir si no aplicamos Clean Architecture en un proyecto de microservicios?

- Acoplamiento alto entre capas.
- Dificultad para realizar pruebas unitarias.
- Complejidad al modificar o escalar funcionalidades.
- Dependencia directa de frameworks en la lógica de negocio.
- Menor reutilización de código y menor claridad estructural.

---

## 10. ¿Cómo Clean Architecture facilita la escalabilidad y mantenibilidad en un entorno basado en microservicios?

**Escalabilidad:**

- Permite escalar servicios sin duplicar lógica de negocio.

**Mantenibilidad:**

- Cada capa tiene responsabilidades claras.
- Cambios en infraestructura no afectan la lógica de negocio.
- El código es más fácil de entender, probar y extender.

---
