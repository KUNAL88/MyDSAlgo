package com.kunal.ds.list.question;

import com.kunal.ds.list.circular_singly.SinglyCircular;

public class FindCircleInList {

    public static void main(String[] args) {
        SinglyCircular circularList=new SinglyCircular();

        circularList.addStart(10);
        circularList.addStart(20);
        circularList.addStart(30);

        circularList.display();
    }
}
