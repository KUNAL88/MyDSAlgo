package com.kunal.ds.tree;

public class BTreeDemo {

    public static void main(String[] args) {

        BTree tree=new BTree();

        tree.add(50);
        tree.add(10);
        tree.add(100);
        tree.add(200);
        tree.add(5);
        tree.add(1);

        System.out.println(" --- InOrderTraversal --- ");
        tree.displayInOrder();

        System.out.println(" --- PreOrderTraversal --- ");
        tree.displayPreOrder();

        System.out.println(" --- PostOrderTraversal --- ");
        tree.displayPostOrder();

    }
}
