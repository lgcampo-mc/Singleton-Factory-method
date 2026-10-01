# Taller de Patrones de Diseño: Singleton y Factory Method

Este repositorio contiene la implementación en Java de los patrones de diseño **Singleton** y **Factory Method**, desarrollado para la asignatura de Programación III.

## Integrantes (Grupo 1)
* Luis Gabriel Campo Núñez
* Víctor Canos Chavarría
* Líbardo Hernández Vega

## Eje de Contraste
El análisis se centra en el **Control de la creación: instancia única frente a delegación del tipo que se instancia**.

## Estructura del Proyecto
El proyecto está dividido en cuatro ejemplos principales, mostrando una versión con defectos de diseño y su respectiva versión corregida:
1. `Singleton_Inicial`
2. `Singleton_Refactorizada`
3. `Factory_Method_Inicial`
4. `Factory_Method_Refactorizada`

## Instrucciones de Ejecución

Este proyecto fue desarrollado utilizando un IDE de Java, pero también puede ejecutarse desde la terminal.

### Opción 1: Ejecución desde un IDE (Recomendado)
1. Clona este repositorio o descarga el código fuente.
2. Abre la carpeta del proyecto en tu IDE favorito.
3. Navega hasta la carpeta `src`.
4. Abre la clase `Main.java` correspondiente a la versión que deseas probar.
5. Ejecuta el archivo directamente desde el entorno.

### Opción 2: Ejecución desde la terminal
Asegúrate de tener instalado el JDK. Abre una terminal en la carpeta raíz del proyecto y ejecuta los siguientes comandos:

**Para compilar todos los archivos:**
`javac -d out src/*/*.java`

**Para ejecutar cada versión:**

*   **Singleton Inicial:**
    `java -cp out Singleton_Inicial.Main`

*   **Singleton Refactorizada:**
    `java -cp out Singleton_Refactorizada.Main`

*   **Factory Method Inicial:**
    `java -cp out Factory_Method_Inicial.Main`

*   **Factory Method Refactorizada:**
    `java -cp out Factory_Method_Refactorizada.Main`