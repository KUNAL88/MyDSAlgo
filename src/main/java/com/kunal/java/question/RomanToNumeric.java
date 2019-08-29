package com.kunal.java.question;

import com.kunal.ds.stack.impl.Stack_Array;

import java.util.HashMap;
import java.util.Map;

public class RomanToNumeric {

    public static void main(String[] args) {

        String E="91";//"XCI";
        String C="61";//"LXI";
        String C1="49";//"IL";
        String B="30";//"XXX";
        String A="XIV";  String A1="IV";
        String D="XVI";  String D1="VI";

        System.out.println(new RomanToNumeric().romanToInt(E));
        System.out.println(new RomanToNumeric().romanToInt(C1));
        System.out.println(new RomanToNumeric().romanToInt(C));
        System.out.println(new RomanToNumeric().romanToInt(B));
        System.out.println(new RomanToNumeric().romanToInt(A));
        System.out.println(new RomanToNumeric().romanToInt(A1));
        System.out.println(new RomanToNumeric().romanToInt(D));
        System.out.println(new RomanToNumeric().romanToInt(D1));
    }

    public int romanToInt(String A) {
       /* Map<Character,Integer> map=new MyHashMap();
        map.put('I',1); map.put('V',5); map.put('X',10);
        map.put('L',50); map.put('C',100);
*/
        Map<Integer,Character> map=new HashMap();
        map.put(1,'I'); map.put(5,'V'); map.put(10,'X');
        map.put(50,'L'); map.put(100,'C');

        char[] romanCharArray=A.toCharArray();
        Integer[] array=new Integer[50];
        Stack_Array<Integer>  stack=new Stack_Array<>(array);
        int currentVal=0;
        for(int i=0;i<romanCharArray.length;i++){

            currentVal=map.get(romanCharArray[i]);
            if(!stack.isEmpty() && currentVal > stack.topOfStck()){
                stack.push(currentVal-stack.pop());
            }else {
                stack.push(currentVal);
            }
        }

        int result=0;
        while (!stack.isEmpty()){
            result+=stack.pop();
        }

        return result;
    }
}
