package com.kunal.java.my.thread.wait_notify;

import java.util.Queue;

public class Producer implements Runnable {

    private Queue queue=null;
    public Producer(Queue queue){
        this.queue=queue;
    }


    @Override
    public void run() {

        Integer i=1;
        while (true){
           this.updateMessageQueue(i);
            i++;

           /* try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }

    public  void updateMessageQueue(Integer i){

        synchronized (queue){
            System.out.println("Producer Message "+i);
            queue.add(i);
            queue.notify();
        }
    }
}
