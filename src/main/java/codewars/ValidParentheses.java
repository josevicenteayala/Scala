package codewars;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Write a function that takes a string of parentheses, and determines if the order of the parentheses is valid.
 * The function should return true if the string is valid, and false if it's invalid.
 *
 * Examples
 * "()"              =>  true
 * ")(()))"          =>  false
 * "("               =>  false
 * "(())((()())())"  =>  true
 * "(()))"
 * Constraints
 * 0 <= input.length <= 100
 *
 * Along with opening (() and closing ()) parenthesis, input may contain any valid ASCII characters.
 * Furthermore, the input string may be empty and/or not contain any parentheses at all.
 * Do not treat other forms of brackets as parentheses (e.g. [], {}, <>).
 * */
public class ValidParentheses {

    public static boolean checkParentheses(String expression){
        int counter = 0;
        for (char p: expression.toCharArray()){
            switch (p) {
                case '(': {
                    counter+= 1;
                }
                break;
                case ')': {
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

    public static boolean checkParenthesesEnhanced(String expression) {
        String str = expression.replaceAll("[^()]", "");
        while (str.contains("()")) str = str.replaceAll("\\(\\)", "");
        return str.length() == 0;
    }

    public static boolean checkParenthesesEnhanced2(String expression) {
        try {
            Pattern.compile(expression.replaceAll("[^()]", ""));
            return true;
        } catch (PatternSyntaxException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkParentheses("()()"));
    }
}
