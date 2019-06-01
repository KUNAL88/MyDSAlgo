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
/*
Algorithm : push() Item into Stack
Initialize : top=-1 , sizeOfStack=n; stack[n]
1. Check if stack is full
    - If Yes, "Print a message - Stackoverflow" and return
    - If No, then
        a. increment top i.e. top++
        b. add new item to the top of the stack i.e. stack[top]=item;
2. Exit
 */

    public static void push(int data){

        if(top==sizeOfStack-1){
            System.out.println(" StackOverFlow ....");
        }else {
            top++;
            stack[top]=data;
            System.out.println(" Item pushed successfully ... "+stack[top]);
        }


    }

 /*
  Algorithm : pop() Item into Stack
Initialize : top=-1 , sizeOfStack=n; stack[n]
1. Check if stack is empty i.e. if(top==-1)
   - If Yes, the print message "Stack is Empty/ Underflow"
   - If No, remove  item at the top
        int item=stack[top]
        top--;
2. Exit
  */

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
