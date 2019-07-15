package com.kunal.ds.list.singly;

public class SingleLinkList {

    private Node start=null;

    public Node getStart() {
        return start;
    }

public Node mergeTwoSortedList(Node list_A,Node list_B){

        if(list_A==null && list_B==null){
            return null;
        }else if(list_A==null && list_B!=null){
            return list_B;
        }else if (list_A!=null && list_B==null){
            return list_A;
        }

        Node result=null,startOfResult=null;

        while (list_A!=null && list_B!=null){

            if(list_A.data<=list_B.data){

                if(result!=null){
                    result.addr=merege(result,list_A);
                    result=result.addr;
                }
                else{
                    result=merege(result,list_A);
                    startOfResult=result;
                }


                list_A=list_A.addr;
               // result=result.addr;
            }else {//(list_B.data < list_A.data){

                if(result!=null){
                    result.addr=merege(result,list_B);
                    result=result.addr;
                }
                else{
                    result=merege(result,list_B);
                    startOfResult=result;
                }
                list_B=list_B.addr;
            }

        }

        if(list_A==null){
            result.addr=list_B;
        }else {
            result.addr=list_A;
        }

        return startOfResult;
}

 private Node merege(Node result,Node currentNode){

    //System.out.print("Current Node "+currentNode.data);
    if(result==null){
        result=currentNode;
        return result;
    }else {
        result.addr=currentNode;
        return result.addr;
    }

 }

    /*
    Reverse link list
     */
public void reverseLinklist(Node node){
    boolean isFirsNode=false;
    if(start==null){
        System.out.println("List is empty ....");
        return ;
    }
    if(node.addr!=null){ //other than end node

        if(start==node){ //find if node identified is first node
            reverseLinklist(node.addr);
            node.addr.addr=node;
            node.addr=null;
        }else { //other than first node
            reverseLinklist(node.addr);
            node.addr.addr=node;
        }
    }else { //end node
        start=node;
        return ;
    }
}

public void displayReverseLinkList(Node node){

    if(start==null){
        System.out.println(" List is empty ...");
    }

    if(node!=null){
        displayReverseLinkList(node.addr);
        System.out.print(" "+node.data);
    }
}

/*
Create a sorted list or insert a node into sorted list
 */
    public void addItemAndSort(int data){
        Node node=new Node(data,null);
        boolean isMiddle=false;

        if(start==null){
            start=node;
            return;
        }

        Node temp=start;
        while (temp.addr!=null && data>=temp.data && data>temp.addr.data ){
            temp=temp.addr;
        }

        if(temp.addr!=null && data>=temp.data && data<temp.addr.data){
            isMiddle=true;
        }

        if(!isMiddle && temp==start && temp.addr!=null){ //first node
            node.addr=start;
            start=node;
        }else if(temp.addr==null){//last node
            temp.addr=node;
        }else {         //middle node
            node.addr=temp.addr;
            temp.addr=node;
        }
    }

/*
Find nth last item in the link list
*/
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

    public void display(Node temp){

       // Node temp=start;
        if(temp==null){
            System.out.println("List is Empty ...");
        }

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
