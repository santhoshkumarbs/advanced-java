package com.santhosh.advancedjava.interfaces;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Objects;

// When this class doesn't implement an interface, it's not possible to sort this.
// So interface is like adding a small piece of functionality. Analogy: If classes & superclasses are
// considered a top view & bottom view of an object(e.g. cube) suspended in space, then interfaces are like side view
public class Task implements Comparable<Task> {
    private int id;
    private String name;
    private LocalDate startDate = LocalDate.now();
    private LocalDate endDate = LocalDate.now();
    private int priority;
    private boolean completed;

    public Task() {
    }

    public Task(int id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", priority=" + priority +
                ", completed=" + completed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id &&
                priority == task.priority &&
                completed == task.completed &&
                Objects.equals(name, task.name) &&
                Objects.equals(startDate, task.startDate) &&
                Objects.equals(endDate, task.endDate);
    }

    // Hash is an integer representation of an object. It helps with faster lookup
    @Override
    public int hashCode() {
        return Objects.hash(id, name, startDate, endDate, priority, completed);
    }

    @Override
    public int compareTo(Task task) {
        return name.compareTo(task.name);
    }

}
