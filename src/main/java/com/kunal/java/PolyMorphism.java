package com.kunal.java;

public class PolyMorphism {

    public static void main(String[] args) {

       Animal obj1=new Animal();
        obj1.display();
       obj1.rollNo=10;  obj1.age=20;
       obj1.display();

       Animal obj2=new Animal();
       System.out.println("I am in obj2 now .....");
        obj2.display();
      //  obj2.rollNo=100;  obj2.age=55;    obj2.display();

    }

}
