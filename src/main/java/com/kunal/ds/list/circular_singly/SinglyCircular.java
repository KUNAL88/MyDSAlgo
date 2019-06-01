package com.kunal.ds.list.circular_singly;

public class SinglyCircular {

    Node start=null;

    public void addStart(int data){

        Node node=new Node(data,null);

        if(start==null){
            start=node;
            node.addr=start;
        }else {
            node.addr=start;
            start.addr=node;
            start=node;
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

        System.out.println(" <- End ");
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


