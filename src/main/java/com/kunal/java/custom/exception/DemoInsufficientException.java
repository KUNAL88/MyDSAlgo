package com.kunal.java.custom.exception;

public class DemoInsufficientException {

    public static void main(String[] args) {
        int balance=0;
        int debitAmount=10;

        try {

            if(debitAmount>balance){
                throw new InsufficientFundException("InsuficientBalance");
            }else {
                balance-=debitAmount;

            }

        }catch (InsufficientFundException e){
           e.printStackTrace();
        }

    }
}
