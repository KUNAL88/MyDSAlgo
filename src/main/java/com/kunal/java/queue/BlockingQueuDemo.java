package com.kunal.java.queue;

import com.kunal.ds.queue.Queue_Array;

public class BlockingQueuDemo {

    public static void main(String[] args) {

        Integer[] array=new Integer[50];
        Queue_Array<Integer> queue=new Queue_Array<>(array);

         Runnable r1=new Producer<Integer>(queue);
        new Thread(r1).start();

        Runnable r=new Consumer(queue);
        new Thread(r).start();


    }
}
