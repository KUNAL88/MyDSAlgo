package com.kunal.array;

public class SpiralOrderMatrix {

    public static void main(String[] args) {

        new SpiralOrderMatrix().generateMatrix(5);
    }

    public int[][] generateMatrix(int n) {

        int i=0; //row
        int j=-1; //col
        int[][] matrix=new int[n][n];
        int count=1;
        int c=n;
        boolean isDone=false;
      //  System.out.println((Math.ceil(3.0/2)));
       System.out.println("Math.floor(i/c)"+((int)Math.floor(c/2))+
                " Math.ceil(i/c) "+(Math.ceil((double) c/2)-1));
        while (!isExit(i,j,c)){

            System.out.println(" n --> "+n);

           if(!isDone){
               for(j=j+1;j<n;j++){ //move right
                   System.out.println(" i,j ("+i+","+j+") = "+count);
                   matrix[i][j]=count;
                   if (isExit(i,j,c)){
                       isDone=true;
                       break;
                   }

                   count++;
               }

               j--;
           }

           if(!isDone){
               for(i=i+1;i<n;i++){ //move down
                   System.out.println(" i,j ("+i+","+j+") = "+count);
                   matrix[i][j]=count;
                   if (isExit(i,j,c)){
                       isDone=true;
                       break;
                   }
                   count++;
               }

               i--;
           }

           if(!isDone){
               for(j=j-1;j>=(c-n);j--){ //move left
                   System.out.println(" i,j ("+i+","+j+") = "+count);
                   matrix[i][j]=count;
                   if (isExit(i,j,c)){
                       isDone=true;
                       break;
                   }
                   count++;
               }
               j++;
           }

           if(!isDone){
               for(i=i-1;i>=(c-n)+1;i--){ //move left
                   System.out.println(" i,j ("+i+","+j+") = "+count);
                   matrix[i][j]=count;
                   if (isExit(i,j,c)){
                       isDone=true;
                       break;
                   }

                   count++;
               }
               i++;
           }

           if(isDone)break;

            n--;
        }
        return matrix;
    }

    private boolean isExit(int i,int j,int c){


        if(i==(int) Math.floor(c/2) && j==(int) Math.ceil((double) c/2)-1)
            return true;
        else
            return false;
    }

}
