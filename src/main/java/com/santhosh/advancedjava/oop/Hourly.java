package com.santhosh.advancedjava.oop;

public class Hourly extends Employee {
    public static double DEFAULT_RATE = 100;
    public static double DEFAULT_HOURS = 80;

    private double rate;
    private double hours;

    public Hourly() {
        this(DEFAULT_NAME, DEFAULT_RATE, DEFAULT_HOURS);
    }

    public Hourly(String name) {
        this(name, DEFAULT_RATE, DEFAULT_HOURS);
    }

    public Hourly(String name, double rate, double hours) {
        super(name);
        this.rate = rate;
        this.hours = hours;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double getPay() {
        return rate * hours;
    }
}
