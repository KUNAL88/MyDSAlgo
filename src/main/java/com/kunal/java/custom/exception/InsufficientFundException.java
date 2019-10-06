package com.kunal.java.custom.exception;

public class InsufficientFundException extends RuntimeException {

    public InsufficientFundException(){ }

    public InsufficientFundException(String s){
        super(s);
    }
}

//runtime Exception
/*
nullpointerexception, arrayIndexOFBound, concurrentModification, IllegalMonitorStateException
classCastException
 */