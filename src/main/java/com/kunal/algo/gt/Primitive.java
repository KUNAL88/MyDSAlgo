package com.kunal.algo.gt;

public class Primitive {


    public static void main(String[] args) {

       int[][] a=new int[2][2]; // int[3] a; spaceComplexity O(n2)

        a[0][0]=100;
        a[0][1]=200;
        a[1][0]=300;
        a[1][1]=400;


       System.out.println(a[0][0]);  //1 time  retrive value from array time complexity O(1)

       int[] b=new int[2];
       b[0]=1000;
       b[1]=2001;

       System.out.println(b[1]);        //1 time  retrive value from 1 D array

         }
}
