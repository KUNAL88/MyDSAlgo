package com.kunal.java.oops;

public class OopsDemo {

    public static void main(String[] args) {
        B b=new B("kunal-");

    }
}


class A {

    public A(){
        System.out.println("In A");
    }
    public A(String x){
        System.out.println(x+" A");
    }
}

class B extends A{

    public B(String X){
        System.out.println(X+"In B");
    }

   /* public B(){
        System.out.println("In B");
    }*/
}