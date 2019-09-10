package com.kunal.java.my.thread.advance.mylatch;

import java.util.concurrent.CountDownLatch;

public class MyLatchDemo {

    public static void main(String[] args) {
        CountDownLatch c=new CountDownLatch(3);
        Producer p=new Producer(c);
        new Thread(p).start();

        Consumer c1=new Consumer(c);
        new Thread(c1).start();
    }
}
