package com.kunal.ds.stack.question;

public class TwoStackOneArray {

    private static int sizeOfArray=8;
    private static int top1=-1,top2=sizeOfArray;
    private static int[] array=new int[sizeOfArray];

    public void pushStack1(int data){

        if(top1==sizeOfArray-1 || top1==top2-1){
            System.out.print("Stack is full .... ");
        }else {
            top1++;
            array[top1]=data;
        }
    }

    public void pushStack2(int data){

        if(top2<0 || top2==top1+1){
            System.out.print("Stack is full .... ");
        }else {
            top2--;
            array[top2]=data;
        }
    }

    public int popStack1(){

        int popedData=-1;
        if(top1==-1){
            System.out.print("Stack is Empty .... ");
        }else {
            popedData=array[top1];
            top1--;
        }
        return popedData;
    }

    public int popStack2(){

        int popedData=-1;
        if(top2==sizeOfArray ){
            System.out.print("Stack is Empty .... ");
        }else {
            popedData=array[top2];
            top2++;
        }
        return popedData;
    }

    public void displayTopIndex(){
        System.out.println("Top-1 - "+top1+" Top-2 - "+top2);
    }

    public static void main(String[] args) {
        TwoStackOneArray stackOneArray=new TwoStackOneArray();
        stackOneArray.displayTopIndex();

        stackOneArray.popStack1();  stackOneArray.popStack2();

        stackOneArray.pushStack1(10);
        stackOneArray.pushStack2(100);

        stackOneArray.pushStack1(10);
        stackOneArray.pushStack2(100);

        stackOneArray.pushStack1(10);
        stackOneArray.pushStack2(100);

        stackOneArray.pushStack1(10);
        stackOneArray.pushStack2(100);

        stackOneArray.displayTopIndex();

        stackOneArray.pushStack1(10);
        stackOneArray.pushStack2(100);

        stackOneArray.popStack1();
        stackOneArray.popStack2();
    }
}
