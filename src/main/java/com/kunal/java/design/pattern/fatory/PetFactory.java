package com.kunal.java.design.pattern.fatory;

public class PetFactory {

    public Pet getPetInstance(int Pettype){
        Pet pet=null;

        if(Pettype==1){
            pet=new Cat();
        }else if(Pettype==2){
            pet=new Dog();
        }

        return pet;
    }
}
