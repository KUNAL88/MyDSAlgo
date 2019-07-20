package com.kunal.ds.list.question;

import com.kunal.ds.list.singly.SingleLinkList;

public class AddTwoList {

    public static void main(String[] args) {



        SingleLinkList list1=new SingleLinkList();
      /*  list1.addNodeAtStart(3);
        list1.addNodeAtStart(4);
        list1.addNodeAtStart(2);*/


        System.out.println("Original list 1 ");
        list1.display(list1.getStart());
        list1.reverseLinklist(list1.getStart());
        System.out.println("Reverted ...--> ");
                list1.display(list1.getStart());

        SingleLinkList list2=new SingleLinkList();
       /* list2.addNodeAtStart(4);
        list2.addNodeAtStart(6);
        list2.addNodeAtStart(5);*/

        System.out.println("Original list 2");
        list2.display(list2.getStart());
        list2.reverseLinklist(list2.getStart());
        System.out.println("Reverted ...--> ");
        list1.display(list2.getStart());

        System.out.println(" After Addition ... ");
        SingleLinkList list3=new SingleLinkList();
       list3.display(list3.addTwoList(list1.getStart(),list2.getStart()));

       /* SingleLinkList list=new SingleLinkList();
        list.addItemAtEnd(10);
        list.addItemAtEnd(8);
        list.addItemAtEnd(5);
        list.display(list.getStart());*/

    }
}
