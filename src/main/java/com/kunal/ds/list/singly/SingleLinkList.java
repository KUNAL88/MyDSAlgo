package com.kunal.ds.list.singly;

import com.kunal.ds.stack.impl.Stack_Array;

import java.util.Stack;

public class SingleLinkList {

    private Node start=null;

    public void addItemAtEnd(int data){

        Node node=new Node(data,null);
        if(start==null){
            start=node;
        }else {
            Node temp=start;
            while (temp.addr!=null)
            {
                temp=temp.addr;
            }
            temp.addr=node;
        }
    }

    public Node addTwoList(Node A,Node B){

        if(A==null && B==null){
            return null;
        }else if(A!=null && B==null){
            return A;
        }else if(A==null && B!=null){
            return B;
        }
        SingleLinkList list3=new SingleLinkList();
        int carry=0;
        while (A!=null || B!=null){

            if(A!=null && B!=null){
                carry=addTwoInt(carry+A.data,B.data,list3);
                A=A.addr;       B=B.addr;
            }else if(A==null && B!=null){
                carry=addTwoInt(carry,B.data,list3);
                B=B.addr;
            }else if(A!=null && B==null){
                carry=addTwoInt(A.data,carry,list3);
                A=A.addr;
            }

        }

        if(carry>0){
            addItemAtEnd(carry);
        }

        return list3.getStart();
    }

   /* private int add(Node a,Node b,SingleLinkList c){

        int carry=-1;

        if(a.addr!=null && b.addr!=null){
            carry=add(a.addr,b.addr,c);
            return addTwoInt(carry+a.data,b.data,c);
        }else if(a==null && b.addr!=null){
            carry=add(a,b.addr,c);
            return addTwoInt();
        }else if(a.addr!=null && b.addr==null){
            carry=add(a.addr,b,c);
        }else {

                return addTwoInt(a.data,b.data,c);
            }

    }*/

    private int addTwoInt(int a,int b,SingleLinkList c) {
        int r = a + b;

        if (r == 10) {
            c.addItemAtEnd(0);
            return 1;
        } else if(r<10){
            c.addItemAtEnd(r);
            return 0;
        }else {
            int quetient = r / 10;
            int remainder = r % 10;
            c.addItemAtEnd(quetient);
            return remainder;
        }
    }

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

    public Node reverseLinkList(Node node){

        if(start==null){
            return null;
        }

        if(node.addr!=null){

            if(node==start){
                reverseLinklist(node.addr);
                node.addr.addr=node;
                node.addr=null;
            }else {
                reverseLinklist(node.addr);
                node.addr.addr=node;
            }
        }else {
            node=start;
        }

        return start;
    }

    public Node pairwiseSwap(Node currentNode){

        Node previous=null;
        if(currentNode==null || this.lengthOfList(currentNode) <=1){
            return currentNode;
        }
        Node temp=null,temp1=null;

        do {

            temp=currentNode;
            temp1=currentNode.addr.addr;

            if(currentNode==start){
                currentNode.addr.addr=currentNode;
                start=currentNode.addr;
                currentNode.addr=temp1;
                previous=temp;

            }else {
                currentNode.addr.addr=currentNode;
                previous.addr=currentNode.addr;
                previous=previous.addr.addr;
                currentNode.addr=temp1;
            }

            if(currentNode!=null || currentNode.addr!=null ){
                currentNode=currentNode.addr;
            }else {
                break;
            }
            if(currentNode==null){
                break;
            }

        }while (temp.addr!=null);

        return start;
    }

    public void segregateOddEven(Node currentNode){

        if(currentNode==null){
            return;
        }

        Node even=null;
        Node odd=null,startOfOdd=null;

        while (currentNode!=null){

            if(currentNode.data%2==1){

                if(odd==null){
                    odd=currentNode;
                    startOfOdd=odd;
                    currentNode=currentNode.addr;
                    continue;
                }

                odd.addr=currentNode;
                odd=odd.addr;
                currentNode=currentNode.addr;

            }else {

                if(even==null){
                    even=currentNode;
                    start=even;
                    currentNode=currentNode.addr;
                    even.addr=null;
                    continue;
                }

                even.addr=currentNode;
                even=even.addr;
                currentNode=currentNode.addr;
                even.addr=null;
            }
        }

        even.addr=startOfOdd;

    }

    public void moveLastNodeToFirst(Node currentNode){

        if(currentNode==null || this.lengthOfList(currentNode)<=1){
            return;
        }
        Node temp=start;
        while (temp.addr.addr!=null){
            temp=temp.addr;
        }

        temp.addr.addr=start;
        start=temp.addr;
        temp.addr=null;
    }

    public static int count=1;
    public Node revertFirstK(Node currentNode,int k){

        int lenthOfList=4;//this.lengthOfList(currentNode);

        if(currentNode==null || lenthOfList==1){
            return currentNode;
        }

        if(lenthOfList<k){
            System.out.println(" index of outOfRange  ...");
            return currentNode;
        }

        if(count!=k){
            count++;

            if(currentNode==start){
                Node temp= revertFirstK(currentNode.addr,k);
                currentNode.addr.addr=currentNode;
                currentNode.addr=temp;
                return start;
            }else {
                Node temp= revertFirstK(currentNode.addr,k);
                currentNode.addr.addr=currentNode;
                return temp;
            }

        }else {
            Node temp= currentNode.addr;
            start=currentNode;
            return temp;
        }

    }

    public Node mergeTwoList(Node list1current,Node list2current,int k){

        while (list1current.data!=k){
            list1current=list1current.addr;
        }

        Node temp=list2current;
        while (list2current.addr!=null){
            list2current=list2current.addr;
        }

        list2current.addr=list1current;
        return temp;
    }

    public Node mergePointOfLinkList(Node list1CurrentNode,Node list2CurrentNode){

        if(list1CurrentNode==null && list2CurrentNode==null){
            return null;
        }else if(list1CurrentNode.addr!=null && list2CurrentNode.addr==null){
            return list1CurrentNode;
        }

        int diff=Math.abs(this.lengthOfList(list1CurrentNode)
                -this.lengthOfList(list2CurrentNode));
        int length_1=this.lengthOfList(list1CurrentNode);
        int length_2=this.lengthOfList(list2CurrentNode);

        int count=1; Node temp=list1CurrentNode;
        while (count!=length_1-diff){
            temp=temp.addr;
            count++;
        }

        return temp.addr;



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

    public Node mergeListInReverseOrder(Node currentNodeList1,
                                        Node currentNodeList2){

        if(currentNodeList1==null && currentNodeList2==null){
            return null;
        }else if(currentNodeList1!=null && currentNodeList2==null) {
            return currentNodeList1;
        }else if(currentNodeList1==null && currentNodeList2!=null){
            return currentNodeList2;
        }

        Stack<Node> stack=new Stack<>();

        while (currentNodeList1!=null && currentNodeList2!=null){

            if(currentNodeList1.data<=currentNodeList2.data){
                stack.push(currentNodeList1);
                currentNodeList1=currentNodeList1.addr;
            }else {
                stack.push(currentNodeList2);
                currentNodeList2=currentNodeList2.addr;
            }
        }

        while (currentNodeList1!=null){
            stack.push(currentNodeList1);
            currentNodeList1=currentNodeList1.addr;
        }

        while (currentNodeList2!=null){
            stack.push(currentNodeList2);
            currentNodeList2=currentNodeList2.addr;
        }

        Node start=null,temp=null;

        while (!stack.isEmpty()){

            if(start==null){
                start=stack.pop();
                temp=start;
            }

            temp.addr=stack.pop();
            temp=temp.addr;
        }

        temp.addr=null;

        return start;
    }

    public Node quickSort(Node currentNode,int low,int high){

        if(low<high){
            int partition=partition(currentNode,low,high);

            quickSort(currentNode,low,partition-1);
            quickSort(currentNode,partition+1,high);
        }

        return start;
    }

    public int partition(Node currentNode,int low,int high){

        if(low==high){
            return high-1;
        }

        int count=0;
        Node temp=currentNode;

        while (count++!=low){
            temp=temp.addr;
        }
        Node partitionNode=temp;
        Node lowNode=null;
        Node highNode=null;
        if(currentNode.addr!=null){
            lowNode=currentNode.addr;
            low++;
        }

        count=low;
        temp=lowNode;
        if(low==high){
            highNode=lowNode;
        }else {
            while (++count!=high){
                temp=temp.addr;
            }
            highNode=temp;
        }
        int tempData=0;
        do{
            while (low<=high && lowNode.data<partitionNode.data){
                lowNode=lowNode.addr;
                low++;
            }

            while (high>low && highNode.data>partitionNode.data){
                temp=lowNode;
                while (temp.addr.data!=highNode.data && temp.data!=highNode.data){
                    temp=temp.addr;
                }
                highNode=temp;
                high--;
            }

            if(low<high){
                tempData=lowNode.data;
                lowNode.data=highNode.data;
                highNode.data=tempData;
            }else {
                break;
            }



        }while (low!=high );

        tempData=partitionNode.data;
        partitionNode.data=highNode.data;
        highNode.data=tempData;

        return high;
    }

    public Node deleteRightMax(Node currentNode){

        if(currentNode==null && currentNode.addr==null){
            return currentNode;
        }

        if(currentNode.addr.data>currentNode.data && currentNode==start){
            currentNode=currentNode.addr;
            start=currentNode;
        }

        Node previous=start;
        while (currentNode!=null){

            if(currentNode.addr!=null && currentNode.addr.data>currentNode.data){
                currentNode=currentNode.addr;
                previous.addr=currentNode;
            }else {
                previous=currentNode;
                currentNode=currentNode.addr;
            }
        }

        return start;
    }

    public Node rearrangeLinkList(Node currentNode){

        if(currentNode==null || currentNode.addr==null){
            return currentNode;
        }

        Node temp1=currentNode;
        Node temp2=currentNode;
        Node previous=temp2;

        while (true){

            while (temp2.addr!=null){
                previous=temp2;
                temp2=temp2.addr;

            }
            previous.addr=null;
            temp2.addr=temp1.addr;
            temp1.addr=temp2;

            temp1=temp1.addr.addr;
            if(temp1==null || temp1.addr==null || temp1.addr.addr==null){
                break;
            }
        }
        return start;
    }

    /*
    Rearrange a given list such that it consists of alternating minimum maximum elements
    -- Solution sort the number
     */

    /*
    Find pair for given sum in a sorted singly linked without extra space
     */
    private boolean isBorrow=false;
    private static final int k=10;
    public Node substractTwoList(Node list1CurrentNode,Node list2CurrentNode){

        Node resultNode=null;
        Node resultStart=resultNode;
        int result=0;
        int a=0,b=0;
        while (true){

            a=0;   b=0;
            if(list1CurrentNode==null && list2CurrentNode==null){
                break;
            }else {

                if(list1CurrentNode==null && list2CurrentNode==null){
                    break;
                }else if(list1CurrentNode==null && list2CurrentNode!=null){
                    b=list2CurrentNode.data;
                    list2CurrentNode=list2CurrentNode.addr;
                }else if(list1CurrentNode!=null && list2CurrentNode==null){
                    a=list1CurrentNode.data;
                    list1CurrentNode=list1CurrentNode.addr;
                }else {
                    a=list1CurrentNode.data;    list1CurrentNode=list1CurrentNode.addr;
                    b=list2CurrentNode.data;    list2CurrentNode=list2CurrentNode.addr;
                }

                if(isBorrow){

                    if(a==0){
                        a=9;
                    }else {
                        a-=1;
                        isBorrow=false;
                    }
                }

                result=substract(a,b);

                if(resultStart==null) {
                    resultStart = new Node(result, null);
                    resultNode = resultStart;
                }else {
                    resultNode=new Node(result,null);
                    resultNode.addr=resultStart;
                    resultStart=resultNode;
                }

            }

        }

        return resultStart;
    }


    private int substract(int a,int b){

        if(a<b){
            isBorrow=true;
            a+=10;
        }

        return a-b;
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
