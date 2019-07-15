package com.kunal.ds.list.question;

import com.kunal.ds.list.singly.SingleLinkList;

public class BuildSortedList {

    public static void main(String[] args) {
        SingleLinkList list=new SingleLinkList();

        list.addItemAndSort(10);
        list.addItemAndSort(100);
        list.addItemAndSort(50);
        list.addItemAndSort(70);
        list.addItemAndSort(-200);
        list.addItemAndSort(1000);
        list.addItemAndSort(120);

        list.display(list.getStart());
    }
}
