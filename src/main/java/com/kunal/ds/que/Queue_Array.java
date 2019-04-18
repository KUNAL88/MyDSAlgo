package com.kunal.ds.que;

public class Queue_Array {

    static int front=-1;
    static int rare=-1;
    static int sizeOfQueue=5;
    static int[] queue=new int[sizeOfQueue];

    public static void main(String[] args) {

        DeQueue();
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
        DeQueue();

    }

    public static void EnQueue(int data){

        if((rare+1)%sizeOfQueue==front){
            System.out.println("Queue is Full ............");
        }else {

            if(rare==-1 && front==-1){
                    front++;
            }

            rare=(rare+1)%sizeOfQueue;
            queue[rare]=data;

            System.out.println("Data Added Successfully .... "+queue[rare]);

        }


    }

    public static void DeQueue(){

        if(front==-1){
            System.out.println(" Queue is Empty ....");
        }else {

            if(front==rare){

            System.out.println(" Data Removed is : "+queue[front]);
            front=-1;
            rare=-1;
            }else {

                System.out.println(" Data Removed is : "+queue[front]);
                front=(front+1)%sizeOfQueue;

            }

        }




    }
}
