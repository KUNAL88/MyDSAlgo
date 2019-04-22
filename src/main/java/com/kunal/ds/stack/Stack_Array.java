package com.kunal.ds.stack;

public class Stack_Array {

    private static int top=-1;
    private static int sizeOfStack=5;
    private static int[] stack=new int[sizeOfStack];


    public static void main(String[] args) {

        pop();

        push(10);
        push(200);
        push(300);

        pop();
        pop();
        pop();
        pop();

        push(600);
        pop();


    }


    private static void push(int data){

        if(top==sizeOfStack-1){
            System.out.println(" StackOverFlow ....");
        }else {
            top++;
            stack[top]=data;
            System.out.println(" Item pushed successfully ... "+stack[top]);
        }


    }

    private static void pop(){

        if(top==-1){
            System.out.println(" Stack is empty ...");
        }else {
            System.out.println("Item Removed from Stack is "+stack[top]);
            top--;
        }
    }
}
