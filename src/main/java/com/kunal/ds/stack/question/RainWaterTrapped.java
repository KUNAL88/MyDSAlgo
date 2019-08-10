package com.kunal.ds.stack.question;

import com.kunal.ds.stack.impl.Stack_Array;

public class RainWaterTrapped {

    public static void main(String[] args) {
       // int[] A={0,1,0,2,1,0,1,3,2,1,2,1};
        //0,1,5,1,6,
        int[] A={7,0,1,5,1,6,7};

        System.out.println(new RainWaterTrapped().trap(A));

    }

    public int trap(final int[] A) {
        Integer[] array=new Integer[50];
        Stack_Array<Integer> stack=new Stack_Array<>(array);
        int indexOfTop=0;
        int total=0,currentTotal=0;

        for(int i=0;i<A.length;i++){

            if(stack.isEmpty()){
                stack.push(A[i]);
                indexOfTop=i;
            }else if(A[i]>=stack.topOfStck() && !stack.isEmpty()){
                stack.pop();
                total=total+currentTotal;
                currentTotal=0;
                stack.push(A[i]);
                indexOfTop=i;
            }else if(A[i]<stack.topOfStck()){
                currentTotal=currentTotal+(stack.topOfStck()-A[i]);
            }

            if(i==A.length-1 && indexOfTop!=A.length-1){
                stack.pop();
                currentTotal=0;
                i=indexOfTop;
            }
        }

        return total;
    }
}
