package com.kunal.ds.list.singly;

public class DemoLinkList_Set2 {

    public static void main(String[] args) {
        SingleLinkList object=new SingleLinkList();

        object.addNodeAtStart(40);
        object.addNodeAtStart(15);
        object.addNodeAtStart(10);


        object.addNodeAtStart(5);



        object.display(object.getStart());

        SingleLinkList object1=new SingleLinkList();


        object1.addNodeAtStart(20);
        object1.addNodeAtStart(3);
        object1.addNodeAtStart(2);

        object1.display(object1.getStart());

        object.display(object.mergeListInReverseOrder(object.getStart(),object1.getStart()));



    }
}
