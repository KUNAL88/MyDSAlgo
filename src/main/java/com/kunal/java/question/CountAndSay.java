package com.kunal.java.question;

public class CountAndSay {

    public static void main(String[] args) {

        int A=1211;

        System.out.println(new CountAndSay().countAndSay(A));

    }

    public String countAndSay(int A) {

        char[] array=new Integer(A).toString().toCharArray();
        StringBuilder result=new StringBuilder();


        char previous=array[0];
        int occuranceCount=1;
        for(int i=1;i<array.length;i++){

            if(previous==array[i]){
                occuranceCount++;
            }else {
                result.append(occuranceCount).append(previous);
                previous=array[i];
                occuranceCount=1;
            }

        }

        result.append(occuranceCount).append(previous);
        return result.toString();

    }
}
