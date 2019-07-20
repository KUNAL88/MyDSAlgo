package com.kunal.ds.list.question;

import com.kunal.ds.list.singly.SingleLinkList;

public class Palindrom {

    public static void main(String[] args) {

        SingleLinkList list=new SingleLinkList();

        list.addNodeAtStart(1);
        list.addNodeAtStart(2);
        list.addNodeAtStart(3);
        list.addNodeAtStart(6);
        list.addNodeAtStart(4);
        list.addNodeAtStart(3);
        list.addNodeAtStart(2);
        list.addNodeAtStart(1);

        list.display(list.getStart());
        if(list.isPalindrom(list.getStart())) {
            System.out.println(" List is palindrom ... ");
        }else {
            System.out.println(" List is not palindrom .. ");
        }

    }
}
