package com.kunal.algo.dp.question;

public class SubsetSumProblem {

    public static void main(String[] args) {
        int set[] = {3, 34, 4, 12, 5, 2};
        int sum=9;

        System.out.println(" sum "+sum+" exists ? "+new SubsetSumProblem()
                                .isSumExists(set,sum));
    }

    public boolean isSumExists(int a[],int sum){

        boolean[][] isSubSetExists=new boolean[a.length][sum+1];

        for (int j=0;j<=sum;j++){
            isSubSetExists[0][j]=false;
        }

        for (int i=0;i<a.length;i++){
            isSubSetExists[i][0]=true;
        }

        isSubSetExists[0][a[0]+1]=true;

        for(int i=1;i<a.length;i++){
            for(int j=0;j<=sum;j++){

                if(j<a[i]){

                    isSubSetExists[i][j]=isSubSetExists[i-1][j];
                }else {
                    isSubSetExists[i][j]=isSubSetExists[i-1][j-a[i]] ||
                                            isSubSetExists[i-1][j];
                }

            }

        }
        indentifySubSetValue(isSubSetExists,a,sum);
        return isSubSetExists[a.length-1][sum];
    }

    public void indentifySubSetValue(boolean[][] table,int[] a,int sum){

        int i=a.length-1;
        int j=sum;
        StringBuilder sb=new StringBuilder();

        while (j!=0){

            if(table[i][j]==true){
                i--;
            }else {
                i++;
                sb.append(a[i]+" ");
                j=j-a[i];
            }
        }
    }

}
