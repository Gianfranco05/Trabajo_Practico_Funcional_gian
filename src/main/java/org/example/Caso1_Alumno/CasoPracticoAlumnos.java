package org.example.Caso1_Alumno;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CasoPracticoAlumnos {
    public static void main(String[] args) {
        List<Alumno> alumnos = Arrays.asList(
                new Alumno("Juan", 8.5, "Java"),
                new Alumno("Maria", 6.2, "Python"),
                new Alumno("Pedro", 9.0, "Java"),
                new Alumno("Ana", 7.8, "C++"),
                new Alumno("Luis", 5.5, "Python"),
                new Alumno("Laura", 9.5, "Java")
        );

        // 1. Obtener nombres de alumnos aprobados (nota >= 7) en mayúsculas y ordenados.
        System.out.println("1. Alumnos aprobados:");
        List<String> aprobados = alumnos.stream()
                .filter(a -> a.getNota() >= 7)
                .map(a -> a.getNombre().toUpperCase())
                .sorted()
                .collect(Collectors.toList());
        aprobados.forEach(System.out::println);

        // 2. Calcular el promedio general de notas.
        System.out.println("\n2. Promedio general de notas:");
        double promedioGeneral = alumnos.stream()
                .mapToDouble(Alumno::getNota)
                .average()
                .orElse(0.0);
        System.out.println(promedioGeneral);

        // 3. Agrupar alumnos por curso.
        System.out.println("\n3. Alumnos agrupados por curso:");
        Map<String, List<Alumno>> alumnosPorCurso = alumnos.stream()
                .collect(Collectors.groupingBy(Alumno::getCurso));
        alumnosPorCurso.forEach((curso, lista) -> System.out.println(curso + ": " + lista));

        // 4. Obtener los 3 mejores promedios (notas).
        System.out.println("\n4. Las 3 mejores notas:");
        List<Double> mejoresNotas = alumnos.stream()
                .map(Alumno::getNota)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());
        mejoresNotas.forEach(System.out::println);
    }
}