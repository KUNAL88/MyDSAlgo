package com.kunal.algo.gt.traversal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AdjecencyList {

    private List<NodeWeight>[] graph;
    private int src,dst,wt;
    private BufferedReader br;
    private boolean isDone=false;
    private NodeWeight wt_list;

    public List<NodeWeight>[] buildAdjecenceyList(int number_of_node,boolean isDirected){

        br=new BufferedReader(new InputStreamReader(System.in));
        graph=new ArrayList[number_of_node];

        for(int i=0;i<number_of_node;i++){

            graph[i]=new ArrayList<NodeWeight>();

        }

        List<Weight> vertex_connectivity_list=defineVertexConnectivity(number_of_node);

        if(isDirected==true){
            graph=assignWeightToDirectedGraph(graph,vertex_connectivity_list);
        }else {
            graph=assignWeightToUnDirectedGraph(graph,vertex_connectivity_list);
        }

        return graph;
    }


    private List<NodeWeight>[] assignWeightToDirectedGraph(List<NodeWeight>[] graph,List<Weight> vertex_connectivity_list){

        Weight wt=null;
        NodeWeight nwt=null;
        Iterator<Weight> itr=vertex_connectivity_list.iterator();

        while (itr.hasNext()){
            wt=new Weight();

            nwt=new NodeWeight();
            nwt.setNode(wt.getDst_index());
            nwt.setWt(wt.getWeight());

            graph[wt.getSrc_index()].add(nwt);
        }

        return graph;
    }

    private List<NodeWeight>[] assignWeightToUnDirectedGraph(List<NodeWeight>[] graph,List<Weight> vertex_connectivity_list){

        Weight wt=null;
        NodeWeight nwt=null;
        Iterator<Weight> itr=vertex_connectivity_list.iterator();

        while (itr.hasNext()){
            wt=itr.next();

            nwt=new NodeWeight();
            nwt.setNode(wt.getDst_index());
            nwt.setWt(wt.getWeight());

            graph[wt.getSrc_index()].add(nwt);


            nwt=new NodeWeight();
            nwt.setNode(wt.getSrc_index());
            nwt.setWt(wt.getWeight());
            graph[wt.getDst_index()].add(nwt);


        }

        return graph;
    }

    private List<Weight> defineVertexConnectivity(int num_of_nodes){
        List<Weight> node_connectivity=new ArrayList<Weight>();
        Weight weight=null;

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

                node_connectivity.add(weight);

                System.out.print("Done ?(y/n) : ");
                if(br.readLine().equalsIgnoreCase("y")){
                    isDone=true;
                }

            }

        }catch (Exception e){

            System.out.println("IOException Encountered ... "+e);
        }

        return node_connectivity;

    }



}
