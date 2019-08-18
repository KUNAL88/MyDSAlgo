package com.kunal.java.question;

public class ReverseString {

    static int first=0;
    public static void main(String[] args) {
        String A="fddu xq l vy azs";
        System.out.println(A.length());
        System.out.println(new ReverseString().reverseWords(A));
    }

    public String reverseWords(String a) {
        boolean isSpaceFound=false;
        char[] c=a.toCharArray();
        StringBuilder result=new StringBuilder();
        int endIndex=c.length-1;
        for(int i=c.length-1;i>=0;i--){

            if(c[i]==' '){
                result.append(swapWord(c,i+1,endIndex));
                endIndex=i;
                isSpaceFound=true;
                continue;
            }
        }

        if(!isSpaceFound){
            return a;
        }
        result.append(swapWord(c,0,endIndex-1));
        return result.toString();
    }

    private StringBuilder swapWord(char[] c,int start,int end){
        StringBuilder temp=new StringBuilder();
        for(int i=start;i<=end;i++){
            temp.append(c[i]);
        }

        if(first==0){
            temp.append(' ');
            first++;
        }
        return temp;
    }
}
