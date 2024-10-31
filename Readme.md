# README.md

## Serenity BDD E2E Shopping Flow Test

### Descripción
Este proyecto contiene una prueba E2E automatizada para verificar el flujo de compra en el sitio web [OpenCart](http://opencart.abstracta.us/). La prueba simula la selección y adición de productos al carrito, visualización del carrito, y el flujo de checkout como invitado hasta la confirmación de la orden.

### Requisitos
- **Java 17** o superior.
- **Maven** (si deseas ejecutar el proyecto con `mvn`).
- **Gradle** (si deseas ejecutar el proyecto con `gradle`).
- **Chrome** o **Firefox** instalados en el sistema.

### Configuración

1. **Clonar el repositorio**:
   ```bash
   git clone <https://github.com/kadmel777/reto---Bdd.git>
   cd <RetoBp>

2. **Instalar dependencias:**
   - Con Maven:
      ```bash
      mvn clean install

   - Con Gradle:
      ```bash 
      gradle clean build

### Ejecución de las pruebas
Hay dos formas principales de ejecutar las pruebas:

1. **Usando la clase de prueba CucumberTestSuite en el IDE:**

   - Abre el proyecto en tu IDE.
   - Busca la clase CucumberTestSuite en el paquete de pruebas.
   - Haz clic derecho en la clase y selecciona **Run CucumberTestSuite** para ejecutar las pruebas.

2. **Ejecutar desde la línea de comandos:**

   - Con Maven:
      ```bash
      mvn clean verify
  
   - Con Gradle:
      ```bash
      gradle clean test

### Ejecución en diferentes navegadores
Por defecto, las pruebas se ejecutan en Chrome. Para ejecutarlas en Firefox, puedes especificar el navegador utilizando el parámetro driver.

   - **Ejecutar en Firefox** con Maven:
      ```bash
      mvn clean verify -Ddriver=firefox
   - **Ejecutar en Firefox** con Gradle:
      ```bash
      gradle clean test -Pdriver=firefox

### Resultados de las pruebas
Los resultados y reportes generados por Serenity estarán en la carpeta target/site/serenity después de la ejecución de las pruebas. Puedes abrir el archivo index.html dentro de esta carpeta para visualizar los reportes de forma detallada.
