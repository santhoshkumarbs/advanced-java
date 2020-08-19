package com.santhosh.advancedjava.oop;

import java.time.LocalDate;

public abstract class Employee {
    public static final String DEFAULT_NAME = "UNKNOWN";
    private static Integer NEXT_ID = 0;

    private Integer id;
    private String name;
    private LocalDate hireDate;

    public Employee() {
        this(DEFAULT_NAME);
    }

    public Employee(String name) {
        this.id = NEXT_ID++;
        this.name = name;
        this.hireDate = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public abstract double getPay();

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }
}
