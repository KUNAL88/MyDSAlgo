package com.kunal.java.question;

public class LengthOfLastWord {

    public static void main(String[] args) {
        String s = "Hello World";

        System.out.println(new LengthOfLastWord().lengthOfLastWord(s));
    }

    public int lengthOfLastWord(final String A) {
        int length=0;
        char[] c=A.trim().toCharArray();

        for(int i=0;i<c.length;i++){

            if(c[i]==' '){
                length=0;
                continue;
            }
            length++;
        }

        return length;
    }
}
