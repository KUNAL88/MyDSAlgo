package com.kunal.java.my.thread.advance.mylatch;

import java.util.concurrent.CountDownLatch;

public class Consumer implements Runnable {

    private CountDownLatch latch;
    public Consumer(CountDownLatch latch){
        this.latch=latch;
    }

    @Override
    public void run() {
        System.out.println("Consumer Waiting ...");
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Consumer Waiting ...");
    }
}
