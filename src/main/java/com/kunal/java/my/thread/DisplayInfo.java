package com.kunal.java.my.thread;

public class DisplayInfo {

    //private String name;

    public synchronized void display(String name){

        for(int i=0;i<50;i++){
            System.out.println("INstance Synchronized Counter "+i+"MyName is "+name);

            try{
                Thread.sleep(100);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
    //non synchronized method
    public  void display_1(String name){

        for(int i=0;i<50;i++){
            System.out.println("Instance Counter "+i+"MyName is "+name);

            try{
                Thread.sleep(100);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }

    public static synchronized void display_2(String name){

        for(int i=0;i<50;i++){
            System.out.println("static synchronozed Counter "+i+"MyName is "+name);

            try{
                Thread.sleep(100);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
