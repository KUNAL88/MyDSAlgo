package com.kunal.java.question;

public class AtoI {

    public static void main(String[] args) {
       // String A="92704";

       String A="-92704";

        System.out.println((int)'+');

        System.out.println( new AtoI().atoi(A));

        int a=512147826;

    }

    public int atoi(final String A) {

        char[] num=A.trim().toCharArray();
        int result=0;
        boolean isNegative=false;
        int startIndex=0;
        if(A.length()>0 && num[0]=='-'){
            isNegative=true;
            startIndex=1;
        }

        if(A.length()>0 && num[0]=='+'){
            startIndex=1;
        }

        for(int i=startIndex;i<A.length();i++){

            if((int)num[i]>=48 && (int)num[i]<=57){
                result=result*10+((int)num[i]-48);
            }else {
                break;
            }

        }

        if(isNegative) result=result*-1;

        return result;
        }


}
