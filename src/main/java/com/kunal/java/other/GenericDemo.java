package com.kunal.java.other;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {

    public static void main(String[] args) {

        List<FourWheeler> fourWheelerList=new ArrayList<>();
        fourWheelerList.add(new FourWheeler());

        List<Bus> busList=new ArrayList<>();
        busList.add(new Bus());

        List<LuxuryBus> luxuryBuseList=new ArrayList<>();
        luxuryBuseList.add(new LuxuryBus());

        new GenericDemo().display(fourWheelerList);
        new GenericDemo().display(busList);
        new GenericDemo().display(luxuryBuseList);
    }

   /* public void display(List<? super Bus> list){

        ((FourWheeler)list.get(0)).display();
    }*/

  /*  public void display(List<? extends Bus> list){

        ((FourWheeler)list.get(0)).display();
    }*/

    public void display(List<?> list){

        ((FourWheeler)list.get(0)).display();
    }

}




