package com.kunal.java.question;

public class StringPalindrom {

    public static void main(String[] args) {
        String A="race a car";

        System.out.println((int)'Z');
        System.out.println(new StringPalindrom().isPalindrome(A));
    }

    public int isPalindrome(String A) {
        int result=0;
        char[] array = A.trim().toUpperCase().toCharArray();
        int startIndex = 0, endIndex = A.length() - 1;
        int mid = endIndex / 2;

        while (startIndex <= endIndex) {

            if (!isValidChar(array[startIndex])) {
                startIndex++;
                continue;
            }

            if(!isValidChar(array[endIndex])){
                endIndex--;
                continue;
            }

            if(array[startIndex]==array[endIndex]){
                startIndex++;
                endIndex--;
                result=1;
            }else {
                result=0;
                break;
            }

        }

        return result;
    }

    private boolean isValidChar(char c){

      boolean flag=false;

      if((int)c>=65 && (int)c<=90){
            flag=true;
        }

        return flag;
    }
}
