package com.kunal.algo.gt.graph.spanningtree;

import com.kunal.algo.gt.graph.traversal.AdjecencyMatrix;
import com.kunal.algo.gt.graph.traversal.Weight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopologicalSort {

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

    public static void init(){
        br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println(" Enter Number of Nodes in your Grap h ...");

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
        graph= adjecency_matrix.assignWeightToGraph(graph,true,node_direction_list);
    }


    public static void main(String[] args) {
        init();
        int[] indgree=inDgree();

        for(int i=0;i<num_of_nodes;i++){
            System.out.println(i+" -- "+indgree[i]);
        }

        boolean[] isVisited=new boolean[num_of_nodes];
        for(int i=0;i<num_of_nodes;i++){
            isVisited[i]=false;
        }

        Queue<Integer> queue=new PriorityQueue<>();
        for(int i=0;i<num_of_nodes;i++){

            if(indgree[i]==0){
                queue.add(i);
                isVisited[i]=true;
            }
        }

        StringBuilder sb=new StringBuilder();
        int vertex=0;
        while (!queue.isEmpty()){
                vertex=queue.remove();
                sb.append(vertex+" ");
                for(int j=0;j<num_of_nodes;j++){

                    if(!isVisited[j] && graph[vertex][j]>0){

                        --indgree[j];
                        if(indgree[j]==0){
                            queue.add(j);
                        }
                    }
                }
        }
    }


    public static int[] inDgree(){

        int[] indgree=new int[num_of_nodes];

        int count=0;
        for(int i=0;i<num_of_nodes;i++){
            for(int j=0;j<num_of_nodes;j++){
                if(graph[j][i]>0){
                    count++;
                }
            }
            indgree[i]=count;
            count=0;
        }

        return indgree;
    }
}
