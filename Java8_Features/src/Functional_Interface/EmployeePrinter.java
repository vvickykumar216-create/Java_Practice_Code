package Functional_Interface;

// Consumer

import java.util.*;
import java.util.function.Consumer;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeePrinter {
    public static void main(String[] args) {

        // Consumer 1: Employee details print
        Consumer<Employee> printDetails = emp -> {System.out.println("Name: " + emp.name + ", Salary: " + emp.salary);};

        // Employee List
        List<Employee> employees = Arrays.asList(
                new Employee("Vicky", 50000),
                new Employee("Rahul", 60000),
                new Employee("Aman", 45000)
        );

        // forEach() ke andar Consumer use
        employees.forEach(printDetails);

        // Consumer 2: Greeting print
        Consumer<Employee> printGreeting = emp -> {System.out.println("Hello " + emp.name);};

        // andThen() se dono consumers chain
        Consumer<Employee> combined = printDetails.andThen(printGreeting);
        System.out.println("\nAfter andThen():");
        combined.accept(employees.get(0));
    }
}