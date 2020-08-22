package com.santhosh.advancedjava.generics;

public class Pair<T> {
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public Pair<T> swap(T first, T second) {
        return new Pair<>(second, first);
    }

    public static <T> void swap(Pair<T> pair) {
        T temp = pair.first;
        pair.first = pair.second;
        pair.second = temp;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
