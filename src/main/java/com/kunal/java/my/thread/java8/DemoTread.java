package com.kunal.java.my.thread.java8;

public class DemoTread {

    public static void main(String[] args) {

        Runnable r=() ->{
          System.out.println("Thread Started");
        };

        Thread t=new Thread(r);
        t.start();

    }
}
