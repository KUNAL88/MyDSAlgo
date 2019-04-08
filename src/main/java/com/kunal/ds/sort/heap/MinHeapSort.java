package com.kunal.ds.sort.heap;

public class MinHeapSort implements HeapSort{

    public void sort(int a[]){

        int array_length=a.length;
        int temp=0;

        for(int n=array_length-1;n>0;n--){   //Complexity of thid loop is "n"

            //create max heap
            for(int i=n/2;i>0;i--){         //Complexity of this loop is log(n)
                heapify(a,n,i);
            }

            //Replace largest item at the root position with the last index of current iteration
            temp=a[1];
            a[1]=a[n];
            a[n]=temp;

        }

        System.out.println("Min Heap Sorted Array As Below ..");
        for (int n=1;n<array_length;n++){
            System.out.print(a[n]+"  ");
        }
        System.out.println();

    }//end sort()       complexity of complete algorithm nlog(n)

    public void heapify(int a[],int current_boundary,int parent){

        int lowest=parent;
        int left_child=parent*2;
        int right_child=parent*2+1;
        int temp;

        if (right_child<=current_boundary && a[right_child] < a[lowest]){
            lowest=right_child;
        }

        if(left_child<=current_boundary && a[left_child] < a[lowest]){
            lowest=left_child;
        }

        if(parent != lowest){
            temp=a[parent];
            a[parent]=a[lowest];
            a[lowest]=temp;
        }
    }//end heapify()



}
