package com.kunal.java.my.thread.advance;

public class ThreadGroupDemo {

    public static void main(String[] args) {
       /* System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getThreadGroup());

        ThreadGroup g=new ThreadGroup("Group-1");

        ThreadGroup g1=new ThreadGroup(g,"Group-2");

        System.out.println(g1.getParent().getName());*/

       ThreadGroup g1=new ThreadGroup("tg");
       Thread t1=new Thread(g1,"T1");
       Thread t2=new Thread(g1,"T2");
       g1.setMaxPriority(3);
        Thread t3=new Thread(g1,"T3");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());

      //  g1.activeGroupCount() // return active threds in current group



    }
}
