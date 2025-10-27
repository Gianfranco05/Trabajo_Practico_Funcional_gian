Trabajo Práctico de Programación Funcional con Java Streams
Este repositorio contiene la resolución de un trabajo práctico para la materia de Programación III de la Tecnicatura Universitaria en Programación de la UTN. 
### Canciani Gianfranco

# 📋 Descripción de los Ejercicios
El trabajo práctico se divide en cuatro casos de estudio, cada uno con su propia clase de entidad y una serie de requerimientos para manipular una colección de objetos.

### 1. Caso Práctico: Alumno
Se trabaja con una lista de objetos Alumno, que tienen los atributos nombre, nota y curso. Las operaciones resueltas son:

Filtrar alumnos aprobados (nota ≥ 7), obtener sus nombres en mayúsculas y ordenarlos.

Calcular la nota promedio de todos los alumnos.

Agrupar a los alumnos según el curso al que pertenecen.

Obtener las 3 notas más altas de la lista.

### 2. Caso Práctico: Producto
Se manipula una colección de Producto con los atributos nombre, categoria, precio y stock. Las operaciones resueltas son:

Listar productos con un precio superior a 100, ordenados de mayor a menor precio.

Agrupar los productos por categoría y calcular el stock total para cada una.

Generar un único String con el formato nombre;precio para cada producto.

Calcular el precio promedio general y también el promedio por categoría.

### 3. Caso Práctico: Libro
Se procesa una lista de objetos Libro con los atributos titulo, autor, paginas y precio. Las operaciones resueltas son:

Obtener los títulos de los libros que tienen más de 300 páginas, ordenados alfabéticamente.

Calcular el promedio de páginas entre todos los libros.

Agrupar los libros por autor y contar cuántos libros ha escrito cada uno.

Encontrar el libro con el precio más alto de la colección.

### 4. Caso Práctico: Empleado
Se trabaja con una lista de Empleado con los atributos nombre, departamento, salario y edad. Las operaciones resueltas son:

Obtener una lista de empleados que ganan más de 2000, ordenados por salario de forma descendente.

Calcular el salario promedio de todos los empleados.

Agrupar a los empleados por departamento y obtener la suma total de salarios para cada uno.

Encontrar los nombres de los dos empleados más jóvenes.

# ⚙️ Requisitos
Para compilar y ejecutar los ejercicios, solo necesitas:

Tener instalado el JDK (Java Development Kit) en tu sistema (versión 8 o superior).

Un IDE como IntelliJ IDEA.

# ▶️ Cómo Ejecutar con IntelliJ IDEA
Cada caso práctico se encuentra en su propio archivo .java. Para ejecutar un ejercicio utilizando IntelliJ IDEA, sigue estos pasos:

Abrir el Proyecto: Abre la carpeta que contiene los archivos .java en IntelliJ IDEA (File > Open...).

Seleccionar un Archivo: En el panel del explorador de proyectos (generalmente a la izquierda), haz doble clic en el archivo que deseas ejecutar (por ejemplo, CasoPracticoAlumnos.java).

Ejecutar el Código: Busca la línea public static void main(String[] args). Verás un ícono de reproducción verde (▶️) en el margen izquierdo, al lado del número de línea. Haz clic en ese icono.

Elegir 'Run': En el menú que aparece, selecciona la opción que dice "Run 'CasoPracticoAlumnos.main()'".

Revisar la Salida: La salida del programa se mostrará en la ventana de "Run" en la parte inferior de IntelliJ IDEA.
