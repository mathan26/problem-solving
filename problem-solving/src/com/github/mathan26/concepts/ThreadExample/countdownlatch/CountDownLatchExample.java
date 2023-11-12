package com.github.mathan26.concepts.ThreadExample.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExample {


    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        CountDownLatch countDownLatch = new CountDownLatch(3);

        executorService.submit(new DependentService(countDownLatch));
        executorService.submit(new DependentService(countDownLatch));
        executorService.submit(new DependentService(countDownLatch));
        Thread.sleep(5000);
        countDownLatch.await();
        System.out.println("After Executing all dependent Thread this line is executed!");
    }
}


class DependentService implements Runnable {
    CountDownLatch countDownLatch;

    public DependentService(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        countDownLatch.countDown();
        System.out.println("Executing ..." + Thread.currentThread().getName());

    }
}
