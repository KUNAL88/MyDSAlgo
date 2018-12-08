package com.kunal.ds.list;

public class Demo_DoublyLinkList {

    public static void main(String[] args) {
        DoublyLinkList dlist=new DoublyLinkList();

        dlist.addFirst(30);
        dlist.addLast(50);
        dlist.addFirst(10);
        dlist.addLast(70);
        dlist.addMiddle(3,20);

        System.out.println(" Displaying all the item in forward direction ...");
        dlist.displayFromStart();

      //  System.out.println(" Diplaying all the item in backword direction ...");
      //  dlist.displayFromEnd();

        dlist.deleteEnd();

        System.out.println(" Displaying all the item in forward direction ...");
        dlist.displayFromStart();

        dlist.deleteFromStart();

        System.out.println(" Displaying all the item in forward direction ...");
        dlist.displayFromStart();
    }
}
