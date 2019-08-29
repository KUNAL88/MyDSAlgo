package com.kunal.java.queue;

import com.kunal.ds.queue.Queue_Array;

public class Consumer implements Runnable {

    Queue_Array queue;
    public Consumer(Queue_Array queue){
        this.queue=queue;
    }


    @Override
    public void run() {

        while (true){
            try {
                Thread.sleep(1100);
                System.out.println("consumed --> "+queue.DeQueue());
            }catch (Exception e){
                System.out.println(e);
            }
        }


    }
}
