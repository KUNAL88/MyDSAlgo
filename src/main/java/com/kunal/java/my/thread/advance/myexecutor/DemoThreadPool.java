package com.kunal.java.my.thread.advance.myexecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoThreadPool {

    public static void main(String[] args) {

        PrintJob[] printJob={
                new PrintJob("Golu"),
                new PrintJob("Tolu"),
                new PrintJob("Shlok"),
                new PrintJob("Bala"),
                new PrintJob("nanu"),
                new PrintJob("nani")
        };

        ExecutorService service= Executors.newFixedThreadPool(3);

        for(PrintJob job:printJob){
            service.submit(job);
        }
        service.shutdown();
    }

}
