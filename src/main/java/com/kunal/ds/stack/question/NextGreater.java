package com.kunal.ds.stack.question;

import com.kunal.ds.stack.impl.Stack_Array;

/*
Print next greater number of Q queries
Input : arr[] = {3, 4, 2, 7, 5, 8, 10, 6}
        query indexes = {3, 6, 1}
Output: 8 -1 7
 */
public class NextGreater {

    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 7, 5, 8, 10, 6};
        int[] query={3,6,1};
        int[] result=getQueryResult(arr,query);
    }

    private static int[] getQueryResult(int[] arr,int[] query){

        if (arr==null || arr.length==0 || query==null || query.length==0){
            return null;
        }

        int[] result=new int[query.length];
        Integer[] array=new Integer[arr.length];
        Stack_Array<Integer> stack=new Stack_Array<>(array);
        int[] nextHighest=new int[arr.length];

        int currentIndex=0;
        stack.push(currentIndex);
        int nextMax=arr[currentIndex];
        int temp=currentIndex;
        while (!stack.isEmpty()){
            currentIndex=stack.pop();
            temp=currentIndex;
            while (currentIndex<arr.length-1){

                /*if(arr[currentIndex+1]<nextMax){
                    stack.push(currentIndex);
                    break;
                }else {*/

                    if(arr[currentIndex+1]<=arr[currentIndex]){
                     //   stack.push(currentIndex+1);
                        currentIndex++;
                        continue;
                    }else {
                        nextMax=arr[currentIndex+1];

                        currentIndex++;
                        stack.push(currentIndex);
                        break;
                    }

               // }


            }
            for(int i=temp;i<currentIndex;i++){
                nextHighest[i]=nextMax;
            }
            nextMax=-1;
        }

        for(int i=0;i<query.length;i++){

            if(query[i]>arr.length-1){
                result[i]=-1;
            }else {
                result[i]=nextHighest[query[i]];
            }


        }
        return result;
    }
}
