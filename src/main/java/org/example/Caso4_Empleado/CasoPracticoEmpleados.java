package org.example.Caso4_Empleado;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CasoPracticoEmpleados {
    public static void main(String[] args) {
        List<Empleado> empleados = Arrays.asList(
                new Empleado("Carlos", "Desarrollo", 2500, 30),
                new Empleado("Ana", "RRHH", 1800, 25),
                new Empleado("Lucia", "Desarrollo", 3000, 35),
                new Empleado("Jorge", "Ventas", 2200, 28),
                new Empleado("Marta", "Ventas", 1900, 22)
        );
        // 1. Lista de empleados con salario > 2000, ordenados por salario descendente.
        System.out.println("1. Empleados con salario mayor a 2000:");
        List<Empleado> empleadosSalarioAlto = empleados.stream()
                .filter(e -> e.getSalario() > 2000)
                .sorted(Comparator.comparingDouble(Empleado::getSalario).reversed())
                .collect(Collectors.toList());
        empleadosSalarioAlto.forEach(System.out::println);

        // 2. Calcular el salario promedio general.
        System.out.println("\n2. Salario promedio general:");
        double salarioPromedio = empleados.stream()
                .mapToDouble(Empleado::getSalario)
                .average()
                .orElse(0.0);
        System.out.println(salarioPromedio);

        // 3. Agrupar empleados por departamento y sumar salarios.
        System.out.println("\n3. Suma de salarios por departamento:");
        Map<String, Double> salariosPorDepto = empleados.stream()
                .collect(Collectors.groupingBy(
                        Empleado::getDepartamento,
                        Collectors.summingDouble(Empleado::getSalario)
                ));
        salariosPorDepto.forEach((depto, suma) -> System.out.println(depto + ": " + suma));

        // 4. Obtener los nombres de los 2 empleados más jóvenes.
        System.out.println("\n4. Nombres de los 2 empleados más jóvenes:");
        List<String> masJovenes = empleados.stream()
                .sorted(Comparator.comparingInt(Empleado::getEdad))
                .limit(2)
                .map(Empleado::getNombre)
                .collect(Collectors.toList());
        masJovenes.forEach(System.out::println);
    }
}