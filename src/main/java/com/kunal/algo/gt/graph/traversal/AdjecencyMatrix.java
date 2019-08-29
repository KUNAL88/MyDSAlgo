package com.kunal.algo.gt.graph.traversal;

import java.util.Iterator;
import java.util.List;

public class AdjecencyMatrix {

    public int[][] buildAjecencyMatrix(int numberOfNodes){

        int[][] adjecencymatrix_graph=new int[numberOfNodes][numberOfNodes];

        for(int i=0;i<numberOfNodes;i++){
            for (int j=0;j<numberOfNodes;j++){
                adjecencymatrix_graph[i][j]=0;
            }
        }

        return adjecencymatrix_graph;
    }

    public int[][] assignWeightToGraph(int[][] graph, boolean is_directed, List<Weight> weightList){

        if(is_directed==true){
            graph=getDirectedGraph(graph,weightList);
        }else {
            graph=getUnDirectedGraph(graph,weightList);
        }

        return graph;
    }


    private int[][] getDirectedGraph(int[][] graph,List<Weight> weightList){

        Iterator<Weight> itr=weightList.iterator();
        Weight w=null;

        while (itr.hasNext()){
            w=itr.next();
            graph[w.getSrc_index()][w.getDst_index()]=w.getWeight();
        }

        return graph;
    }

    private int[][] getUnDirectedGraph(int[][] graph,List<Weight> weightList){

        Iterator<Weight> itr=weightList.iterator();
        Weight w=null;

        while (itr.hasNext()){
            w=itr.next();
            graph[w.getSrc_index()][w.getDst_index()]=w.getWeight();
            graph[w.getDst_index()][w.getSrc_index()]=w.getWeight();
        }

        return graph;
    }
}
