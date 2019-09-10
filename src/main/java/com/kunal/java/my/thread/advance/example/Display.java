package com.kunal.java.my.thread.advance.example;

import java.util.concurrent.locks.ReentrantLock;

public class Display {

    ReentrantLock l=new ReentrantLock();
    public void name(String name)  {

        l.lock();
        for(int i=0;i<50;i++){
            System.out.println(" MyName is "+name);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
       l.unlock();
    }
}
