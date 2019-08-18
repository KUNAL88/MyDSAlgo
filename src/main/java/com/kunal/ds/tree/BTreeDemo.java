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
        tree.add(150);
        tree.add(210);
        tree.add(211);

      /*  System.out.println(" --- InOrderTraversal --- ");
        tree.displayInOrder();

        System.out.println(" --- PreOrderTraversal --- ");
        tree.displayPreOrder();

        System.out.println(" --- PostOrderTraversal --- ");
        tree.displayPostOrder();*/

     /* tree.levelOrderTraversal(tree.getRoot());
      System.out.print("\n");
      tree.reverseLevelOrderTraversal(tree.getRoot());*//*

    // System.out.print(tree.maxValue(tree.getRoot()));
        System.out.println(tree.heightOfTree(tree.getRoot()));*/

        System.out.println(tree.findDeepestNode(tree.getRoot()));

    }
}
