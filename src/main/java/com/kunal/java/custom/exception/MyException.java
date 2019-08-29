package com.kunal.java.custom.exception;

public class MyException extends Exception {



    public MyException(String s){
        super(s);
    }

    public static void main(String[] args) {
        try
        {
            // Throw an object of user defined exception
            throw new MyException("my excepption ");
        }
        catch (MyException ex)
        {
            System.out.println("Caught");

            // Print the message from MyException object
            System.out.println(ex.getMessage());
        }
    }
}
