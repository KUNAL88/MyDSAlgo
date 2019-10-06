package com.kunal.ds.tree;

import java.util.List;
import java.util.Map;

public class BTreeDemo {

    public static void main(String[] args) {

       /* BTree tree1=new BTree();

        tree1.add(50);
        tree1.add(10);
        tree1.add(150);
        tree1.add(200);
        tree1.add(5);
        // tree.add(1);
        tree1.add(100);

*/
        BTree tree=new BTree();

        tree.add(50);
        tree.add(10);
        tree.add(150);
        tree.add(200);
        tree.add(5);
        tree.add(20);
        tree.add(100);

        tree.displayInOrder();
      //  tree.createMirrorOfTree(tree.getRoot());
        System.out.println(tree.isPathSumExists(tree.getRoot(),400));
      //  tree.displayInOrder();
       /* tree.displayInOrder();
        tree.reverseTreePath(tree.getRoot());
        System.out.println("After Reversing  ...");
        tree.displayInOrder();*/

       /* tree.diagonalTraversal(tree.getRoot(),0);
        Map<Integer,List<Integer>> map=tree.map;*/

     //  Map<Integer,List<Integer>> map=tree.verticalOrderTraversal(tree.getRoot(),0);




    }
}
