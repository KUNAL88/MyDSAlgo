package com.kunal.array;

import java.util.ArrayList;
/*

You are given an array of N integers, A1, A2 ,…, AN. Return maximum value of f(i, j) for all 1 ≤ i, j ≤ N.
        f(i, j) is defined as |A[i] - A[j]| + |i - j|, where |x| denotes absolute value of x.
*/


public class MaxAbsoluteDifference {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);    list.add(3);    list.add(-1);

        System.out.println(new MaxAbsoluteDifference().maxArr(list));
    }

    public int maxArr(ArrayList<Integer> A) {

        if(A==null || A.size()<=1){
            return 0;
        }

        Value maxValue=getMaxValueAndIndex(A); //System.out.println(maxValue.toString());
        Value minValue=getMinValueAndIndex(A); //System.out.println(minValue.toString());

        int diff=Math.abs(maxValue.value-minValue.value)+Math.abs(maxValue.index-minValue.index);

        return diff;
    }

    private Value getMaxValueAndIndex(ArrayList<Integer> A){
        int maxValue=-999999999;
        int index=-1;

        for(int i=0;i<A.size();i++){

            if(maxValue<=A.get(i)){
                maxValue=A.get(i);
                index=i;
            }
        }
        return new Value(maxValue,index);
    }

    private Value getMinValueAndIndex(ArrayList<Integer> A){
        int minValue=999999999;
        int index=-1;

        for(int i=0;i<A.size();i++){
            if(minValue>A.get(i)){
                minValue=A.get(i);
                index=i;
            }
        }
        return new Value(minValue,index);
    }
}

class Value{
    int value;
    int index;

    Value(int value,int index){
        this.value=value;
        this.index=index;
    }

    @Override
    public String toString() {
        return "Value{" +
                "value=" + value +
                ", index=" + index +
                '}';
    }
}
