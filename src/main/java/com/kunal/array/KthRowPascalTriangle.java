package com.kunal.array;
/*

Given an index k, return the kth row of the Pascal’s triangle.

        Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1
*/

public class KthRowPascalTriangle {

    public static void main(String[] args) {
        int num=3;

       int[] A= new KthRowPascalTriangle().getRow(num+1);

    }

    public int[] getRow(int A) {
        int i=0,j=0;
        int[][] pascalMatrix=new int[A][A];

        //initialize
        for(i=0;i<A;i++){
            for (j=0;j<A;j++){
                pascalMatrix[i][j]=0;
            }
        }

        int counter=0;
        int k=A-1;
        i=0;
        while (counter<A){


            for(j=0;j<A-k;j++){

                if(j==0){
                    //System.out.print("("+i+","+j+") = 1");
                    System.out.print("1 ");
                    pascalMatrix[i][j]=1;
                    //i++;
                }else {
                    //System.out.println("("+i+","+j+") = "+(pascalMatrix[i-1][j-1]+pascalMatrix[i-1][j]));
                    System.out.print((pascalMatrix[i-1][j-1]+pascalMatrix[i-1][j])+" ");
                    pascalMatrix[i][j]=pascalMatrix[i-1][j-1]+pascalMatrix[i-1][j];
                    //i++;
                }
            }
            System.out.println();
            i++;
            counter++;
            k--;
        }

        return pascalMatrix[A-1];

    }
}
