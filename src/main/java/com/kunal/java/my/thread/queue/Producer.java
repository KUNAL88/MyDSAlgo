package com.kunal.java.my.thread.queue;

import com.kunal.ds.queue.Queue_Array;

public class Producer<T> implements Runnable {

    Queue_Array queue;

    public Producer(Queue_Array queue){
        this.queue=queue;
    }

    @Override
    public void run() {
        int count=0;
       while (true){
           count++;
           queue.EnQueue(count);
            System.out.println("produced "+count);

            queue.notify();
       }



    }
}
