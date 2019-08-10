/*
package com.kunal.ds.stack.question;

import com.kunal.ds.stack.impl.Stack_Array;

public class EvaluateExpression {

    public static void main(String[] args) {
        String[] A =   {"2", "1", "+", "3", "*"};
    }

    public int evalRPN(String[] A) {

        Integer[] array=new Integer[40];
        Stack_Array<Integer> stack=new Stack_Array<>(array);
        int k=0;
        String currentVal=null;

        for(int i=0;i<A.length;i++){
            currentVal=A[i];

            if(currentVal.equals("+")
                    ||currentVal.equals("*")
                    ||currentVal.equals("-")
                    ||currentVal.equals("/")){

            }
            k=Integer.parseInt(A[i]);
        }
    }
}
*/
