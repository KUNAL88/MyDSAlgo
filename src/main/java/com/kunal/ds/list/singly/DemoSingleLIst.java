package com.kunal.ds.list.singly;

public class DemoSingleLIst {

    public static void main(String[] args) {
        SingleLinkList object=new SingleLinkList();

        object.search(10);


        object.addNodeAtStart(10);
        object.addNodeAtStart(20);

        object.addNodeAtStart(30);

        object.search(10);

        object.search(100);

        object.display(object.getStart());
    }

}
