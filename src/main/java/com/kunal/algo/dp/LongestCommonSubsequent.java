package com.kunal.algo.dp;

public class LongestCommonSubsequent {

    public static void main(String[] args) {
        String A="BACDB";
        String B="BDCB";

        new LongestCommonSubsequent().LCS(A,B);
    }

    public String LCS(String A, String B){
        char[] a=A.toCharArray();
        char[] b=B.toCharArray();

        int[][] table=new int[A.length()+1][B.length()+1];

        for(int i=0;i<B.length()+1;i++){
            table[0][i]=0;
        }

        for (int j=0;j<A.length()+1;j++){
            table[j][0]=0;
        }

        for(int i=1;i<A.length()+1;i++){
            for (int j=1;j<B.length()+1;j++){

                if(a[i-1]==b[j-1]){
                    table[i][j]=table[i-1][j-1]+1;
                }else {

                    if(table[i][j-1]>table[i-1][j]){
                        table[i][j]=table[i][j-1];
                    }else {
                        table[i][j]=table[i-1][j];
                    }
                }
            }
        }

        System.out.println(table[a.length][b.length]);
        return null;
    }
}
