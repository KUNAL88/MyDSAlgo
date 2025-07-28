package com.kunal.algo.gt.graph.revision2025.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AdjList {
    private List<Weight> graph[] = null;

    public List<Weight>[] buildAdjList(int numOfNodes) throws IOException {

        graph = new ArrayList[numOfNodes];
        for(int i=0;i<numOfNodes;i++){
            graph[i] = new ArrayList<Weight>();
        }
        List<Vertex> vertexList = getVertexDetailsFromUser(numOfNodes);
        buildGraph(vertexList);
        return graph;
    }

    private void buildGraph(List<Vertex> vertexList){

        Iterator<Vertex> itr = vertexList.iterator();

        while (itr.hasNext()){
            Vertex v = itr.next();

            Weight wt = new Weight();
            wt.setDst(v.getDst());
            wt.setWt(v.getWt());

            graph[v.getSrc()].add(wt);
        }
    }

    private List<Vertex> getVertexDetailsFromUser(int numOfNodes) throws IOException {

        List<Vertex> vertexList=  new ArrayList<Vertex>();
        boolean isDoneInput = false;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (!isDoneInput){

            Vertex vertex = new Vertex();
            System.out.print("Enter SRC node : ");
            vertex.setSrc(Integer.parseInt(br.readLine()));

            System.out.print("Enter TGT node : ");
            vertex.setDst(Integer.parseInt(br.readLine()));

            System.out.print("Enter WT node : ");
            vertex.setWt(Integer.parseInt(br.readLine()));

            vertexList.add(vertex);

            System.out.println(" IS DONE (y/n)? ");
            if(br.readLine().equalsIgnoreCase("Y")){
                isDoneInput = true;
            }
        }
        return vertexList;
    }

}