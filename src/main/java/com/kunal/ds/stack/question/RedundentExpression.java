package com.kunal.ds.stack.question;

import com.kunal.ds.stack.impl.Stack_Array;

public class RedundentExpression {

    private final static Character OPENING_BRACE='(';
    private final static Character CLOSING_BRACE=')';


    public static void main(String[] args) {

        String A="(c+(a+b))";

       System.out.println(new RedundentExpression().braces(A));
    }

    public int braces(String A) {
        Character currentChar=null;
        Character[] array=new Character[50];
        Stack_Array<Character> stack=new Stack_Array<>(array);
        int consecutiveClosingBrace=0;

        for(int i=0;i<A.length();i++) {
            currentChar = A.charAt(i);

            if (!currentChar.equals(CLOSING_BRACE) && !this.isOperator(stack.topOfStck())) {
                stack.push(currentChar);
                consecutiveClosingBrace=0;
            } else if(currentChar.equals(CLOSING_BRACE)){
                stack.pop();
                consecutiveClosingBrace++;
            }else {
                consecutiveClosingBrace=0;
                switch (stack.topOfStck()) {
                    case '+':
                        stack.pop();
                        stack.pop();
                        break;
                    case '-':
                        stack.pop();
                        stack.pop();
                        break;
                    case '*':
                        stack.pop();
                        stack.pop();
                        break;
                    case '/':
                        stack.pop();
                        stack.pop();
                        break;

                }

            }

            if(consecutiveClosingBrace>1){
                consecutiveClosingBrace=1;
                break;
            }
        }

        return consecutiveClosingBrace;
    }

    private boolean isOperator(Character c){

        if(c==null){
            return false;
        }
        else if(c=='+' || c=='-' || c=='*' || c=='/'){
            return true;
        }else {
            return false;
        }
    }

}
