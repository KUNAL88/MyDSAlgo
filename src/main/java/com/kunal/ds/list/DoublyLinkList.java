package com.kunal.ds.list;

public class DoublyLinkList {

    private Node start=null;
    private Node end=null;

    public void addFirst(int data){

        Node node=new Node(null,data,null);

        if(start==null && end==null){
            start=node;
            end=node;
        }else{

            node.right=start;
            start.left=node;
            start=node;
        }
    }

    public void addLast(int data){

        Node node=new Node(null,data,null);

        if(start==null && end==null){
            start=node;
            end=node;
        }else{
            node.left=end;
            end.right=node;
            end=node;
        }
    }


    public void addMiddle(int index,int data){

        Node node=new Node(null,data,null);

        if(index==1){

            if(start==null){
                start=end=node;
            }else{
                node.right=start;
                start.left=node;
                start=node;
            }

            return;

        }else {

            Node temp=start;
            Node temp2=temp;

            int count=1;

            while (temp.right !=null){

                if(count==index){

                    break;
                }
                temp2=temp;
                temp=temp.right;
                count++;
            }

            if(count==index ){

                node.right=temp;
                temp2.right=node;
                node.left=temp2;
                temp.left=node;
            }else {
                System.out.println(" Location "+index+" Is out of range ... ");
            }

            return;
        }

    }

    public void displayFromStart(){

        if(start==null){
            System.out.println(" List is empty ....");
        }else {
            Node temp=start;

            while (temp!=null){
                System.out.println(temp.data);
                temp=temp.right;
            }
        }

    }

    public void displayFromEnd(){

        if(end==null){
            System.out.println(" List is empty ...");
        }else {
            Node temp=end;

            while (temp!=null){
                System.out.println(temp.data);
                temp=temp.left;
            }
        }
    }

    public void deleteFromStart(){

        if(start==null){
            System.out.println(" List is empty ..");
        }else{
            System.out.println(" Node deleted is "+start.data);

            start=start.right;
            start.left=null;

            if(start==null){
                end=start;
            }

        }

    }

    public void deleteEnd(){

        if(end==null){
            System.out.println(" List is deleted ..");
        }else {
            System.out.println(" Item deleted is "+end.data);
            end=end.left;
            end.right=null;

            if(end==null){
                start=end;
            }
        }
    }

}

class Node{

    Node left;
    int data;
    Node right;

    Node(Node left,int data,Node right){
            this.left=left;
            this.data=data;
            this.right=right;
    }

}
