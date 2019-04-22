package com.kunal.ds.que;

public class Queue_List {

   private Node front=null;
   private Node rare=null;

    public void enQueue(int data){

        Node node=new Node(data,null);

        if(front==null && rare==null){
            front=node;
            rare=node;
        }else {
            rare.addr=node;
            rare=node;

            System.out.println(data+" Successfully Added to the Queue ...");
        }

    }


    public void deQueue(){

        if (front==null && rare==null){
            System.out.println("Queue is empty .....");
        }else {
            System.out.println(front.data+" Successfully Removed from the Queue ..");

            if(front==rare){
                front=null;     rare=null;
            }else {
                front=front.addr;
            }
        }

    }

    public void displayQueueData(){

        if(front==null && rare==null){
            System.out.println(" Queue is Empty .....");
        }else {

            Node temp=front;

            while (temp!=null){
                System.out.println(temp.data);
                temp=temp.addr;
            }

        }

    }



}


class Node{

    int data;
    Node addr;

    Node(int data,Node addr){
        this.data=data;
        this.addr=addr;
    }
}
