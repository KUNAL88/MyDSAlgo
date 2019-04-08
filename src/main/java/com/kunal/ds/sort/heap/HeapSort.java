package com.kunal.ds.sort.heap;

public interface HeapSort {

    public void sort(int a[]);
    public void heapify(int a[],int current_boundary,int parent);
}
