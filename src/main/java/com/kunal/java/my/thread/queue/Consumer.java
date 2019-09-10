package com.kunal.java.my.thread.queue;

import com.kunal.ds.queue.Queue_Array;

public class Consumer implements Runnable {

    Queue_Array queue;
    public Consumer(Queue_Array queue){
        this.queue=queue;
    }


    @Override
    public void run() {

        while (true){

        /*    System.out.println("consumed --> "+queue.DeQueue());
            queue.wait();*/
            try {
              //  Thread.sleep(1100);
                System.out.println("consumed --> "+queue.DeQueue());
                queue.wait();
            }catch (Exception e){
                System.out.println(e);
            }
        }


    }
}
