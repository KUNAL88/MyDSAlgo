package com.kunal.algo.gt.graph.spanningtree;

import java.util.*;

public class Prims1 {


    int[][] graph={
            {0,1,10,3},
            {1,0,4,-1},
            {10,4,0,2},
            {3,-1,2,0}
    };
    private Map<Integer,Node1> map=new HashMap<>();
    private Queue<Node1> queue=new PriorityQueue<>(
            (I1,I2)-> I1.minDistance<I2.minDistance ? -1 : I1.minDistance>I2.minDistance ? 1:0
    );

    private int numOfNode=4;
    Map<Integer,Node1> distance=new HashMap<>();

    public void findShortestPath(){

        int srcNode=0;
        Node1 node=new Node1(0,0);
        queue.add(node);
        map.put(srcNode,node);

        for(int i=1;i<numOfNode;i++){
            node=new Node1(i,999999999);
            map.put(i,node);
        }
        Node1 lastNode=null;
        Node1 currentNode=null;
        while (!queue.isEmpty()){

            lastNode=queue.remove();

            for(int i=0;i<numOfNode;i++){

                if(graph[lastNode.vertex][i]>0 &&
                        map.containsKey(i) &&
                        map.get(i).minDistance>graph[lastNode.vertex][i]){

                    currentNode=map.get(i);
                    currentNode.minDistance=graph[lastNode.vertex][i];

                    map.put(i,currentNode);
                    distance.put(currentNode.vertex,
                            new Node1(lastNode.vertex,currentNode.vertex));

                    queue.add(currentNode);
                }

            }

            map.remove(lastNode.vertex);
        }

        System.out.println("Cost of min Spanning tree as follows");
        Iterator<Integer> itr=distance.keySet().iterator();
        int sum=0;
        while (itr.hasNext()){
            currentNode=distance.get(itr.next());
            sum+=graph[currentNode.vertex][currentNode.minDistance];
            System.out.println(currentNode.vertex+" <---> "+currentNode.minDistance+" == "+graph[currentNode.vertex][currentNode.minDistance]);
        }
        System.out.println("Total Sum  "+sum);
    }

    public static void main(String[] args) {
        Prims1 p=new Prims1();
        p.findShortestPath();
    }

}

class Node1{

    Integer vertex;
    Integer minDistance;

    public Node1(Integer vertex,Integer minDistance){
        this.vertex=vertex;
        this.minDistance=minDistance;
    }
}
