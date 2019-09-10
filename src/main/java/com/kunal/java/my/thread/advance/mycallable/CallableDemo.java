package com.kunal.java.my.thread.advance.mycallable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

    public static void main(String[] args) {
        MyCallable[] callableJob={
                new MyCallable(10),
                new MyCallable(20),
                new MyCallable(30),
                new MyCallable(40),
                new MyCallable(60),
                new MyCallable(70)
        };

      //  Callable c1=new MyCallable(1);


        ExecutorService service= Executors.newFixedThreadPool(3);
        Future<Integer> future=null;
        for(MyCallable c:callableJob){
            try {
                future=service.submit(c);
                System.out.println(future.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println();
        }

        service.shutdown();
    }

}
