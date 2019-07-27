package com.kunal.array;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

    public int compare(Integer obj1,Integer obj2){

        Integer remainderObj1=obj1%10;
        Integer remainderObj2=obj2%10;

        if(remainderObj1>remainderObj2)
            return -1;
        else if(remainderObj1==remainderObj2) {

            Integer divisorObj1=obj1/10;
            Integer divisorObj2=obj2/10;

            if(divisorObj1>divisorObj2){
                return -1;
            }else {
                return 1;
            }
        }else {
            return 1;
        }
    }


}
