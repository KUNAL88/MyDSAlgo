package com.kunal.java.design.pattern.singleton;


/*
Example of Singleton class in java : Runtime class
There can only be singleInstance of Runtime
 */
public class User {

   // Runtime
    private static User userInstance;

    private User(){}

    public  static  User getUserInstance(){

        if(userInstance==null){

            synchronized(User.class){

                userInstance=new User();
            }
        }

        return userInstance;
    }
}
