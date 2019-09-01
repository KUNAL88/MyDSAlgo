package com.kunal.ds.list.singly;

public class DemoSingleLIst {

    public static void main(String[] args) {
        SingleLinkList object=new SingleLinkList();

        object.addNodeAtStart(10);
        object.addNodeAtStart(1);
        object.addNodeAtStart(15);
        object.addNodeAtStart(6);
        object.addNodeAtStart(2);
       // object.addNodeAtStart(10);
        object.display(object.getStart());

        object.display(object.quickSort(object.getStart(),0,4));




    }



   /* private static void test(StringBuilder a,StringBuilder b,int k){



        StringBuilder sb=new StringBuilder("hello");
        StringBuilder sb1=new StringBuilder();
        sb1.append("kunal");
        int k=10;

        System.out.println(sb+" "+sb1+" "+k);
        test(sb,sb1,k);
        System.out.println(sb+" "+sb1+" "+k);
        a=null;
        b.append("hello");
        k=100;
    }*/

}
