package com.kunal.algo.gt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;

public class BFS {

    private static boolean[] isVisited;
    private static Queue queue;
    private static BufferedReader br;
    private static int num_of_nodes;
    private int[][] graph;
    private AdjecencyMatrix adjecency_matrix;

    private void initialize()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println(" Enter Number of Nodes in your Graph ...");
        num_of_nodes=Integer.parseInt(br.readLine());

        isVisited=new boolean[num_of_nodes];
        for(int i=0;i<num_of_nodes;i++){
            isVisited[i]=false;
        }

        adjecency_matrix=new AdjecencyMatrix();
        graph=adjecency_matrix.buildAjecencyMatrix(num_of_nodes);

    }

    private void buildBFSGraphTraversal(){
        int startNode=0;
    }


    public static void main(String[] args) {



    }


}
