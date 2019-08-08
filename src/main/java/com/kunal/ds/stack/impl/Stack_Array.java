package com.kunal.ds.stack.impl;

public class Stack_Array<T> {

    private static int top=-1;
    private static int sizeOfStack=50;
    private  T[] stack;//=new T[sizeOfStack];
    private T popedItem;

    public Stack_Array(T[] array){
        stack=array;
    }

    public static void main(String[] args) {

        Integer[] i=new Integer[sizeOfStack];
        Stack_Array<Integer> stack_array=new Stack_Array<Integer>(i);

        stack_array.pop();
        stack_array.push(10);

        stack_array.push(200);
        stack_array.push(300);

        stack_array.push(600);
        stack_array.pop();

        String[] s=new String[sizeOfStack];
        Stack_Array<String> stack_array_string=new Stack_Array<String>(s);

        stack_array_string.push("kunal");
        stack_array_string.push("Shikha");
        stack_array_string.push("Shivam");

        stack_array_string.pop();  stack_array.pop();  stack_array.pop();
        stack_array_string.push("tolu");

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

    public T topOfStck(){

        if(!this.isEmpty()){
            return this.stack[top];
        }else {
            return null;
        }
    }

    public  void push(T data){

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

    public  T pop(){

        // popedItem=-1;

        if(top==-1){
            System.out.println(" Stack is empty ...");
        }else {
            popedItem=stack[top];
            System.out.println("Item Removed from Stack is "+popedItem);
            top--;
        }

        return popedItem;
    }

    public  boolean isEmpty(){

        if(top==-1){
            return true;
        }else {
            return false;
        }
    }
}
