package com.kunal.array;

import java.util.*;

public class LargestNumber {

    public static void main(String[] args) {

       final List<Integer> l=new LinkedList<>();
       //3, 30, 34, 5, 9

        l.add(3); l.add(30);  l.add(34);  l.add(5);   l.add(9);

        new LargestNumber().largestNumber(l);
    }

    public String largestNumber(final List<Integer> A) {

        System.out.println(A);
        Collections.sort(A,new MyComparator());
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<A.size();i++){
            sb.append(A.get(i));
        }
        System.out.println(sb.toString());
        return "";
    }
}
