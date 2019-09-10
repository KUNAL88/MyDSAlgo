package com.kunal.array;



public class SearchElementInRotateArray {

    public static void main(String[] args) {
        int[] array={5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key=3;
        int partitionIndex=partitionArray(array,0,array.length-1);
        System.out.println(partitionIndex);
      /*  int index=0;
        if(partitionIndex==-1){
            index=binarySearch(array,0,array.length-1,key);
        }else if(array[partitionIndex]==key){
            System.out.println("Key found at index "+partitionIndex);
        }else {
            index=binarySearch(array,0,partitionIndex-1,key);

            if(index==-1){
                index=binarySearch(array,partitionIndex+1,array.length-1,key);
            }

        }

        if(index==-1){
            System.out.println(" Key "+key+" Does not exists");
        }else {
            System.out.println("Key "+key+" found at location "+index);
        }*/

        System.out.println(isSumExists(array,partitionIndex,113));

    }


    public static int partitionArray(int[] array,int low,int high){

        if(low>high){
            return -1;
        }

        if(low==high){
            return low;
        }

        int mid=(low+high)/2;

        if(low<mid && array[mid]>array[mid+1]){
            return mid;
        }else if(high>mid && array[mid]<array[mid-1]){
            return mid-1;
        }else {

            if(array[low]>=array[mid]){
               return partitionArray(array,low,mid-1);
            }else {
                return partitionArray(array,mid+1,high);
            }
        }
    }

    public static int binarySearch(int[] a,int low,int high,int key){

       /* int low=0;
        int high=a.length-1;*/
        int mid=0;
        while (low<=high){

            mid=(low+high)/2;

            if(key<a[mid]){
                high=mid-1;
            }else if(key>a[mid]){
                low=mid+1;
            }else {
                return mid;
            }
        }

        return -1;
    }

    public static boolean isSumExists(int[] array,int pivotIndex,int sum){
        int low=pivotIndex+1;
        int len=array.length-1;
       while (pivotIndex!=low){

           if(sum==(array[pivotIndex]+array[low])){
               return true;
           }else {

               low=(low+1)%len;
               pivotIndex--;

               if(pivotIndex<0){
                   pivotIndex=len;
               }
           }
       }

       return false;
    }
}
