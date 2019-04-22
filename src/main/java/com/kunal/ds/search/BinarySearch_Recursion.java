package com.kunal.ds.search;

public class BinarySearch_Recursion {

    private static int sizeOfArray=5;
    private static int[] sampleData={10,20,30,40,50};

    public static void main(String[] args) {

        int data=00;
        int key= binarySearch(data,0,sampleData.length-1);

        if (key!=-1){
            System.out.println(" Data Found at position ... "+(key+1));
        }else {
            System.out.println(" Data Does not exists .... ");
        }

    }

    public static int binarySearch(int data,int low,int high){

        int key=-1;
        if(low<=high){

            int mid=(low+high)/2;

            if(data>sampleData[mid]){
                key=binarySearch(data,mid+1,high);
            }else if(data<sampleData[mid]){
                key=binarySearch(data,low,mid-1);
            }else {
                return mid;
            }


        }

        return key;


    }

}

