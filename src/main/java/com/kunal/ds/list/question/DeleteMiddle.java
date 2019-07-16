package com.kunal.ds.list.question;

import com.kunal.ds.list.singly.SingleLinkList;

public class DeleteMiddle {

    public static void main(String[] args) {
        SingleLinkList list=new SingleLinkList();

       // list.addNodeAtStart();
        list.addNodeAtStart(10);
        list.addNodeAtStart(20);

        list.display(list.getStart());
        list.display(list.deleteMiddle(list.getStart(),2));
    }
}
