package com.santhosh.advancedjava.oop;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class HR {

    // Abstract class is used to have a collection of super types. It contains number of instances
    // to iterate over & invoke the common method from super type.
    private List<Employee> employees = new ArrayList<>();

    public void hire(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void printEverybody() {
        employees.forEach(System.out::println);
    }

    //NumberFormat.getCurrencyInstance is a type of factory method => something is initialised somewhere & we are going through a method to do it.
    // NumberFormat is also an example of abstract class
    public void payEverybody() {
        for(Employee employee : employees) {
            System.out.printf("Pay %s %s%n", employee.getName(), NumberFormat.getCurrencyInstance().format(employee.getPay()));
        }
    }
}
