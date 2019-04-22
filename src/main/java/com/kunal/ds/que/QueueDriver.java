package com.kunal.ds.que;

public class QueueDriver {

    public static void main(String[] args) {
        Queue_List queueDemo=new Queue_List();

        queueDemo.deQueue();

        queueDemo.enQueue(10);
        queueDemo.enQueue(200);
        queueDemo.enQueue(40);

        queueDemo.displayQueueData();

        queueDemo.deQueue();
        queueDemo.deQueue();
        queueDemo.deQueue();
        queueDemo.deQueue();

        queueDemo.enQueue(300);
        queueDemo.displayQueueData();
        queueDemo.deQueue();


    }

}
