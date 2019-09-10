package com.kunal.java.my.thread.wait_notify;

import java.util.Queue;

public class Consumer implements Runnable{

    Queue queue=null;

    public Consumer(Queue queue){
        this.queue=queue;
    }

    @Override
    public void run() {

        while (true){
            System.out.println(" Consumed message "+this.getMessage());
        }
    }

    public Integer getMessage(){
        Integer msg=null;
        synchronized (queue){

            if(queue.isEmpty()){
                try {
                    queue.wait(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                msg= (Integer) queue.remove();
                System.out.println(" Consumed message "+msg);
            }


        }

        return msg;
    }
}
