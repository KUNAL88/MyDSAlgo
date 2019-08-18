package com.kunal.java.my.thread;

public class ThreadDemo {

    public static void main(String[] args) {
       /* Thread t1 and t2 operating on the same object
        Synchronized Instance Method*/
        DisplayInfo d=new DisplayInfo();
        Runnable r=new MyThread(d,"Kunal");
        Thread t=new Thread(r);
        t.start();


        MyThread r1=new MyThread(d,"tolu");
        Thread t1=new Thread(r1);
        t1.start();

        /*
        Thread t1 and t2 operating on the different object
        Synchronized Instance Method
        */
      /*  DisplayInfo d=new DisplayInfo();
        Runnable r=new MyThread(d,"Kunal");
        Thread t=new Thread(r);
        t.start();

        DisplayInfo d1=new DisplayInfo();
        MyThread r1=new MyThread(d1,"tolu");
        Thread t1=new Thread(r1);
        t1.start();*/


       /*
        Thread t1 and t2 operating on the different object
        Static Synchronized Instance Method
        */
       /* DisplayInfo d=new DisplayInfo();
        Runnable r=new MyThread(d,"Kunal");
        Thread t=new Thread(r);
        t.start();

        DisplayInfo d1=new DisplayInfo();
        MyThread r1=new MyThread(d1,"tolu");
        Thread t1=new Thread(r1);
        t1.start();*/

      /*
        Thread t1 and t2 operating on the same object
        Static Synchronized Instance Method
        */
       /* DisplayInfo d=new DisplayInfo();
        Runnable r=new MyThread(d,"Kunal");
        Thread t=new Thread(r);
        t.start();


        MyThread r1=new MyThread(d,"tolu");
        Thread t1=new Thread(r1);
        t1.start();*/



    }
}
