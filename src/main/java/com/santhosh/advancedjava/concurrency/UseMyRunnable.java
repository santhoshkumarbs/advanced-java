package com.santhosh.advancedjava.concurrency;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UseMyRunnable {
    public static void main(String[] args) {
        List<MyRunnable> myRunnables = Stream.iterate(0, n -> n + 1)
                .map(MyRunnable::new)
                .limit(10)
                .collect(Collectors.toList());

        myRunnables.forEach(MyRunnable::start);
    }
}
