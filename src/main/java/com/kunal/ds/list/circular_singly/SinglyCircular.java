package com.kunal.ds.list.circular_singly;

public class SinglyCircular {

    Node start=null;
    Node end=null;

    public void addStart(int data){

        Node node=new Node(data,null);

        if(start==null){
            start=node;
            node.addr=start;
            end=start;
        }else {
            node.addr=start;
            start.addr=node;
            start=node;
            end.addr=start;
        }


    }


    public void display(){

        if(start==null){
            System.out.println(" List Is Empty ..");
            return;
        }

        Node temp=start;
        System.out.println(" Start -> ");
        do{
            System.out.print(temp.data+" ");
            temp=temp.addr;

        }while (temp!=start);

        System.out.println("\n <- End ");
    }

    public boolean isCircleExists(){

        boolean isCircleExists=false;
        if(start==null){
            return isCircleExists;
        }

        Node slowPtr=start;
        Node fastPtr=start;

       do{
           if(slowPtr.addr==null || fastPtr.addr==null){
               break;
           }
            slowPtr=slowPtr.addr;
           fastPtr=fastPtr.addr.addr;

       }while (slowPtr!=fastPtr);

       if(slowPtr==fastPtr)
           isCircleExists=true;

       return isCircleExists;
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


