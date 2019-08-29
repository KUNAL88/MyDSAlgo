/*
package com.kunal.algo.gt.graph.spanningtree;

import com.kunal.algo.gt.graph.traversal.AdjecencyList;
import com.kunal.algo.gt.graph.traversal.AdjecencyMatrix;
import com.kunal.algo.gt.graph.traversal.NodeWeight;
import com.kunal.algo.gt.graph.traversal.Weight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Prims {

  //  private static boolean[] isVisited;
    private static Queue<Weight> queue;
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

        System.out.println(" Enter Number of Nodes in your Graph ...");

        try {
            num_of_nodes=Integer.parseInt(br.readLine());
        }catch (IOException e){
            System.out.println(e);
        }


        node_direction_list=new ArrayList<Weight>();
        adjecency_matrix=new AdjecencyMatrix();
        graph=adjecency_matrix.buildAjecencyMatrix(num_of_nodes);

        queue=new PriorityQueue<Weight>(
                (I1,I2) -> I1.getWeight() < I2.getWeight() ? -1 :
                                        I1.getWeight()>I2.getWeight() ? 1 : 0
        );

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
                queue.add(weight);

                System.out.print("Done ?(y/n) : ");
                if(br.readLine().equalsIgnoreCase("y")){
                    isDone=true;
                }

            }

        }catch (Exception e){

            System.out.println("IOException Encountered ... "+e);
        }
        graph= adjecency_matrix.assignWeightToGraph(graph,false,node_direction_list);


    }

    public void primpsAlgo(){

        Queue<CustomMap> queue= new PriorityQueue<>(

                (I1,I2) -> I1.value<I2.value ? -1 : I1.value>I2.value ? 1 :0

        );
        Map<Integer,Integer> map= new HashMap<>();
        CustomMap customMap=new CustomMap(0,0);
        map.put(0,0);
        queue.add(customMap);
        for(int i=1;i<num_of_nodes;i++){
            customMap=new CustomMap(i,999999999);
            queue.add(customMap);
            map.put(i,999999999);
        }

        while (!queue.isEmpty()){
            customMap=queue.remove();
            map.remove(customMap.key);

            for(int i=0;i<num_of_nodes;i++){

                if(graph[customMap.key][i]<map.get(i)){
                    //map.put()
                }
            }
        }
    }

    class CustomMap{

        Integer key;
        Integer value;

        public CustomMap(Integer key,Integer value){
            this.key=key;
            this.value=value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof CustomMap)) return false;

            CustomMap customMap = (CustomMap) o;

            if(key==customMap.key){
                return true;
            }else {
                return false;
            }
        }

        @Override
        public int hashCode() {

            return key%11;
        }
    }

    class Distance{
        Integer vertex,src,dst;

        public Distance(Integer vertex,Integer src,Integer dst){
            this.vertex=vertex;
            this.src=src;
            this.dst=dst;
        }


    }

   */
/* public void primsAlgo(){

        boolean[] isVisited=new boolean[num_of_nodes];
        for(int i=0;i<num_of_nodes;i++){
            isVisited[i]=false;
        }
        StringBuilder sb=new StringBuilder();


        Weight wt=null;
        int startVertex=0;
       Queue<Integer> vertexQueue=new LinkedList<>();
       vertexQueue.add(startVertex); isVisited[startVertex]=true;
        int sum=0;
        int minDistance=999999999;
        int currentVertex=startVertex;
        int nextVertex=startVertex;

       while (!vertexQueue.isEmpty()){

            currentVertex=vertexQueue.remove();

            for(int j=0;j<num_of_nodes;j++){

                if(graph[currentVertex][j]>0 && graph[currentVertex][j]<minDistance){
                    nextVertex=j;
                    minDistance=graph[currentVertex][j];
                }
            }
            sum+=minDistance;
            minDistance=999999999;

*//*
*/
/*
            if(isVisited[wt.getSrc_index()]==false || isVisited[wt.getDst_index()]==false){
                isVisited[wt.getSrc_index()]=true;
                isVisited[wt.getDst_index()]=true;
                sum+=wt.getWeight();
                sb.append("( "+wt.getSrc_index()+","+
                                wt.getDst_index()+") - "+wt.getWeight()+"\n");
            }*//*
*/
/*

       }

       System.out.println(sb.toString());
       System.out.println("Cost of min Spanning Tree "+sum);

    }*//*


    public static void main(String[] args) {
        init();
        new Prims().primsAlgo();
    }
}
*/
