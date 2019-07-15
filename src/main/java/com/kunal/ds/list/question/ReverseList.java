package com.kunal.ds.list.question;

import com.kunal.ds.list.singly.SingleLinkList;

public class ReverseList {

    public static void main(String[] args) {

        SingleLinkList list=new SingleLinkList();

        list.addNodeAtStart(10);
        list.addNodeAtStart(20);
        list.addNodeAtStart(70);
        list.addNodeAtStart(50);

        System.out.println("Before Reverse ");
        list.display(list.getStart());
        list.reverseLinklist(list.getStart());
        System.out.println("After Reverse ");
        list.display(list.getStart());

    }
}
