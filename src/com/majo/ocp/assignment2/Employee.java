package com.majo.ocp.assignment2;

public class Employee {
    int id;

    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    String name;

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

    public static void printEmployee(Integer integer, Employee employee) {

        System.out.println(employee.toString());
    }
}
