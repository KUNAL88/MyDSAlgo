package com.kunal.java.my.thread;

public class MyThread implements Runnable {

   private String name;
   private DisplayInfo d;

   public MyThread(DisplayInfo d,String name){
       this.d=d;
       this.name=name;
   }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
       // d.display(name);
       // d.display_1(name);
        DisplayInfo.display_2(name);
    }
}
