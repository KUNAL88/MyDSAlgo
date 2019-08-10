package com.kunal.ds.stack.question;

public class SlidingWindow {

    public static void main(String[] args) {
        int[] a={1, 3 ,-1, -3, 5 ,3 ,6, 7};
        int windowSize=3;
        new SlidingWindow().slidingMaximum(a,windowSize);
    }

    public int[] slidingMaximum(final int[] A, int B) {

        int[] max = new int[A.length - (B - 1)];
        int maxArrayIndex = 0;
        int currentWindowMax = -999999999;
        int moveBackBy = B - 1;
        int tempIndex = 0;
        for (int i = 0; i < A.length; i++) {
            tempIndex++;
            if (A[i] > currentWindowMax) {
                currentWindowMax = A[i];
            }

            if (tempIndex % B == 0) {

                max[maxArrayIndex] = currentWindowMax;
                currentWindowMax = 0;

                if (i == A.length - 1) {
                    break;
                }
                tempIndex=0;
                i = i-moveBackBy;
                maxArrayIndex++;
            }


        }

        return max;
    }
}

/*class CurrentWindowMax(){

        }*/
