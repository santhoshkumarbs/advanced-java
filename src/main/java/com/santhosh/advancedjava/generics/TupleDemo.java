package com.santhosh.advancedjava.generics;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class TupleDemo {
    public static void main(String[] args) {
        Tuple<String, Integer> tuple1 = new Tuple<>("Santhosh", 1990);
        Tuple<LocalDate, List<Integer>> tuple2 = new Tuple<>(LocalDate.now(), Arrays.asList(1, 2, 3, 4, 5));

        tuple2.getSecond().forEach(System.out::println);
    }
}
