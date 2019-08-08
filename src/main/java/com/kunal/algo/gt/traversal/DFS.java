package com.kunal.algo.gt.traversal;

import com.kunal.ds.stack.impl.Stack_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

public class DFS {

    private static BufferedReader br;
    private static int num_of_nodes;
    private static AdjecencyList adjList;

    private static void buildDFSTraversal(){

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

        Integer[] a=new Integer[50];
        Stack_Array<Integer> stack_array=new Stack_Array<>(a);
        stack_array.push(startNode);
        isVisited[startNode]=true;

        while (!stack_array.isEmpty()){

            currentNode=stack_array.pop();
            List<NodeWeight> path=graph[currentNode];

            Iterator<NodeWeight> pathItr=path.iterator();
            while (pathItr.hasNext()){

                 nwt=pathItr.next();

                 if(isVisited[nwt.getNode()]==false){

                     isVisited[nwt.getNode()]=true;
                     stack_array.push(nwt.getNode());
                     node_visited_seq=node_visited_seq+" "+nwt.getNode();
                 }
            }
        }
            System.out.println(" Node Visited in following sequence : "+node_visited_seq);
    }

    public static void main(String[] args) {

        buildDFSTraversal();
    }
}
