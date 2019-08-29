package com.kunal.java.queue;

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
           try {
               Thread.sleep(1000);

           }catch (Exception e){
               System.out.println(e);
           }
       }



    }
}
