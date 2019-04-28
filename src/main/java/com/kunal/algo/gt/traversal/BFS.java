package com.kunal.algo.gt.traversal;

import com.kunal.ds.que.Queue_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BFS {

    private static boolean[] isVisited;
    private static Queue queue;
    private static BufferedReader br;
    private static int num_of_nodes;
    private static int[][] graph;
    private static AdjecencyMatrix adjecency_matrix;
    private static Weight weight=null;
    private static int src,dst,wt;
    private static List<Weight> node_direction_list;
    private static boolean isDone=false;

    private static void initialize(){

        br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println(" Enter Number of Nodes in your Graph ...");

        try {
            num_of_nodes=Integer.parseInt(br.readLine());
        }catch (IOException e){
            System.out.println(e);
        }

        isVisited=new boolean[num_of_nodes];
        for(int i=0;i<num_of_nodes;i++){
            isVisited[i]=false;
        }

        node_direction_list=new ArrayList<Weight>();
        adjecency_matrix=new AdjecencyMatrix();
        graph=adjecency_matrix.buildAjecencyMatrix(num_of_nodes);

        System.out.println(" Defining Vertex Connectivity Now .... ");

        try {
            while (!isDone){
                System.out.print("Enter Source :- ");
                src=Integer.parseInt(br.readLine());

                System.out.print("\n Enter Destination :- ");
                dst=Integer.parseInt(br.readLine());

                System.out.print("\n Enter Weight :- ");
                wt=Integer.parseInt(br.readLine());

                if(src >= num_of_nodes || dst >= num_of_nodes){
                        System.out.println("Error : source/destination index can not be grater than "+num_of_nodes);
                        System.exit(0);
                }

                weight=new Weight();
                weight.setSrc_index(src);
                weight.setDst_index(dst);
                weight.setWeight(wt);

                node_direction_list.add(weight);

                System.out.print("Done ?(y/n) : ");
                if(br.readLine().equalsIgnoreCase("y")){
                    isDone=true;
                }

            }

        }catch (Exception e){

            System.out.println("IOException Encountered ... "+e);
        }
        graph= adjecency_matrix.assignWeightToGraph(graph,false,node_direction_list);
    }

    private static void buildBFSGraphTraversal(){
        initialize();
        System.out.println("Graph is SuccessFully Created ......");

        int currentVertex=0;
        String visited_node_sequence=""+currentVertex;

        Queue_Array.EnQueue(0);
        isVisited[currentVertex]=true;

        while (!Queue_Array.isQueueEmpty()){

            currentVertex=Queue_Array.DeQueue();

            for(int i=0;i<num_of_nodes;i++){

                if(isVisited[i]==false && graph[currentVertex][i]!=0){
                    Queue_Array.EnQueue(i);
                    isVisited[i]=true;
                    visited_node_sequence=visited_node_sequence+" "+i;

                }
            }
        }

        System.out.println("Node Visited in following Sequence : "+visited_node_sequence);

    }

    public static void main(String[] args) {

        buildBFSGraphTraversal();

    }


}
