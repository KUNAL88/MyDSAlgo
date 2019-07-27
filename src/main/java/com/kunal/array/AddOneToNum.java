package com.kunal.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddOneToNum {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.add(9);    list.add(9);    list.add(9);
       /* list.add(8);    list.add(6);    list.add(1);
        list.add(1);    list.add(2);    list.add(4);
        list.add(5);*/
        list=new AddOneToNum().plusOne(list);
        Iterator<Integer> itr=list.iterator();
        while (itr.hasNext()){
            System.out.print("  "+itr.next());
        }
    }

    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        if(A!=null && A.size()==0){
            return A;
        }

        while (!A.isEmpty() && A.get(0)==0){
                A.remove(0);
        }

        if(A.size()==0){
            A.add(1);
            return A;
        }
        boolean carryFlag=true;
        int lengthOflist=A.size()-1;
        int carryValue=0;
        while (carryFlag ){
            Integer  lsb=null;

            if(lengthOflist>0){
                lsb=A.get(lengthOflist)+1+carryValue;
            }

            if(isCarry(lsb)){
                A.remove(lengthOflist);
                A.add(0);
                carryValue=1;
                lengthOflist--;
            }else if(lengthOflist<0 && carryValue==1) {
                A.add(0,carryValue);
                carryFlag=false;
                carryValue=0;
            }else {
                A.remove(lengthOflist);
                A.add(lsb);
                carryFlag=false;
            }

        }


        return A;
    }

    private boolean isCarry(Integer value){

        boolean carryFlag=false;

        if(value>=10){
            carryFlag=true;
        }
        return carryFlag;
    }

}
