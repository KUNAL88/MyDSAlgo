package com.kunal.java.my.thread.advance.mylatch;

import java.util.concurrent.CountDownLatch;

public class Producer implements Runnable {

    private CountDownLatch latch;
    public Producer(CountDownLatch latch){
        this.latch=latch;
    }


    @Override
    public void run() {

        System.out.println("Producer --> ");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        latch.countDown();
        latch.countDown();
        latch.countDown();

    }
}
