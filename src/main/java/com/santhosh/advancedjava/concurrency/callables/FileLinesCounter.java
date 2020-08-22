package com.santhosh.advancedjava.concurrency.callables;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class FileLinesCounter {
    private Path dir = Paths.get("D:","IdeaProjects","advanced-java","src", "main", "java", "com","santhosh", "advancedjava","concurrency");

    public long computeTotalNumberOfLines() {
        long totalLines = 0;
        try {
            totalLines = executeCounters().stream()
                    .mapToLong(this::extractValueFromFuture)
                    .sum();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return totalLines;
    }

    private <T> T extractValueFromFuture(Future<T> future) {
        T val = null;
        try {
            val = future.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        return val;
    }

    private List<Future<Long>> executeCounters() throws IOException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        List<Future<Long>> futures = service.invokeAll(getFileLineCounters());
        service.shutdown();
        return futures;
    }

    private List<Callable<Long>> getFileLineCounters() throws IOException {
        return Files.list(dir)
                .filter(Files::isRegularFile)
                .map(this::getLinesInFile)
                .collect(Collectors.toList());
    }

    private Callable<Long> getLinesInFile(Path p) {
        return () -> {
            long count = Files.lines(p).count();
            System.out.println(String.format("File %s has %d lines. Running Thread: %s", p, count, Thread.currentThread().getName()));
            return count;
        };
    }

    public static void main(String[] args) {
        FileLinesCounter demo = new FileLinesCounter();
        System.out.printf("Total number of lines: %d%n",
                demo.computeTotalNumberOfLines());
    }
}
