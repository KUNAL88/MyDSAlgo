package com.kunal.array;

import java.util.ArrayList;
import java.util.List;

public class MaxDistance {
    public static void main(String[] args) {

        int[] a={1,10};
        new MaxDistance().maximumGap(a);

    }

    public int maximumGap(final int[] A) {
        int currentGap=0,maxGap=0;
        int counter=1;
        int start=0;

        while (counter<A.length){

            if(A[start]<=A[counter]){
                currentGap++;
                counter++;
            }else {

                if(currentGap>maxGap){
                   maxGap=currentGap;
                }
                currentGap=0;
                start=counter;
                counter++;
            }
        }

        if(currentGap>maxGap){
            maxGap=currentGap;
        }
        return maxGap;
    }
}
