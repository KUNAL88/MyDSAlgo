package com.kunal.ds.hash;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class AddFour {

    public static void main(String[] args) {
        int [] s=  {1, 0 ,-1, 0 ,-2 ,2};
        int ta=0;
        new AddFour().fourSum(s,ta);
    }

    public int[][] fourSum(int[] A, int B) {

        Map<Integer,Integer> map=new TreeMap<Integer,Integer>();

        for(int i=0;i<A.length;i++){
            map.put(A[i],i);
        }

        Iterator<Integer> itr=map.keySet().iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        return null;
    }
}

