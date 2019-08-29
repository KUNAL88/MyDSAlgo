package com.kunal.ds.hash;

import java.util.HashMap;

public class AddTwoNum {

    public static void main(String[] args) {
        int[] A={2, 7, 11, 15};
        int B=9;
        new AddTwoNum().twoSum(A,B);
    }

    public int[] twoSum(final int[] A, int B) {

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<A.length;i++){
            map.put(A[i],i);
        }

        for(int i=0;i<A.length;i++){

            if((map.containsKey(B-A[i]))){
                System.out.println(A[i]+"Index "+i);
                System.out.println(B-A[i]+"Index "+map.get(B-A[i]));
                break;
            }
        }
        return null;
    }
}
