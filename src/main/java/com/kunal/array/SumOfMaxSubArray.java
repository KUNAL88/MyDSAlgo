package com.kunal.array;

import java.util.ArrayList;
import java.util.List;

/*
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

        For example:

        Given the array [-2,1,-3,4,-1,2,1,-5,4],

        the contiguous subarray [4,-1,2,1] has the largest sum = 6.

        For this problem, return the maximum sum.
*/
public class SumOfMaxSubArray {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(-2);
        list.add(1);
        list.add(-3);
        list.add(4);
        list.add(-1);
        list.add(2);
        list.add(1);
        list.add(-5);
        list.add(4);

        int maxSum=maxSubArray(list);
        System.out.println("MaxSubArray "+maxSum);

    }

    public static int maxSubArray(final List<Integer> A) {

        int currentSum=0;
        int maxSum=-1000000000;

        for(int i=0;i<A.size();i++){
            currentSum+=A.get(i);
            maxSum=Math.max(maxSum,currentSum);
            if(currentSum<0){
                currentSum=0;  //If Current sum is -ve, make it zero
            }
        }
        return maxSum;
    }


}
