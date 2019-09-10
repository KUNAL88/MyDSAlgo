package com.kunal.java.my.thread.advance.example;

public class MyThread implements Runnable {

    private Display d=null;
    private String name=null;
    public MyThread(Display d,String name){
        this.d=d;
        this.name=name;
    }

    @Override
    public void run() {
        d.name(name);
    }
}
