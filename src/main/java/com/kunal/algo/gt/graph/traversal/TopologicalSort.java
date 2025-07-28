package com.kunal.algo.gt.graph.traversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopologicalSort {

    public void demoTopologicalSort(List<NodeWeight>[] graph, int numOfVertices) throws IOException {

        int[] indgree = getIndgreeOfVertex(graph, numOfVertices);

        System.out.println(" TeMP");


    }

    private void topologicalSort(List<NodeWeight>[] graph, int[] indgree,int numOfVertices){
        Queue<Integer> queue = new PriorityQueue<>();

        for(int i=0;i< numOfVertices; i++){

            if(indgree[i]==0){
                queue.add(i);
            }
        }

        while (!queue.isEmpty()){
            int node = queue.remove();
            System.out.println(" "+node);
            List<NodeWeight> list = graph[node];

            Iterator<NodeWeight> itr = list.iterator();
            int temp = -1;
            while (itr.hasNext()){
                temp = itr.next().node;

                indgree[temp] -= 1;

                if(indgree[temp] == 0){
                    queue.add(temp);
                }
            }

        }

    }

    private int[] getIndgreeOfVertex(List<NodeWeight>[] graph,int numOfVertices){
        int[] indgreeArray = new int[numOfVertices];
        for(int i=0; i<numOfVertices ;i++){

            List<NodeWeight> adjecantNode = graph[i];
            Iterator<NodeWeight> itr = adjecantNode.iterator();
            while (itr.hasNext()){

                indgreeArray[itr.next().node] += 1;

            }

        }

        return indgreeArray;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Enter Num of Nodes");
        int num_of_nodes = Integer.parseInt(br.readLine());

        List<NodeWeight> graph[] = new AdjecencyList().buildAdjecenceyList(num_of_nodes,true);

        new TopologicalSort().demoTopologicalSort(graph,num_of_nodes);
    }
}
