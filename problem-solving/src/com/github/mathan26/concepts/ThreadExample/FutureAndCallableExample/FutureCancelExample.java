package com.github.mathan26.concepts.ThreadExample.FutureAndCallableExample;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureCancelExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        long startTime = System.nanoTime();
        Future<String> future = executorService.submit(() -> {
            Thread.sleep(2000);
            return "Hello from Callable";
        });

        while (!future.isDone()) {
            System.out.println("Task is still not done...");
            Thread.sleep(200);
            double elapsedTimeInSec = (System.nanoTime() - startTime) / 1000000000.0;

            if (elapsedTimeInSec > 1) {
                future.cancel(true);
            }
        }

        System.out.println("Task completed! Retrieving the result");
        //String result = future.get(); // IT WILL THROW EXCEPTION

        if (!future.isCancelled()) {
            System.out.println("Task completed! Retrieving the result");
            String result = future.get();
            System.out.println(result);
        } else {
            System.out.println("Task was cancelled");
        }


        executorService.shutdown();
    }
}
