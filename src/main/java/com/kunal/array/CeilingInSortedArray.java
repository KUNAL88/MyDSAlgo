/*
package com.kunal.array;

import java.util.ArrayList;
import java.util.List;

public class CeilingInSortedArray {

    public static void main(String[] args) {
        int array[]={1, 2, 8, 10, 10, 12, 19};

        System.out.println(ceilingOf(array,9));

    }

    public static int ceilingOf(int[] array,int key){

       */
/* int ceiling=-1;
        for(int i=0;i<array.length;i++){

            if(array[i]<key){
                continue;
            }else if (array[i]>key && ceiling==-1){
                   ceiling=array[i];
            }
        }*//*


       int low=0;
       int high=array.length;
       int mid=0;

       while (low<=high){

           mid=(low+high)/2;

           if(array[mid]> key && array[mid-1]<=key){
                return mid;
           }else if(array[mid]<key){
               low=mid+1;
           }else if(array[mid]>key){
               high=mid-1;
           }
       }

        return -1;
    }


    public List<Integer> findPeak(int[] array){

        List<Integer> list=new ArrayList<>();
        int low=0,high=array.length;
        int mid=0;

        while (low<=high){

            mid=(low+high)/2;

            if(mid!=0 && mid!=array.length-1
                    && array[mid]>array[mid-1] && array[mid]>array[mid+1]){
                list.add(array[mid]);
            }


        }

    }
}
*/
