# LinkedList en Java

## Descripción

Este proyecto tiene como objetivo demostrar el funcionamiento de `LinkedList` en Java mediante un ejemplo práctico de una lista de reproducción musical. A través del programa, se muestran las principales operaciones que se pueden realizar con esta estructura de datos, desde agregar y eliminar elementos hasta consultar su contenido.

El proyecto complementa una presentación teórica sobre `LinkedList`, sus características, métodos principales, ventajas y diferencias con `ArrayList`.

## ¿Qué es LinkedList?

`LinkedList` es una clase de Java que permite almacenar una colección dinámica de elementos mediante una estructura de nodos enlazados. Cada nodo mantiene referencias a sus elementos vecinos, lo que permite recorrer la lista en ambas direcciones.

Esta clase pertenece al paquete `java.util` y resulta útil cuando se necesita modificar una colección de datos durante la ejecución del programa.

## Características principales

* **Tamaño dinámico:** permite agregar o eliminar elementos sin establecer una capacidad fija al crear la lista.
* **Lista doblemente enlazada:** cada nodo contiene referencias al elemento anterior y al siguiente.
* **Inserción y eliminación:** facilita estas operaciones, especialmente al principio y al final de la lista.
* **Acceso por posición:** permite consultar elementos mediante índices, aunque puede requerir recorrer los nodos.

## Métodos utilizados

| Método       | Descripción                                    |
| ------------ | ---------------------------------------------- |
| `add()`      | Agrega un elemento al final de la lista.       |
| `addFirst()` | Inserta un elemento al principio.              |
| `getFirst()` | Obtiene el primer elemento.                    |
| `getLast()`  | Obtiene el último elemento.                    |
| `remove()`   | Elimina un elemento de la lista.               |
| `size()`     | Devuelve la cantidad de elementos almacenados. |

## Funcionamiento del programa

El programa simula una lista de reproducción musical y realiza las siguientes operaciones:

1. Crea una lista vacía de canciones.
2. Agrega varias canciones utilizando `add()`.
3. Inserta una canción al principio mediante `addFirst()`.
4. Muestra las canciones recorriendo la lista con ciclos `for`.
5. Consulta la primera y la última canción.
6. Elimina una canción específica.
7. Muestra la lista actualizada y la cantidad total de canciones.

## Ejemplo de ejecución

```text
=== LISTA DE REPRODUCCION ===
1. Long Drives
2. Blurry Nights
3. Toxic
4. Understand

Primera canción: Long Drives
Última canción: Understand

=== LISTA ACTUALIZADA ===
- Long Drives
- Blurry Nights
- Understand

Total de canciones: 3
```

## Requisitos

* Tener instalado el **Java Development Kit (JDK)**.
* Contar con un editor de código o entorno de desarrollo, como Visual Studio Code.
* Tener conocimientos básicos de variables, listas y ciclos en Java.

## Cómo ejecutar el proyecto

1. Guarda el código en un archivo llamado `Main.java`.

2. Abre una terminal en la carpeta donde se encuentra el archivo.

3. Compila el programa:

   ```bash
   javac Main.java
   ```

4. Ejecuta el programa:

   ```bash
   java Main
   ```

## LinkedList vs. ArrayList

Ambas clases permiten almacenar colecciones dinámicas, pero tienen diferencias importantes. `LinkedList` puede resultar conveniente cuando se realizan inserciones y eliminaciones frecuentes en los extremos, mientras que `ArrayList` suele ser más eficiente cuando se necesita acceder repetidamente a elementos mediante su índice.

La elección depende de las operaciones que predominen en el programa.

## Conclusión

`LinkedList` es una estructura de datos útil para administrar colecciones que cambian durante la ejecución. Este proyecto permite comprender sus métodos principales mediante un ejemplo sencillo y práctico, mostrando cómo agregar, consultar, eliminar y recorrer elementos en Java.

---

**Tecnología utilizada:** Java
**Tema:** Estructuras de datos — `LinkedList`
**Proyecto:** Ejemplo práctico de una lista de reproducción musical
