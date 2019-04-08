package com.kunal.ds.sort.heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver {

    static HeapSort heap_sort_instance=null;
    public static void main(String[] args) throws IOException{

        int array_length=0;
        int[] array=null;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("How Many Elements You Wish to Sort ");
        array_length=Integer.parseInt(br.readLine());

        System.out.println("Insert Values you want to sort ....");
        array=new int[array_length+1];

        for (int n=1;n<=array_length;n++){
            array[n]=Integer.parseInt(br.readLine());
        }

        System.out.println("Unsorted Array As Below ..");
        for (int n=1;n<=array_length;n++){
            System.out.print(array[n]+"  ");
        }
        System.out.println();

        heap_sort_instance=new MaxHeapSort();
        heap_sort_instance.sort(array);

        heap_sort_instance=new MinHeapSort();
        heap_sort_instance.sort(array);



    }
}
