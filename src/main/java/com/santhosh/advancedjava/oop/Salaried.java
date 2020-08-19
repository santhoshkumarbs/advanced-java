package com.santhosh.advancedjava.oop;

public class Salaried extends Employee {
    public static double DEFAULT_SALARY = 120000.00;

    private double salary = DEFAULT_SALARY;

    public Salaried() {}

    public Salaried(String name) {
        this(name, DEFAULT_SALARY);
    }

    public Salaried(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getPay() {
        return this.salary/24;
    }
}
