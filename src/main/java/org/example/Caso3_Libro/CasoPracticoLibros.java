package org.example.Caso3_Libro;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CasoPracticoLibros {
    public static void main(String[] args) {
        List<Libro> libros = Arrays.asList(
                new Libro("El Quijote", "Cervantes", 863, 25.50),
                new Libro("Clean Code", "Robert Martin", 464, 35.00),
                new Libro("The Pragmatic Programmer", "Andy Hunt", 320, 40.00),
                new Libro("Cien Años de Soledad", "García Márquez", 417, 22.00),
                new Libro("Effective Java", "Joshua Bloch", 250, 30.00)
        );

        // 1. Listar títulos de libros con más de 300 páginas, ordenados alfabéticamente.
        System.out.println("1. Títulos de libros con más de 300 páginas:");
        List<String> titulosLargos = libros.stream()
                .filter(l -> l.getPaginas() > 300)
                .map(Libro::getTitulo)
                .sorted()
                .collect(Collectors.toList());
        titulosLargos.forEach(System.out::println);

        // 2. Calcular el promedio de páginas de todos los libros.
        System.out.println("\n2. Promedio de páginas:");
        double promedioPaginas = libros.stream()
                .mapToInt(Libro::getPaginas)
                .average()
                .orElse(0.0);
        System.out.println(promedioPaginas);

        // 3. Agrupar libros por autor y contar cuántos tiene cada uno.
        System.out.println("\n3. Cantidad de libros por autor:");
        Map<String, Long> librosPorAutor = libros.stream()
                .collect(Collectors.groupingBy(Libro::getAutor, Collectors.counting()));
        librosPorAutor.forEach((autor, count) -> System.out.println(autor + ": " + count));

        // 4. Obtener el libro más caro.
        System.out.println("\n4. Libro más caro:");
        Optional<Libro> libroMasCaro = libros.stream()
                .max(Comparator.comparing(Libro::getPrecio));
        libroMasCaro.ifPresent(System.out::println);
    }
}