package com.github.mathan26.concepts.ThreadExample.FutureAndCallableExample;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureAndCallableExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> callable = () -> {    // Callable is similar like runnable
            // Perform some computation         //But is return the result as we needed.
            System.out.println("Entered Callable");
            Thread.sleep(2000);
            return "Hello from Callable";
        };

        System.out.println("Submitting Callable");
        Future<String> future = executorService.submit(callable); //Future is just like that promise
        //It hold the result of callable
        // This line executes immediately
        System.out.println("Do something else while callable is getting executed");

        System.out.println("Retrieve the result of the future");
        // Future.get() blocks until the result is available
        String result = future.get();   //get the result from the future ,checked exception
        System.out.println(result);

        executorService.shutdown();
    }
}
