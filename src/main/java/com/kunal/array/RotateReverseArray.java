package com.kunal.array;

public class RotateReverseArray {

    public static void main(String[] args) {
        int[] array={1, 2, 3, 4, 5, 6, 7};
        int n=2;

        int[] temp=new int[n];
        int length=array.length;
        for(int i=0;i<n;i++){
            temp[i]=array[i];
        }

        int k=0;
        for(int i=0;i<length;i++){

           if(i<length-n){
               array[i]=array[i+n%length];
           }else {
               array[i]=temp[k];
               k++;
           }

        }

        for(int i=0;i<length;i++){
            System.out.println(array[i]+" ");
        }


        System.out.println(" Now moving array in forward direction .... ");
        int[] array1={1, 2, 3, 4, 5, 6, 7};

        for(int i=length-1;i>=0;i--){

            if(i>=2){
               // System.out.println((i+n)%length+" --- "+i);
                array1[(i+n)%length]=array1[i];
            }else {
                array1[i+n%length]=temp[i];
            }

        }

        for(int i=0;i<length;i++){
            System.out.println(array1[i]+" ");
        }
    }
}
