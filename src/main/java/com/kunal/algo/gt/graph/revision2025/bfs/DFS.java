package com.kunal.algo.gt.graph.revision2025.bfs;

import com.kunal.algo.gt.graph.traversal.NodeWeight;
import com.kunal.ds.stack.impl.Stack_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DFS {

    private List<Weight>[] graph = null;

    public void demoDFSDemo() throws IOException {

        int numOfNode = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("### Enter number of Nodes for the Graph ###");
        numOfNode = Integer.parseInt(br.readLine());

        List<Weight> graph[] = new AdjList().buildAdjList(numOfNode);
        Integer[] a=new Integer[numOfNode];
        int[] isVisitedNode = new int[numOfNode];
        for(int i=0; i<numOfNode ;i++){
            isVisitedNode[i]=0;
        }

        int startNode = 0;
        Stack_Array<Integer> stack = new Stack_Array<>(a);
        String pathTraversed = ""+startNode;
        stack.push(startNode);

        while (!stack.isEmpty()){

            int currentNOde = stack.pop();

            if(isVisitedNode[currentNOde] == 0){
                isVisitedNode[currentNOde] = 1;
                pathTraversed = pathTraversed+" - "+currentNOde;

                List<Weight> listOfConnectedNode = graph[currentNOde];
                Iterator<Weight> itr = listOfConnectedNode.iterator();
                while (itr.hasNext()){
                    stack.push(itr.next().getDst());
                }
            }



        }
        System.out.println("### Path Traversed "+pathTraversed+" ##");
    }




    public static void main(String[] args) throws IOException{
        new DFS().demoDFSDemo();
    }
}
