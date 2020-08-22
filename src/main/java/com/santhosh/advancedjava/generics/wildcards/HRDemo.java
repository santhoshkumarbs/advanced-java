package com.santhosh.advancedjava.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class HRDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Salah"));
        employees.add(new Employee("Milner"));

        HR.printAllEmployees(employees);

        List<Salaried> salarieds = new ArrayList<>();
        salarieds.add(new Salaried("Robertson"));
        salarieds.add(new Salaried("Van Dijk"));

        HR.printAllEmployees(salarieds);

        HR.printAllFiltered(employees, e -> e.toString().length() % 2 == 0);
        HR.printAllFiltered(salarieds, e -> e.toString().length() % 2 == 0);

        //PECS -> Produces means use extends, Consumes means use super
    }
}
