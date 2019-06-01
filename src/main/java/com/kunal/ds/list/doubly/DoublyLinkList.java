package com.kunal.ds.list.doubly;

public class DoublyLinkList {

    private Node start=null;
    private Node end=null;
/*
Algorithm : Add Node at First
Initially : start=null and end=null
1. Create A Node
2. Check if Node created in step#1 is first Node
    - If Yes, start and end will point to node created in step#1
    - If No, then add the new node created in step#1 at the start and point start pointer to start
            of the link list

3. Exit
 */

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

/*
Algorithm : Add Node at Last
Initially : start=null and end=null
1. Create A Node
2. Check if Node created in step#1 is first Node
    - If Yes, start and end will point to node created in step#1
    - If No, then add the new node created in step#1 at the end and point end pointer to end
            of the link list

3. Exit
 */

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


/*
Algorithm : Add Node at Middle
Initially : start=null and end=null
1. If Start and End are null, link list is empty , return
2. Assuption link list exists i.e. start ptr points to start of the list and end ptr points to end of the list
    a. Create a new node say "node"
    b. Initalize temp ptr with start ptr i.e. temp=start;
    c. Move temp ptr till the index , after which we want to add a node i.e.
       int count=0;
       do(){
       count++;
       temp=temp.right;
       }while(count!=index);
    d. Now add new node in middle
        node.right=temp.right;
        temp.right.left=node;
        node.left=temp;
        temp.right=node;
3. Assumption new node to be added is out of range
    - link list contains 4 node
    - user requests node to be added after 5th node
    - retun "node is out of range";
4. Exit
 */
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
