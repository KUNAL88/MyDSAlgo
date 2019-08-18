package com.kunal.ds.stack.impl;

import com.kunal.ds.queue.Queue_Array;

public class StackUsingQueue {

    private int sizeOfQueue=10;
    Integer[] array=new Integer[50];
    private Queue_Array queue1=new Queue_Array(array);
    private Queue_Array queue2=new Queue_Array(array);


    public static void main(String[] args) {
            StackUsingQueue stack=new StackUsingQueue();
            stack.pop();
            stack.push(10);
            stack.push(20);
            System.out.println(stack.pop());
            System.out.println(stack.pop());
    }

    public void push(int data){

            queue1.EnQueue(data);

    }

    public int pop(){

        int item=0;
        if(queue1.isQueueEmpty()){
            System.out.println(" Stack is empty ...");
            return -1;
        }else {
            while (queue1.getFront()!=queue1.getRare()){
                queue2.EnQueue(queue1.DeQueue());
            }

        }
        item=(Integer) queue1.DeQueue();
        while (!queue2.isQueueEmpty()){
            queue1.EnQueue(queue2.DeQueue());
        }

        return item;
    }


}
