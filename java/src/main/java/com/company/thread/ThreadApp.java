package com.company.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadApp {

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Executando " + Thread.currentThread().getName());
        Callable<String> callable = () -> "";
        Future<String> future = null;
        CompletableFuture<String> s = null;
        CompletableFuture<Integer> integerCompletableFuture =
                s.thenApplyAsync(a -> Integer.parseInt(a));

    }
}
