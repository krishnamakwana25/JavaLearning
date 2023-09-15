package org.example.logicalprograms;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {

        String expression = "[()]{}{[()()]()}";
//        String expression = "[(])";
        boolean check = extracted(expression);
        System.out.println("Given " + expression + " Expression is "+((check == true) ? "valid" : "not valid"));

    }

    private static boolean extracted(String expression) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            } else if (ch == ')') {
                if(stack.isEmpty()) return false;
                else if (stack.peek() != '(') {
                    return false;
                }
                else stack.pop();
            }
            else if (ch == '}') {
                if(stack.isEmpty()) return false;
                else if (stack.peek() != '{') {
                    return false;
                }
                else stack.pop();
            }
            else if (ch == ']') {
                if(stack.isEmpty()) return false;
                else if (stack.peek() != '[') {
                    return false;
                }
                else stack.pop();
            }
        }
        if(stack.isEmpty())return  true;
        else return false;
    }
}
