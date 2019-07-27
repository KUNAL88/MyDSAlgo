package com.kunal.array;

import org.apache.regexp.RE;

public class ArrayTriplet {

    public static void main(String[] args) {
       // String[] A={"0.6", "0.7", "0.8", "1.2", "0.4"};
        String[] A={ "1.033277", "0.654925", "0.272755", "0.320328", "1.962731", "0.095948", "1.094519" };

        System.out.println(new ArrayTriplet().solve(A));

    }

    public int solve(String[] A) {

        int flag=0;
        double a=0.0,b=0.0,c=0.0;
        if(A==null || A.length<=2){
            return flag;
        }
        Lowest l1=findLowest(A,-1,-1);
        Lowest l2=findLowest(A,l1.index,-1);
        Lowest l3=findLowest(A,l1.index,l2.index);

        double sum=l1.value+l2.value+l3.value;

        if(1<sum && sum<2){
            flag=1;
        }


        return flag;
    }

    private Lowest findLowest(String[] A,int firstIndexLowest,int secondIndexLowest){
        double low=999999999.9999999;
        int lowIndex=-1;
        //int counter=0;
        double currentValue=0.0;
        for(int counter=0;counter<A.length;counter++){

            if(counter==firstIndexLowest || counter==secondIndexLowest){
                counter++;
            }else {

                currentValue=Double.parseDouble(A[counter]);
                if(low>currentValue){
                    low=currentValue;
                    lowIndex=counter;
                }
                counter++;
            }
        }

        return new Lowest(low,lowIndex);

    }


}

class Lowest{
    double value;
    int index;

    Lowest(double value,int index){
        this.value=value;
        this.index=index;
    }
}
