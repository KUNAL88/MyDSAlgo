package com.kunal.algo.gt.question;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class HigestProduct {

    public static void main(String[] args) {
        int a[]={1, 2, 3, 4,-5,-2};

       System.out.println(new HigestProduct().maxp3(a));

       /*

        queue.add(10);
        queue.add(20);
        queue.add(1);
      //  queue.add(30);


        System.out.println(queue.element());
        System.out.println(queue.remove());
        System.out.println(queue+" --- "+ queue.size()+" --- "+queue.peek()+" --- "+queue.poll());
        System.out.println(queue+" --- "+ queue.size()+" --- "+queue.peek()+" --- "+queue.poll());
   */

    }

    public int maxp3(int[] A) {

        Queue<Integer> queue=new PriorityQueue<>(
                (I1,I2) -> I1>I2 ? 1 : I1<I2 ? -1 : 0
        );

        Queue<Integer> queueNeg=new PriorityQueue<>(
                (I1,I2) -> I1>I2 ? 1 : I1<I2 ? -1 : 0
        );

        int lastNegVal=0,prodOfLastNegVal=0;
        for(int a:A){

            if(queue.size()<3 && a>=0){
                queue.add(a);
                continue;
            }

            if(!queue.isEmpty() && a>queue.peek()){
                queue.remove();
                queue.add(a);
            }else if(a<0){

                if(queueNeg.size()<=2){
                    queueNeg.add(a);
                }else if(a<queueNeg.peek()){
                    queue.remove();
                    queue.add(a);
                }
            }

        }

        Iterator<Integer> itr=queue.iterator();
        int prod=1;
        while (itr.hasNext()){
            prod*=itr.next();
        }

        queue.remove();     queue.remove();
        int prodNeg=queue.peek();
        Iterator<Integer> itr1=queueNeg.iterator();
        while (itr1.hasNext()){
            prodNeg*=itr1.next();
        }

        if(prod>prodNeg){
            return prod;
        }else {
            return prodNeg;
        }
    }
}
