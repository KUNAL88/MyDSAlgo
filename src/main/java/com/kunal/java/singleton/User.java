package com.kunal.java.singleton;

public class User {

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
