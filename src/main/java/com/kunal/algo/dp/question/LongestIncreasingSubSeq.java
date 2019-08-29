package com.kunal.algo.dp.question;

import java.util.*;

public class LongestIncreasingSubSeq {

    private static Map<Integer,Integer> map=new HashMap<>();
    public static void main(String[] args) {
       // int[] a={5,6,2,3,4,1,9,9,8,9,5};
        int[] a={1, 11, 2, 10, 4, 5, 2, 1};
      //  int[] a={1, 2,1};

        LongestIncreasingSubSeq s=new LongestIncreasingSubSeq();
        int max_incr=s.longestIncrSubSeq(a);
        int max_dncr=s.longestDcrSubSeq(a);
        boolean midFound=false;
        int indexOfMid=0;
        for(int i=1;i<map.size();i++){

            if(!midFound && map.get(i-1)<map.get(i)){
               // indexOfMid=i;
                continue;
            }else if(!midFound) {
                indexOfMid=i-1;
                midFound=true;
            }

            if(midFound==true && (map.get(i-1)<map.get(i))){
                map.remove(indexOfMid);
                indexOfMid=i;
            }
        }

        System.out.println("Max_Incr "+max_incr+"  Max_dncr "+max_dncr);
        System.out.println(map.size());
    }

    public int longestIncrSubSeq(int[] a){

       // int i,j,max=0;
        int[] LCIS=new int[a.length];

        for(int i=0;i<LCIS.length;i++){
            LCIS[i]=1;
        }

        for(int i=0;i<a.length;i++){
            for(int j=0;j<i;j++){

                //update if a[i] is greater than a[j]
                if(a[i]>a[j] && LCIS[i]<LCIS[j]+1){
                    LCIS[i]=LCIS[j]+1;
                }
            }
        }

        int max=0;
        for(int i=0;i<LCIS.length;i++){


            if(LCIS[i]>max){
                System.out.println(" i "+i+" actual value "+a[i]+"  seq "+LCIS[i]);
                map.put(i,a[i]);
                max=LCIS[i];
            }
        }

        return max;
    }

    public int longestDcrSubSeq(int[] a){

        // int i,j,max=0;
        int[] LDCS=new int[a.length];

        for(int i=0;i<LDCS.length;i++){
            LDCS[i]=1;
        }

        for(int i=0;i<a.length;i++){
            for(int j=0;j<i;j++){

                if(a[i]<a[j] && LDCS[i]<LDCS[j]+1){
                    LDCS[i]=LDCS[j]+1;
                }
            }
        }
        System.out.println("\n\n");
        int max=0;
        for(int i=0;i<LDCS.length;i++){


            if(LDCS[i]>max){
                System.out.println(" i "+i+" actual value "+a[i]+"  seq "+LDCS[i]);
                map.put(i,a[i]);
                max=LDCS[i];
            }
        }

        return max;
    }
}
