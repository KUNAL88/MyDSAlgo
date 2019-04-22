package com.kunal.ds.search;

public class BinarySearch {

    private static int sizeOfArray=5;
    private static int[] sampleData={10,20,30,40,50};


    public static void main(String[] args) {

        int data=15;
        int key= binarySearch(data);

        if (key!=-1){
            System.out.println(" Data Found at position ... "+(key+1));
        }else {
            System.out.println(" Data Does not exists .... ");
        }

    }


    public static int binarySearch(int data){

        int high=sampleData.length-1;
        int low=0;
        int mid=0;

        while (low<=high){

            mid=(low+high)/2;

            if(data<sampleData[mid]){
                high=mid-1;
            }else if (data>sampleData[mid]){
                low=mid+1;
            }else {
                return mid;
            }

        }

       return -1;


    }
}
