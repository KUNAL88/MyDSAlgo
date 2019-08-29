package com.kunal.algo.gt.graph.traversal;

import com.kunal.ds.queue.Queue_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;


/*
This class calculate BFS using adj list ...

 */

//dvbjsvskndsfdsfdsfjsdjs


public class BFS_AdjList {

    private static BufferedReader br;
    private static int num_of_nodes;
    private static AdjecencyList adjList;

    public static void buildBFSTraversal(){

        br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println(" Enter Number of Nodes in your Graph ...");

        try {
            num_of_nodes=Integer.parseInt(br.readLine());
        }catch (IOException e){
            System.out.println(e);
        }

        adjList=new AdjecencyList();
        List<NodeWeight>[] graph=adjList.buildAdjecenceyList(num_of_nodes,false);

        boolean[] isVisited=new boolean[num_of_nodes];
        for(int i=0;i<num_of_nodes;i++){
            isVisited[i]=false;
        }

        NodeWeight nwt;
        int currentNode=0;
        int startNode=0;
        String node_visited_seq="  "+startNode;
        Integer[] array=new Integer[50];
        Queue_Array queue=new Queue_Array(array);
        queue.EnQueue(startNode);
        isVisited[startNode]=true;

        while (!queue.isQueueEmpty()){

            currentNode=(Integer) queue.DeQueue();
            List<NodeWeight> path=graph[currentNode];

            Iterator<NodeWeight> pathItr=path.iterator();
            while (pathItr.hasNext()){

                nwt=pathItr.next();

                if(isVisited[nwt.getNode()]==false){
                    queue.EnQueue(nwt.getNode());
                    isVisited[nwt.getNode()]=true;
                    node_visited_seq=node_visited_seq+nwt.getNode();
                }
            }
        }

        System.out.println("Node Visited in following Sequence : "+node_visited_seq);

    }

    public static void main(String[] args) {

        buildBFSTraversal();
    }
}
