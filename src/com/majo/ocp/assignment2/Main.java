package com.majo.ocp.assignment2;

import java.util.Map;
import java.util.Optional;
import java.util.function.BiFunction;

public class Main {

    private static final EmployeeService employeeService = new EmployeeService();

    public static void main(String[] args) {
        testOptional(Optional.empty());
        testOptional(Optional.of("Mohammad"));
        ////////////////
        testBiFunction();
        //////////////////
        testMapMerge();
        testComputeIfPresent();
        testPutIfAbsent();
        //////////////////
        testStaticMethodReferences();
        testConstructorMethodReferences();
        testObjectReferences();
    }

    public static void testOptional(Optional<String> stringOptional) {

        if (stringOptional.isPresent()) {
            System.out.println(stringOptional);
        }
    }

    public static void testBiFunction() {

        BiFunction<Integer, Integer, Integer> biFunction = Integer::sum;
        Integer result = biFunction.apply(2, 3);
        System.out.println(result);
    }

    public static void testMapMerge() {

        Map<Integer, Employee> employees = employeeService.getEmployees();
        Employee mergeEmployee1 = new Employee(1, "TEST");
        employees.merge(mergeEmployee1.getId(), mergeEmployee1, (v1, v2) -> new Employee(v1.getId(), v2.getName()));
        Employee mergeEmployee2 = new Employee(5, "TEST");
        employees.merge(mergeEmployee2.getId(), mergeEmployee2, (v1, v2) -> new Employee(v1.getId(), v2.getName()));
        employees.forEach(Employee::printEmployee);
    }

    public static void testComputeIfPresent() {

        Map<Integer, Employee> employees = employeeService.getEmployees();
        employees.computeIfPresent(1,
                (key, val) -> new Employee(key, val.getName() + " - Updated"));
        employees.computeIfPresent(5,
                (key, val) -> new Employee(key, val.getName() + " - Updated"));
        System.out.println(employees);
    }

    public static void testPutIfAbsent() {

        Map<Integer, Employee> employees = employeeService.getEmployees();
        employees.putIfAbsent(1, new Employee(1, "TEST"));
        employees.putIfAbsent(5, new Employee(5, "TEST"));
        System.out.println(employees);
    }

    public static void testStaticMethodReferences() {

        Map<Integer, Employee> employees = employeeService.getEmployees();
        employees.forEach(Employee::printEmployee);
    }

    public static void testConstructorMethodReferences() {

        Map<Integer, Employee> employees = employeeService.getEmployees();
        EmployeeCreator employeeCreator = Employee::new;
        Employee employee = employeeCreator.create(9, "TTTTTT");
        employees.putIfAbsent(9, employee);
        employees.forEach(Employee::printEmployee);
    }

    public static void testObjectReferences() {

        Map<Integer, Employee> employees = employeeService.getEmployees();
        PrintableEmployee printableEmployee = Employee::printEmployee;
        employees.forEach((key, val) -> printableEmployee.print(val));
    }
}
