package com.kunal.ds.list.question;

import com.kunal.ds.list.singly.SingleLinkList;

public class RemoveDuplicateSortedList {

    public static void main(String[] args) {

        SingleLinkList list=new SingleLinkList();

       /* list.addItemAndSort(1);
        list.addItemAndSort(1);
        list.addItemAndSort(2);
        list.addItemAndSort(3);
        list.addItemAndSort(3);*/

        list.display(list.getStart());
        list.display(list.removeDuplicateFromSortedList(list.getStart()));

    }
}
