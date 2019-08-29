package com.kunal.ds.hash;

import java.util.ArrayList;
import java.util.Map;

public class LargestCommonZero {



    public static void main(String[] args) {

        int[] a={1 ,2 ,-2 ,4 ,-4,3,2 ,-2 ,4 ,-4,2 ,-2 ,4 ,-4};

       int[] result=new LargestCommonZero().lszero(a);
    }

    public int[] lszero(int[] A) {
        int start=0,previousStart=0;
        int end=0,previousEnd=0;
        int largest=0;
        boolean isStartOfZeroSeq=false;

        if(A.length<=1){
            return null;
        }
        int j=0;
        while (j<A.length-1){

            if(A[j]+A[j+1]==0){

                if(isStartOfZeroSeq==false){
                    start=j;
                    isStartOfZeroSeq=true;
                }
                end=j+1;
                j=j+2;
            }else {

                if(isStartOfZeroSeq==true && ((previousEnd-previousStart)<(end-start))){
                    previousEnd=end;
                    previousStart=start;
                }
                isStartOfZeroSeq=false;
                j++;

            }

        }

        if((previousEnd-previousStart)<(end-start)){
            return getResult(A,start,end);
        }else {
            return getResult(A,previousStart,previousEnd);
        }

    }

    private int[] getResult(int[] a,int start,int end){

        int[] result=new int[end-start+1];

        int k=start;
        for(int i=0;i<=(end-start);i++){
            result[i]=a[k];
            k++;
        }
        return result;

    }
}
