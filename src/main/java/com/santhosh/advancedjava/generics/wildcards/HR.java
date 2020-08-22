package com.santhosh.advancedjava.generics.wildcards;

import java.util.List;
import java.util.function.Predicate;

public class HR {

    public static void printAllEmployees(List<? extends Employee> employees) {
        employees.stream()
                .map(Employee::getName)
                .forEach(System.out::println);
    }

    public static void printAllFiltered(List<? extends Employee> employees, Predicate<? super Employee> predicate) {
        for(Employee employee: employees) {
            if(predicate.test(employee)) {
                System.out.println(employee.getName());
            }
        }
    }
}
