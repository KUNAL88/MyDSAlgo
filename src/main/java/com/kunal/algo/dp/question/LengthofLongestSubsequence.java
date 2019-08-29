package com.kunal.algo.dp.question;

/*
Given an array of integers, A of length N,
find the length of longest subsequence which is first increasing then decreasing.
 */

public class LengthofLongestSubsequence {
    private static int index=0;
    public static void main(String[] args) {
      //  int[] a ={1, 2, 1};
        int[] a ={1, 11, 2, 10, 4, 5, 2, 1};
        System.out.println("\n"+new LengthofLongestSubsequence().longestSubsequenceLength(a));
    }

    public int longestSubsequenceLength(final int[] A) {

        if(A.length==0){
            return 0;
        }

        else if(A.length==1){
            return A[0];
        }

        int[] incrementSquence=getIncrementSequence(A);
        int[] decrementSequence=getDecrementSquence(A);

        int count=0;
        for(int a:incrementSquence){

            if(a==0){
                continue;
            }
            System.out.print(a+" ");
            count++;
        }

        for(int i=1;i<decrementSequence.length;i++){
            if(decrementSequence[i]==0){
                continue;
            }
            System.out.print(decrementSequence[i]+" ");
            count++;
        }

       return count-1;
    }

    private int[] getIncrementSequence(int[] A){
        int[] incrementSquence=new int[A.length];

        for(int a:A){

            if(index==0){
                incrementSquence[index]=a;
                index++;
            }else if(a>incrementSquence[index-1]){
                incrementSquence[index]=a;
                index++;
            }else if(a<incrementSquence[index-1] && a>incrementSquence[index-2]){
                index--;
                incrementSquence[index]=a;
                index++;
            }
        }

        return incrementSquence;
    }

    private int[] getDecrementSquence(int[] A){

        int[] decrementSquence=new int[(A.length-index)+2];
        index--;
        int init=0;

        for(int currentIndex=index;currentIndex<A.length;currentIndex++) {

            if (init == 0) {
                decrementSquence[init] = A[index];
                // currentIndex++;
                init++;
            } else if (A[currentIndex] < decrementSquence[init - 1]) {
                decrementSquence[init] = A[currentIndex];
                init++;
           /* }else if(A[currentIndex]>decrementSquence[currentIndex-1] && ){

            }*/
            }

        }
        return decrementSquence;
    }
}
