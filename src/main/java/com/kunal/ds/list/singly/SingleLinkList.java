package com.kunal.ds.list.singly;

public class SingleLinkList {

    private Node start=null;

    public Node getStart() {
        return start;
    }

    public boolean isPalindrom(Node startPtr){

        boolean isPalindrom=true;
        if(startPtr==null || this.lengthOfList(startPtr)==1){
            return isPalindrom;
        }

        double lengthOflist=this.lengthOfList(startPtr);
        double mid=Math.ceil(lengthOflist/2);
        Node temp=startPtr;
        double count=1;
        while (count!=mid){
            temp=temp.addr;
            count++;
        }

        Node originalStart=start;
        this.display(originalStart);
        start=temp.addr;
        this.reverseLinklist(temp.addr);
       this.display(start);
         while (start!=null){
            if(start.data!=originalStart.data){
                isPalindrom=false;
                break;
            }
            start=start.addr;
            originalStart=originalStart.addr;
        }
        return isPalindrom;
    }

    public Node removeDuplicateFromSortedList(Node startPtr){

        if(startPtr==null || this.lengthOfList(startPtr)==1){
            return startPtr;
        }

        int currentVal=startPtr.data;
        Node previous=startPtr;
        Node temp=startPtr.addr;
        while (previous.addr!=null){

            if(temp==null){
                previous.addr=temp;
                break;
            }

            if(temp.data!=currentVal){
                previous.addr=temp;
                currentVal=temp.data;
                previous=temp;
            }

            temp=temp.addr;
        }

        return startPtr;
    }

    public Node deleteMiddle(Node startPtr,int indexToDelete){

       if(startPtr==null || indexToDelete<=0)
           return startPtr;

       if(indexToDelete>this.lengthOfList(startPtr))
           return startPtr;

       if(indexToDelete==1){
           start=start.addr;
           return start;
       }else {
           Node temp=start;
           int indexCounter=1;
           while (indexCounter+1!=indexToDelete){
                temp=temp.addr;
                indexCounter++;
           }
           temp.addr=temp.addr.addr;
           return start;
       }
    }

    public int lengthOfList(Node list){

        if(list==null)
            return 0;
        else {
            int temp=0;
            while (list!=null){
                temp++;
                list=list.addr;
            }
            return temp;
        }
    }

    public Node revertKBlock(Node list,int k){

        if(list==null || k > this.lengthOfList(list)){
            return list;
        }

        Node temp=list;
        int tempCount=1;
        while (tempCount!=k){
            tempCount++;
            temp=temp.addr;
        }
        revertK(start,temp.addr,1,k);

        return start;
    }

    private Node revertK(Node current,Node previous,int currentCount,int k){

        if(currentCount!=k){
            revertK(current.addr,current,++currentCount,k);
            current.addr=previous;
        }else {
            start=current;
            current.addr=previous;
        }

        return current;
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
