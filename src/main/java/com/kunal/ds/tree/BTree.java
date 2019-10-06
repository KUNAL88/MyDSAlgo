package com.kunal.ds.tree;

import com.kunal.ds.queue.Queue_Array;
import com.kunal.ds.stack.impl.Stack_Array;

import java.util.*;

public class BTree {

    private Node root=null;

    public Node getRoot() {
        return root;
    }

    public void add(int data){
        addData(data,root);
    }

    public void displayPreOrder(){
        preOrderTraversal(root);
    }

    public void displayInOrder(){
        inOrderTraversal(root);
    }

    public void displayPostOrder(){
        postOrderTraversal(root);
    }

   // Map<Integer,Integer> verticalOrdermap=new HashMap<>();
    public Map<Integer,List<Integer>> verticalOrderTraversal(Node currentNode,int verticalOrder){

        if(currentNode==null){
            return map;
        }else {

            List<Integer> list=null;
            if(!map.containsKey(verticalOrder)){
                list=new LinkedList<>();
                list.add(currentNode.data);
                map.put(verticalOrder,list);
            }else {
                list=map.get(verticalOrder);
                list.add(currentNode.data);
                map.put(verticalOrder,list);
            }

            this.verticalOrderTraversal(currentNode.left,--verticalOrder);
            this.verticalOrderTraversal(currentNode.right,++verticalOrder);
            return map;
        }
    }

    public void reverseLevelOrderTraversal(Node parent){
        if(parent==null){
            System.out.println(" Tree is empty ...");
        }
       //Initialize queue and stack
        Node[] array=new Node[50];
        Node[] array1=new Node[50];
        Queue_Array queue=new Queue_Array(array);
        Stack_Array stack=new Stack_Array(array1);

        queue.EnQueue(parent);
        while (!queue.isQueueEmpty()){
            Node currentNode=(Node) queue.DeQueue();
            stack.push(currentNode);

            if(currentNode.left!=null){
                queue.EnQueue(currentNode.left);
            }

            if(currentNode.right!=null){
                queue.EnQueue(currentNode.right);
            }
        }
        Node currentNode=null;
        while (!stack.isEmpty()){
            currentNode=(Node)stack.pop();
            System.out.print( currentNode.data+" ");
        }

    }

    public void levelOrderTraversal(Node parent){

        if(parent==null){
            System.out.println(" Tree is empty ...");
        }
        Node[] array=new Node[50];
        Queue_Array queue=new Queue_Array(array);
        queue.EnQueue(parent);

        while (!queue.isQueueEmpty()){
            Node currentNode=(Node) queue.DeQueue();
            System.out.print(currentNode.data+" ");

            if(currentNode.left!=null){
                queue.EnQueue(currentNode.left);
            }

            if(currentNode.right!=null){
                queue.EnQueue(currentNode.right);
            }
        }

    }

    public int maxValue(Node parent){
        int max=-999999999;
        if(parent==null){
            System.out.println(" Tree is empty ...");
            return max;
        }
        Node[] array=new Node[50];
        Queue_Array queue=new Queue_Array(array);
        queue.EnQueue(parent);

        while (!queue.isQueueEmpty()){
            Node currentNode=(Node) queue.DeQueue();
            if(currentNode.data>max){
                max=currentNode.data;
            }

            if(currentNode.left!=null){
                queue.EnQueue(currentNode.left);
            }

            if(currentNode.right!=null){
                queue.EnQueue(currentNode.right);
            }
        }

        return max;

    }


    private void addData(int data,Node parent){

        if(parent==null){
            Node node=new Node(null,data,null);
            root=node;

        }else if (data < parent.data && parent.left!=null){
            addData(data,parent.left);
        }else if (data > parent.data && parent.right!=null){
            addData(data,parent.right);
        }else {

            Node node=new Node(null,data,null);
            if(data < parent.data && parent.left == null){

                parent.left=node;
            }else if(data > parent.data && parent.right ==null){
                parent.right=node;
            }

        }


    }


    private void preOrderTraversal(Node parent){

        if (parent!=null){
            System.out.println(parent.data);
            preOrderTraversal(parent.left);
            preOrderTraversal(parent.right);
        }

    }

    private void inOrderTraversal(Node parent){

        if(parent!=null){
            inOrderTraversal(parent.left);
            System.out.println(parent.data);
            inOrderTraversal(parent.right);
        }
    }

    private void postOrderTraversal(Node parent){

        if (parent!=null){
            postOrderTraversal(parent.left);
            postOrderTraversal(parent.right);
            System.out.println(parent.data);
        }
    }

    public int heightOfTree(Node parent){

        int leftSubTreeHT=0,rightSubtreeHT=0;
        if(parent==null){
            return 0;
        }

        leftSubTreeHT=heightOfTree(parent.left)+1;
        rightSubtreeHT=heightOfTree(parent.right)+1;

        if(leftSubTreeHT>rightSubtreeHT){
            return leftSubTreeHT;
        }else {
            return rightSubtreeHT;
        }
    }

    public int findDeepestNode(Node parent){

        if(parent==null){
            return 0;
        }

        Node currentNode=null;
        Node[] array=new Node[50];
        Queue_Array<Node> queue=new Queue_Array<>(array);
        queue.EnQueue(parent);

        while (!queue.isQueueEmpty()){
            currentNode=queue.DeQueue();

            if(currentNode.left!=null){
                queue.EnQueue(currentNode.left);
            }

            if(currentNode.right!=null){
                queue.EnQueue(currentNode.right);
            }
        }

        return currentNode.data;
    }

    public void zigzagTraversal(Node parent,int level){

        if(parent==null){
            System.out.println(" Tree is empty ... ");
            return;
        }
        DataLevel tempDataLevel=null;
        DataLevel[] array=new DataLevel[50];
        Queue_Array<DataLevel> queue=new Queue_Array<>(array);
        queue.EnQueue(new DataLevel(parent,0));

        DataLevel[] reverseData=new DataLevel[50];
        Stack_Array<DataLevel> stack=new Stack_Array<>(reverseData);

        while (!queue.isQueueEmpty()){
            tempDataLevel=queue.DeQueue();

            if(tempDataLevel.getData().left!=null){
                queue.EnQueue(new DataLevel(tempDataLevel.getData().left
                        ,tempDataLevel.getLevel()+1));
            }

            if(tempDataLevel.getData().right!=null){
                queue.EnQueue(new DataLevel(tempDataLevel.getData().right
                        ,tempDataLevel.getLevel()+1));
            }

            while (!stack.isEmpty() && stack.topOfStck().getLevel()<tempDataLevel.getLevel() )
            {
                System.out.print(stack.pop().getData().data+" - ");
            }

            if(tempDataLevel.getLevel()%2==0){

                stack.push(tempDataLevel);

            }else {
                System.out.print(tempDataLevel.getData().data+"  ");
            }
        }

        while (!stack.isEmpty()  )
        {
            System.out.print(stack.pop().getData().data+" - ");
        }
    }

    public boolean isSymmetricTree(Node parent1,Node parent2){

        if(parent1==null && parent2==null){
            return true;
        }

        if((parent1==null && parent2!=null) || (parent1!=null && parent2==null)){
            return false;
        }

        if(parent1.data==parent2.data
                && isSymmetricTree(parent1.left,parent2.left)
                && isSymmetricTree(parent1.right,parent2.right)){
            return true;
        }else {
            return false;
        }
    }

    Queue_Array<Integer> queue=new Queue_Array<>(new Integer[30]);
    public void reverseTreePath(Node currentNode){

        if(currentNode!=null){
            queue.EnQueue(currentNode.data);
            reverseTreePath(currentNode.left);
            currentNode.data=queue.DeQueue();
           // reverseTreePath(currentNode.right);
        }
    }

    Map<Integer,List<Integer>> map=new HashMap<>();


    public void diagonalTraversal(Node currentNode,Integer diagonalIndex){

        if(currentNode!=null){

           if(!map.containsKey(diagonalIndex)){
               List<Integer> arrayList=new ArrayList<>();
               arrayList.add(currentNode.data);
               map.put(diagonalIndex,arrayList);
           } else {
               map.get(diagonalIndex).add(currentNode.data);
           }

           if(currentNode.right!=null){
                diagonalTraversal(currentNode.right,diagonalIndex);
           }

           if(currentNode.left!=null){
               diagonalTraversal(currentNode.left,diagonalIndex+1);
           }
        }

    }


    public Node createMirrorOfTree(Node currentNode){

        if(currentNode==null){
            return currentNode;
        }

        Node temp=currentNode.left;
        currentNode.left=currentNode.right;
        currentNode.right=temp;

        createMirrorOfTree(currentNode.left);
        createMirrorOfTree(currentNode.right);

        return currentNode;
    }

    public boolean isPathSumExists(Node currentNode,int sum){
       boolean flag=false;
       if(sum==0){
           flag= true;
       }else if(currentNode==null){
            flag= false;
        }else {

           flag=isPathSumExists(currentNode.left,sum-currentNode.data);

          if(!flag){
              flag=isPathSumExists(currentNode.right,sum-currentNode.data);
          }
       }
        return flag;
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

class DataLevel{

    private Node data;
    private int level;

    public DataLevel(Node data,int level){
        this.data=data;
        this.level=level;
    }

    public Node getData() {
        return data;
    }

    public int getLevel() {
        return level;
    }
}
