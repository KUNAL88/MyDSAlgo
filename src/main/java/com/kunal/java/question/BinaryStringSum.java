/*
package com.kunal.java.question;

import java.util.Map;

public class BinaryStringSum {

    public static void main(String[] args) {
        String a = "100";
        String b = "11";
    }

    public String addBinary(String A, String B) {
        int minLength=A.length() < B.length() ? A.length() : B.length();
        int carry=0;
        StringBuilder sum=new StringBuilder();
        int temp=0;
        char[] A1=A.toCharArray();
        char[] B1=B.toCharArray();

        for(int i=minLength-1;i>=0;i--){

            temp=getInt(A1[i])+getInt(B1[i])+carry;

            if(temp==2){
                temp=0;
                carry=1;
            }else if(temp==3){
                temp=1;
                carry=1;
            }
            sum.append(temp);
        }

        if(A.length()>B.length()){

            for(int i=){

            }
        }


    }

    private int getInt(char c){
        int num=0;
        switch (c){
            case '1': num=1;
                        break;
            case '0': num= 0;
                        break;
        }
        return num;
    }

    private StringBuilder sumForRemaining(){

    }
}
*/
