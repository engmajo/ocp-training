package com.majo.ocp.assignment2;

@FunctionalInterface
interface EmployeeCreator {

    Employee create(Integer id, String name);
}
