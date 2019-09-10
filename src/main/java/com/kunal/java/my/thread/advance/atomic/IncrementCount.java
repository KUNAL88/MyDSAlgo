package com.kunal.java.my.thread.advance.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class IncrementCount {

   // private int count=0;
    private AtomicInteger count=new AtomicInteger(0);

    public IncrementCount(){
        //this.count=count;
    }

    public int incrCount(){
       return count.incrementAndGet();
    }

    public int getCount(){
        return count.get();
    }
}
