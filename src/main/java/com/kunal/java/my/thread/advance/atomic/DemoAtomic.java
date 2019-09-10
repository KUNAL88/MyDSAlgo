package com.kunal.java.my.thread.advance.atomic;

public class DemoAtomic {

    public static void main(String[] args) {


        IncrementCount incrementCount=new IncrementCount();

        Runnable r=()->{
            for(int i=0;i<8000;i++){
                incrementCount.incrCount();
            }
        };

        Runnable r1=()->{
            for(int i=0;i<2000;i++){
                incrementCount.incrCount();
            }
        };

        new Thread(r).start();
        new Thread(r1).start();

        System.out.println(incrementCount.getCount());
    }
}
