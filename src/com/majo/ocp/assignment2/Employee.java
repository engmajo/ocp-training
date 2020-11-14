package com.majo.ocp.assignment2;

public class Employee {
    int id;
    String name;

    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void printEmployee(Integer integer, Employee employee) {

        System.out.println(employee.toString());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void printEmployee() {

        System.out.println(toString());
    }
}
