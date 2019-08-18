package com.kunal.ds.queue;

public class Queue_Array<T> {

     private int front=-1;
     private int rare=-1;
     private int sizeOfQueue=50;
     //private int[] queue=new int[sizeOfQueue];
     private T[] queue;
     public Queue_Array(T[] queue){
            this.queue=queue;
     }

    public static void main(String[] args) {

      /*  DeQueue();
        EnQueue(10);
        EnQueue(20);
        EnQueue(30);
        DeQueue();
        EnQueue(40);
        EnQueue(50);
        EnQueue(60);
        DeQueue();
        DeQueue();
        DeQueue();
        DeQueue();
        DeQueue();
        DeQueue();*/

    }

    public int getFront() {
        return front;
    }

    public int getRare() {
        return rare;
    }

    public  void EnQueue(T data){

        if((rare+1)%sizeOfQueue==front){
          //  System.out.println("Queue is Full ............");
        }else {

            if(rare==-1 && front==-1){
                    front++;
            }

            rare=(rare+1)%sizeOfQueue;
            queue[rare]=data;

           // System.out.println("Data Added Successfully .... "+queue[rare]);

        }


    }

    public  T DeQueue(){

       T deQueueItem=null;
        if(front==-1){
           // System.out.println(" Queue is Empty ....");
        }else {

            if(front==rare){
                deQueueItem=queue[front];
          //  System.out.println(" Data Removed is : "+deQueueItem);
            front=-1;
            rare=-1;
            }else {
                deQueueItem=queue[front];
           //     System.out.println(" Data Removed is : "+deQueueItem);
                front=(front+1)%sizeOfQueue;
            }
        }
        return deQueueItem;
    }

    public boolean isQueueEmpty(){

        if(front==-1 && rare==-1){
            return true;
        }else {
            return false;
        }
    }
}
