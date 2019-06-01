package com.kunal.ds.list.question;

import com.kunal.ds.list.singly.SingleLinkList;

public class SampleQuestions {


    public static void main(String[] args) {

        SingleLinkList list_instance = new SingleLinkList();

        list_instance.findNthFromLast(2);

        Sampleinit init = () -> {
            list_instance.addNodeAtStart(10);
            list_instance.addNodeAtStart(20);
            list_instance.addNodeAtStart(30);
            list_instance.addNodeAtStart(40);
        };

        init.init();
        list_instance.display();

        //Test 1st item
        list_instance.findNthFromLast(2);
        list_instance.findNthFromLast(1);
        list_instance.findNthFromLast(0);
        list_instance.findNthFromLast(-2);

        list_instance.findNthFromLast(4);
        list_instance.findNthFromLast(5);
    }

}
interface Sampleinit{

    void init();
}
