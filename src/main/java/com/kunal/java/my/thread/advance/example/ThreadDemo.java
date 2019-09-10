package com.kunal.java.my.thread.advance.example;

public class ThreadDemo {

    public static void main(String[] args) {

      /*  Display d=new Display();
        Runnable r1=new MyThread(d,"Golu");
        Thread t1=new Thread(r1);
        t1.start();

        Runnable r2=new MyThread(d,"Tolu");
        Thread t2=new Thread(r2);
        t2.start();*/

      Runnable r3=new MyThread_1();
      Thread t3=new Thread(r3);
      t3.start();

        Runnable r4=new MyThread_1();
        Thread t4=new Thread(r4);
        t4.start();


    }
}
