package com.kunal.ds.stack.question;

import com.kunal.ds.stack.impl.Stack_Array;

public class LargestRectangleInHistogram {

    private static Stack_Array<Integer> stack;
    static Integer[] B=new Integer[50];

    public static void main(String[] args) {
        //int[] A={2,1,5,6,5,9,2,10,10,10,10};

        int[] A={2,1,2,2,2,1,1,1,1,1,1,1,10};
        stack=new Stack_Array<>(B);
        System.out.println("Max Area "+new LargestRectangleInHistogram().largestRectangleArea(A));

    }

    public int largestRectangleArea(int[] A) {
        int maxArea=0;
        int currentMax=0;
        int maxBasedonLastHT=0;
        int currentHT=0;

        for(int a:A){

            if(stack.isEmpty() || a>=stack.topOfStck()){
                stack.push(a);

                if(a>=maxBasedonLastHT){
                    maxArea=maxArea+maxBasedonLastHT;

                }

            }else if(a<stack.topOfStck()){
                int i=1;
                while (!stack.isEmpty()){
                    currentHT=stack.pop();
                    currentMax=currentHT*i;

                    if(currentMax>maxArea){
                        maxArea=currentMax;
                        maxBasedonLastHT=currentHT;

                    }
                    i++;
                }
                stack.push(a);
                if(a>=maxBasedonLastHT){
                    maxArea=maxArea+maxBasedonLastHT;

                }else if(a<maxBasedonLastHT){
                    maxBasedonLastHT=0;
                }
            }
        }

        int i=1;
        while (!stack.isEmpty()){
            currentMax=stack.pop()*i;

            if(currentMax>maxArea){
                maxArea=currentMax;
            }
            i++;
        }

        currentMax=scanLangestContinueMin(A);

        if(currentMax>maxArea){
            maxArea=currentMax;
        }

        return maxArea;

    }

    public int scanLangestContinueMin(int a[]){
        int min=a[a.length-1];
        int windowIndex=1;
        int currentMax=0;
        int max=0;

        for(int i=a.length-1;i>0;i--){

            if(min<=a[i-1]){
                windowIndex++;
            }else {
                currentMax=min*windowIndex;
                windowIndex=1;
                min=a[i];
            }

            if(currentMax>max){
                max=currentMax;
            }
        }


        return max;
    }

}
