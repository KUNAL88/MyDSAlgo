package com.kunal.ds.stack;

public class Stack_Array {

    private static int top=-1;
    private static int sizeOfStack=50;
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


    public static void push(int data){

        if(top==sizeOfStack-1){
            System.out.println(" StackOverFlow ....");
        }else {
            top++;
            stack[top]=data;
            System.out.println(" Item pushed successfully ... "+stack[top]);
        }


    }

    public static int pop(){

        int popedItem=-1;

        if(top==-1){
            System.out.println(" Stack is empty ...");
        }else {
            popedItem=stack[top];
            System.out.println("Item Removed from Stack is "+popedItem);
            top--;
        }

        return popedItem;
    }

    public static boolean isEmpty(){

        if(top==-1){
            return true;
        }else {
            return false;
        }
    }
}
