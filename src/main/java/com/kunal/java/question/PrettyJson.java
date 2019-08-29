package com.kunal.java.question;

import com.kunal.ds.queue.Queue_Array;

import java.util.ArrayList;
import java.util.List;

public class PrettyJson {

    public static void main(String[] args) {
        String A=  "{A:\"B\",C:{D:\"E\",F:{G:\"H\",I:\"J\"}}}";
        System.out.println(new PrettyJson().prettyJSON(A));

    }

    public String prettyJSON(String A) {

        List<String> list=new ArrayList<>();
        StringBuilder result=new StringBuilder();
        char[] json=A.toCharArray();
        Character[] array=new Character[50];
        Queue_Array queue=new Queue_Array(array);
        for(int i=0;i<A.length();i++){

            if(queue.isQueueEmpty() && isBrace(json[i])){
                result.append(json[i]).append("\n");
            }else if(!queue.isQueueEmpty() && ( isBrace(json[i]) || isComma(json[i]))){
                result.append(" ");
                while (!queue.isQueueEmpty()){
                    result.append(queue.DeQueue());
                }

                if(isComma(json[i])){
                    result.append(json[i]).append("\n");
                }else {
                    result.append("\n").append(json[i]);
                }
            }else {
                queue.EnQueue(json[i]);
            }

        }

        return result.toString();
    }

    private boolean isBrace(char brace){

        boolean flag=false;

        switch (brace){

            case '{': flag=true; break;
            case '[': flag=true; break;
            case '}': flag=true; break;
            case ']':flag=true; break;
        }
    return flag;
    }

    private boolean isComma(char comma){

        if(comma==','){
            return true;
        }else {
            return false;
        }

    }
}
