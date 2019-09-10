package com.kunal.ds.list.singly;

public class DemoSingleLIst {

    public static void main(String[] args) {
        SingleLinkList object=new SingleLinkList();
        object.addItemAtEnd(1);
        object.addItemAtEnd(0);
        object.addItemAtEnd(0);
        object.display(object.getStart());

        SingleLinkList object1=new SingleLinkList();

        object1.addItemAtEnd(1);

        object.display(object.substractTwoList(object.reverseLinkList(object.getStart())
                ,object1.reverseLinkList(object1.getStart())));

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
