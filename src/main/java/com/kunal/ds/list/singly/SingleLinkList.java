package com.kunal.ds.list.singly;

public class SingleLinkList {

    private Node start=null;

    public void findNthFromLast(int searchAtIndexFromLast){

        if(start==null || searchAtIndexFromLast<=0){
            System.out.println(" List is Empty or "+searchAtIndexFromLast+" " +
                    "Index You entered is zero/negative ...");
            return;
        }

        int totalNumberOfItem=0;
        Node temp=start;

        while (temp!=null){
            totalNumberOfItem++;
            temp=temp.addr;

        } //complexity O(n)

        int diff=totalNumberOfItem-searchAtIndexFromLast;

        if(diff<0){
                System.out.println(searchAtIndexFromLast+" Index your searching is out of range ...");
        }else {
            temp=start;
            for(int index=0;index<diff;index++){
                temp=temp.addr;
            }//complexity O(n)

            System.out.println(searchAtIndexFromLast+" last Item is : "+temp.data);
        }

    }

    public void search(int data){

        boolean isfound=false;

        if(start==null){
            System.out.println(" List is empty ...............");
        }else {
            Node temp=start;

            while (temp!=null){

                if (temp.data==data){
                    System.out.println(" Data Found ...."+data);

                    isfound=true;
                    break;
                }

                temp=temp.addr;
            }

            if (isfound==false){
                System.out.println(" No Data Found ...");
            }
        }

    }

    public void display(){

        Node temp=start;

        while (temp!=null){

            System.out.print(temp.data+" ");
            temp=temp.addr;

        }
        System.out.println(" ");

    }


    public void addNodeAtStart(int data){

        Node node=new Node(data,null);

        if(start==null){
            start=node;
        }else {

            node.addr=start;
            start=node;
        }

    }

}

class Node{

    int data;
    Node addr;

    Node(int data,Node addr){
        this.data=data;
        this.addr=addr;

    }
}
