package com.kunal.algo.gt.graph.question;

import java.util.PriorityQueue;
import java.util.Queue;

public class SmallestSeqOfPrime {

    public static void main(String[] args) {
        int A=3,B=11,C=7,K=3;
        new SmallestSeqOfPrime().solve(A,B,C,K);
    }

    public int[] solve(int A, int B, int C, int K) {

        int[] result=new int[K];

        Queue<Integer> queue=new PriorityQueue<>(
                (I1,I2) -> I1<I2 ? -1 : I1>I2 ? 1 :0
        );
        boolean isDone=false;
        queue.add(A);
        queue.add(B);   queue.add(C);
        int currentNum=0;
        int i=0;
        while (!queue.isEmpty() && !isDone){
            currentNum=queue.remove();

            if(i<K){
                result[i]=currentNum;
                queue.add(currentNum*A);
                i++;
            }else {
                isDone=true;
            }

        }

        for( i=0;i<K;i++){
            System.out.print(result[i]+" ");
        }
    return result;
    }
}
