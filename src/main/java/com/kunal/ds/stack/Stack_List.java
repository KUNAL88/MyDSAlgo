package com.kunal.ds.stack;

public class Stack_List {

    private int sizeOfStack=5;
    private Node top=null;
    private static int count=0;

    public void push(int data){

        if(count==sizeOfStack){
            System.out.println(" StackOverFlow Occurred ...");
        }else {
            Node node=new Node(data,null);

            if(top==null){
                top=node;
                count++;
            }else {
                node.addr=top;
                top=node;
                count++;
            }
        }

    }


    public void pop(){

        if (top==null){
            System.out.println(" Stack is Empty ...");
        }else {
            System.out.println("Item Removed from the stack is "+top.data);
            top=top.addr;
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