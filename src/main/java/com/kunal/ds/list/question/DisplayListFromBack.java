package com.kunal.ds.list.question;

import com.kunal.ds.list.singly.SingleLinkList;

public class DisplayListFromBack {

    public static void main(String[] args) {

        SingleLinkList list=new SingleLinkList();

        list.addNodeAtStart(10);
        list.addNodeAtStart(20);
        list.addNodeAtStart(70);
        list.addNodeAtStart(50);

        System.out.println(" Insertion Order ");
        list.display(list.getStart());
        System.out.println(" Reverse Order ");
        list.displayReverseLinkList(list.getStart());
    }
}
