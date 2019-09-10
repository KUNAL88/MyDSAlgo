package com.kunal.ds.list.generic.list;

public class LinkedList<T> {
    Node start=null;

    public Node addEnd(T data){

        Node node=new Node(data,null);

        if(start==null){
            start=node;
        }else {
            Node temp=start;

            while (temp.addr!=null){
                temp=temp.addr;
            }
            temp.addr=node;
        }

        return start;
    }

    public void display(){

        if(start==null){
            System.out.println(" Nothing to display ..");
        }else {
            Node node=start;

            while (node!=null){
                System.out.println();
            }
        }
    }
}

class Node<T>{

    T data;
    Node addr;

    public Node(T data,Node addr){
        this.data=data;
        this.addr=addr;
    }
}
