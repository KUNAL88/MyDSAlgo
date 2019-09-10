package com.kunal.java.my.thread.advance.mythreadlocal;

public class ThreadLocalDemo {

    public static void main(String[] args) {

        ThreadLocal t1=new ThreadLocal();

        System.out.println(t1.get());
        t1.set("kunal");
        System.out.println(t1.get());
        t1.remove();
        System.out.println(t1.get());
    }
}
