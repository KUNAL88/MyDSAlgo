package com.kunal.ds.list.question;

import com.kunal.ds.list.singly.SingleLinkList;

public class MergeTwoSortedList {

    public static void main(String[] args) {

        SingleLinkList list_1=new SingleLinkList();
        list_1.addItemAndSort(1000);
        list_1.addItemAndSort(5000);
        list_1.addItemAndSort(10000);
        list_1.addItemAndSort(15000);
        list_1.addItemAndSort(40000);
        System.out.print("First List start->");
        list_1.display(list_1.getStart());

        SingleLinkList list_2=new SingleLinkList();
        list_2.addItemAndSort(0);
        list_2.addItemAndSort(20);
        list_2.addItemAndSort(70);
        list_2.addItemAndSort(170);
        list_2.addItemAndSort(200);
        list_2.addItemAndSort(300);
        list_2.addItemAndSort(500);
        System.out.print("Second List start->");
        list_2.display(list_2.getStart());

        SingleLinkList merge=new SingleLinkList();
        System.out.println("After Merging two lists ....");
        merge.display(merge.mergeTwoSortedList(list_1.getStart(),list_2.getStart()));


    }
}
