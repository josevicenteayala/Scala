package codewars;

import java.util.Stack;

public class ValidBraces {

    public static boolean isValidBracesExpression(String expression){
        int counter = 0;

        for (char p: expression.toCharArray()){
            switch (p) {
                case '(', '{', '[': {
                    counter+= 1;
                }
                break;
                case ')', '}',']': {
                    if(counter <=0) {
                        return false;
                    }
                    counter-= 1;
                    if(counter < 0){
                        return false;
                    }
                }
            }
        }
        return counter == 0;
    }

    public static boolean validBraces(String braces) {
        Stack<Character> stack = new Stack<>();
        for (char ch : braces.toCharArray()) {
            switch (ch) {
                case '(', '[', '{': stack.push(ch); break;
                case ')': if(!stack.isEmpty() && stack.peek() == '(') stack.pop(); else stack.push(ch); break;
                case '}': if(!stack.isEmpty() && stack.peek() == '{') stack.pop(); else stack.push(ch);  break;
                case ']': if(!stack.isEmpty() && stack.peek() == '[') stack.pop(); else stack.push(ch);  break;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(validBraces("({{}}){}[()]"));
    }

}
