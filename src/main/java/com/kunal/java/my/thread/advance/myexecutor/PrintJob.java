package com.kunal.java.my.thread.advance.myexecutor;

public class PrintJob implements Runnable {

    private String name;
    public PrintJob(String name){
        this.name=name;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getThreadGroup()+"    "+Thread.currentThread().getName()+" Name : "+name);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
