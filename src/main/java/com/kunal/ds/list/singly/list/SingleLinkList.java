package com.kunal.ds.list.singly.list;

public class SingleLinkList {

    private Node start=null;


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

            System.out.println(temp.data);
            temp=temp.addr;

        }

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
