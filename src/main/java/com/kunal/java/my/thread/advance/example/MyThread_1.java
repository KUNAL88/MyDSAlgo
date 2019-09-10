package com.kunal.java.my.thread.advance.example;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread_1 implements Runnable {
   static ReentrantLock l=new ReentrantLock();

    @Override
    public void run() {

        do{
            try {
                if(l.tryLock(5000, TimeUnit.MILLISECONDS)){
                    System.out.println(Thread.currentThread().getName()+" Got Lock");
                    Thread.sleep(15000);
                    System.out.println(Thread.currentThread().getName()+" Releasing Lock now");
                    l.unlock();
                    break;
                }else {
                    System.out.println(Thread.currentThread().getName()+"Unable to get lock and will try again after 5000 millisec ...");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }while (true);
    }
   /* @Override
    public void run() {

        if(l.tryLock()){
            System.out.println(Thread.currentThread().getName()+" " +
                    "... get lock and perform safe operation ..");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }else {
            System.out.println(Thread.currentThread().getName()+" " +
                    "... lock acquired by other thread and perform other operation ..");
        }
    }*/


}
