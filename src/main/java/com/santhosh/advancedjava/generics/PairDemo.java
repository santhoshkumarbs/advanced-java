package com.santhosh.advancedjava.generics;

public class PairDemo {
    public static void main(String[] args) {
        Pair<Integer> integerPair = new Pair<>(1, 4);
        Pair<Integer> swap = integerPair.swap(integerPair.getFirst(), integerPair.getSecond());
        System.out.println(swap);

        Pair<Integer> pair2 = new Pair<>(5, 7);
        Pair.swap(pair2);
        System.out.println(pair2);

    }
}
