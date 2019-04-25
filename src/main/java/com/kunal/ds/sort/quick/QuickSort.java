package com.kunal.ds.sort.quick;

public class QuickSort {

    public static void main(String[] args) {

        int a[]={10,2,100,50,30,70};

        System.out.println("Unsorted Array .....");
        for(int i=0;i<a.length;i++)
        System.out.print(a[i]+"   ");

        quickSort(a,0,a.length-1);

        System.out.println();
        System.out.println("Sorted Array .....");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+"   ");


    }

    private static void quickSort(int[] a,int low,int high){

        int pivotIndex=0;

        if (low<high){
            pivotIndex=partition(a,low,high);

            quickSort(a,low,pivotIndex-1);
            quickSort(a,pivotIndex+1,high);
        }
    }


    private static int partition(int[] a,int low,int high){

        int temp=0;
        boolean isDone=false;
        int pivotIndex=low;
        int pivotElement=a[pivotIndex];
        low++;

        while (!isDone){

            while (low<=high && a[low]<pivotElement){
                low++;
            }

            while (high>=low && a[high]>pivotElement){
                high--;
            }

            if(high<low){
                isDone=true;
            }else {
                temp=a[low];
                a[low]=a[high];
                a[high]=temp;
            }
        }

        temp=a[pivotIndex];
        a[pivotIndex]=a[high];
        a[high]=temp;

        return high;
    }

}
