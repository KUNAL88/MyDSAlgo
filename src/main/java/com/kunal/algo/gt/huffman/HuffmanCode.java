package com.kunal.algo.gt.huffman;

import java.util.PriorityQueue;
import java.util.Queue;

public class HuffmanCode {

    public static void main(String[] args) {
        Integer a[]={12,2,7,13,14,85};
        HuffmanCode code=new HuffmanCode();
       Node root= code.createHuffmanTree(a,a.length);

       code.displayHuffmanCode(root,"");

    }

    public void displayHuffmanCode(Node parent,String s){

        if(parent!=null){

            if(parent.right==null && parent.left==null){
                System.out.println(parent.data+" --- >"+s);
            }
            displayHuffmanCode(parent.left,s+0);
            displayHuffmanCode(parent.right,s+1);


        }
    }

    public Node createHuffmanTree(Integer[] a,int n){

        Queue<Node> queue=new PriorityQueue<>(
                (I1,I2) -> I1.data>I2.data ? 1 : I2.data>I1.data ? -1 : 0
        );
        Node node=null;
        for(int A:a){
            node=new Node(null,A,null);
            queue.add(node);
        }
        Node root=null;//new Node(null,null,null);
        while (!queue.isEmpty() && queue.size()>1){
            Node temp1=queue.remove();
            Node temp2=queue.remove();
            root=new Node(
                    temp1,
                    temp1.data+temp2.data,
                    temp2
            );
            queue.add(root);
        }
        return root;
    }
}

class Node {//implements Comparator<Integer>{
    Node right;
    Integer data;
    String tag;
    Node left;

    Node(Node left,Integer data,Node right){

        this.data=data;
        this.left=left;
        this.right=right;
    }

/*
    public int compare(Integer I1, Integer I2) {
        return   I1>I2 ? 1 : I2>I1 ? -1 : 0;
    }*/
}
