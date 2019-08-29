package com.kunal.algo.dp.question;

public class MaxContigousSum {

    public static void main(String[] args) {
       // int[] a={-2,11,-4,13,-5,2};
       // int[] a={-2,-11,-4,-13,-5,-2};
        int[] a={-1,-3,4,-2,-1,-6};

        System.out.println(new MaxContigousSum().maxContinousSum(a));
    }

    public int maxContinousSum(int[] A){

        int maxSum=0;
        int currentSum=0;
        boolean isAllNegative=false;
        int count=0;
        //check for all -ve number
        for(int a:A){

            if(a<0){
                count++;
                continue;
            }
            break;
        }

        if(count==A.length){
            isAllNegative=true;
        }

        if(isAllNegative){

            maxSum=-999999999;
            for(int a:A){

                if(a>maxSum){
                    maxSum=a;
                }
            }

        }else {


            for(int i=0;i<A.length;i++){

                currentSum+=A[i];
                //Discard here -ve value if any
                if(currentSum<0){
                    currentSum=0;
                }

                if(currentSum>maxSum){
                    maxSum=currentSum;
                }
            }

        }

       return maxSum;
    }
}
