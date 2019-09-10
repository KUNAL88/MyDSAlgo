package com.kunal.java.my.thread.wait_notify;

import java.util.LinkedList;
import java.util.Queue;

public class DemoThread {

    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();


        Runnable producer=new Producer(queue);
        Thread producerThread=new Thread(producer);
        producerThread.start();

        Runnable consumer=new Consumer(queue);
        Thread consumerThread=new Thread(consumer);
        consumerThread.start();

    }
}
