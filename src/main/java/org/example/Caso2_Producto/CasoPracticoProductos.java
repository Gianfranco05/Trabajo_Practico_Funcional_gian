package org.example.Caso2_Producto;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CasoPracticoProductos {
    public static void main(String[] args) {
        List<Producto> productos = Arrays.asList(
                new Producto("Laptop", "Electrónica", 1200.50, 10),
                new Producto("Mouse", "Electrónica", 25.00, 50),
                new Producto("Teclado", "Electrónica", 75.99, 30),
                new Producto("Libro Java", "Librería", 45.50, 100),
                new Producto("Silla Gamer", "Muebles", 150.00, 15)
        );
        // 1. Listar productos con precio > 100, ordenados por precio descendente.
        System.out.println("1. Productos con precio mayor a 100:");
        List<Producto> caros = productos.stream()
                .filter(p -> p.getPrecio() > 100)
                .sorted(Comparator.comparing(Producto::getPrecio).reversed())
                .collect(Collectors.toList());
        caros.forEach(System.out::println);

        // 2. Agrupar productos por categoría y calcular el stock total.
        System.out.println("\n2. Stock total por categoría:");
        Map<String, Integer> stockPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(
                        Producto::getCategoria,
                        Collectors.summingInt(Producto::getStock)
                ));
        stockPorCategoria.forEach((cat, stock) -> System.out.println(cat + ": " + stock));

        // 3. Generar un String con "nombre;precio" usando map y joining.
        System.out.println("\n3. String de productos (nombre;precio):");
        String productosString = productos.stream()
                .map(p -> p.getNombre() + ";" + p.getPrecio())
                .collect(Collectors.joining(" | "));
        System.out.println(productosString);

        // 4. Calcular el precio promedio general y por categoría.
        System.out.println("\n4. Precio promedio general:");
        double promedioGeneral = productos.stream()
                .mapToDouble(Producto::getPrecio)
                .average()
                .orElse(0.0);
        System.out.println("General: " + promedioGeneral);

        System.out.println("\nPrecio promedio por categoría:");
        Map<String, Double> promedioPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(
                        Producto::getCategoria,
                        Collectors.averagingDouble(Producto::getPrecio)
                ));
        promedioPorCategoria.forEach((cat, prom) -> System.out.println(cat + ": " + prom));
    }
}