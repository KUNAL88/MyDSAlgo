package com.kunal.ds.tree;

import com.kunal.ds.queue.Queue_Array;
import com.kunal.ds.stack.impl.Stack_Array;

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
