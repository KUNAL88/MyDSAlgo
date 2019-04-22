package com.kunal.ds.tree;

public class BTree {

    private Node root=null;

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
            preOrderTraversal(parent.left);
            System.out.println(parent.data);
            preOrderTraversal(parent.right);
        }
    }

    private void postOrderTraversal(Node parent){

        if (parent!=null){
            postOrderTraversal(parent.left);
            postOrderTraversal(parent.right);
            System.out.println(parent.data);
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
