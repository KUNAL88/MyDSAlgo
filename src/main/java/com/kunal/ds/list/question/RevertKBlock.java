package com.kunal.ds.list.question;

import com.kunal.ds.list.singly.SingleLinkList;

public class RevertKBlock {

    public static void main(String[] args) {

        SingleLinkList list=new SingleLinkList();
        list.addNodeAtStart(8);
        list.addNodeAtStart(4);
        list.addNodeAtStart(3);
        list.addNodeAtStart(0);
        list.addNodeAtStart(10);
        list.addNodeAtStart(6);

        list.display(list.getStart());
        list.display(list.revertKBlock(list.getStart(),3));

    }
}
