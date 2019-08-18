package com.kunal.java.question;

public class MinimumCharForPal {

    public static void main(String[] args) {
        System.out.println(new MinimumCharForPal().solve("babb"));
    }

    public int solve(String A) {

            if(A.length() <=1){
                return 0;
            }

            char[] array=A.trim().toCharArray();
            int startIndex=0;
            int endIndex=array.length-1;
            int skipCount=0;
            while (startIndex<=endIndex){

                if(array[startIndex]==array[endIndex]){
                    startIndex++;
                    endIndex--;
                }else {
                    break;
                }
            }

            if(startIndex>endIndex){
                return 0;
            }else {
                int mid=(int)Math.ceil((double) (array.length-1)/(double) 2);
                int div=endIndex-mid;

                if(div==0) div=1;
                return (endIndex-startIndex)/div;
            }


    }
}
