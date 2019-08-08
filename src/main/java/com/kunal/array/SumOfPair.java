package com.kunal.array;

public class SumOfPair {

    public static void main(String[] args) {
        int[] a={11,15,6,8,9,10};

        int l=0,r=a.length-1;
        int expected=17;
        int sum=0;

        while (l<r){
            sum=a[l]+a[r];
            System.out.println("Pair "+a[l]+" "+a[r]+" Sum "+sum);

            if(sum==expected){
                System.out.println("Pair "+a[l]+" "+a[r]);
                break;
            }

            if(sum>expected){

                if(a[l]>a[r]){
                   l++;
                }else {
                    r--;
                }
            }

            if(sum<expected){

                if(a[l]<a[r]){
                    l++;
                }else {
                    r--;
                }
            }
        }
    }
}
