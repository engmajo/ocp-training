package com.majo.ocp.assignment2;

import java.util.HashMap;
import java.util.Map;

public class EmployeeService {

    public Map<Integer, Employee> getEmployees() {

        Map<Integer, Employee> employeeMap = new HashMap<>();
        Employee employee1 = new Employee(1, "Mohammad");
        employeeMap.put(employee1.getId(), employee1);
        Employee employee2 = new Employee(2, "Ali");
        employeeMap.put(employee2.getId(), employee2);
        Employee employee3 = new Employee(3, "Yousef");
        employeeMap.put(employee3.getId(), employee3);
        Employee employee4 = new Employee(4, "Ajo");
        employeeMap.put(employee4.getId(), employee4);
        return employeeMap;
    }
}
