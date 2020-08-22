package com.santhosh.advancedjava.generics.wildcards;

public class Salaried extends Employee {
    private static final int DEFAULT_SALARY = 12000;

    private int salary;

    public Salaried(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public Salaried(String name) {
        this(name, DEFAULT_SALARY);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Salaried{" +
                "salary=" + salary +
                "} " + super.toString();
    }
}
