package com.kunal.algo.gt.graph.spanningtree;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class ShortesPath {

    private static Map<Integer,Node> table=new HashMap<>();
    private static Queue<Node> queue=new PriorityQueue<>(
            (I1,I2) -> I1.distance<I2.distance ? -1 : I1.distance>I2.distance ? 1:0
    );

    private static int numNodes=5;

    private static Integer[][] graph={
            {0,  1, 4, -1, -1},
            {-1, 0, 2,  4, -1},
            {-1,-1, 0, -1,  4},
            {-1,-1,-1,  0,  4},
            {-1,-1,-1, -1,  0}

    };

    public void init(){

    }

    public static void main(String[] args) {
/*
        for(int i=0;i<numNodes;i++){
            for (int j=0;j<numNodes;j++){
                System.out.println(i+" , "+j+" - "+graph[i][j]);
            }
        }*/

        int sourceNode=0;
        Node node=new Node(sourceNode,0,null);
        table.put(sourceNode,node);
        queue.add(node);

        for(int i=1;i<numNodes;i++){
            node=new Node(i,-1,null);
            table.put(i,node);
        }

        int distance=0;
        Node lastVertex=null;
        Node currentVertex=null;
        while (!queue.isEmpty()){
            lastVertex=queue.remove();

            for(int i=0;i<numNodes;i++){

                if(graph[lastVertex.vertex][i]>0){

                    distance=lastVertex.distance+graph[lastVertex.vertex][i];
                    currentVertex=table.get(i);
                    if(currentVertex.distance==-1){
                        currentVertex.distance=distance;
                        currentVertex.viaVertex=lastVertex.vertex;
                        table.put(i,currentVertex);
                    }

                    if(currentVertex.distance>(distance)){
                        currentVertex.distance=distance;
                        currentVertex.viaVertex=lastVertex.vertex;
                        table.put(i,currentVertex);
                    }
                        queue.add(currentVertex);
                }
            }

        }
    }
}

class Node{
    Integer vertex,distance,viaVertex;

    public Node(Integer vertex,Integer distance,Integer viaVertex){
        this.vertex=vertex;
        this.distance=distance;
        this.viaVertex=viaVertex;
    }
}
