package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    public void validExpressionWithParentheses(){
        assertAll(
                () -> assertTrue(ValidParentheses.checkParentheses("(()())")),
                () -> assertTrue(ValidParentheses.checkParentheses("()")),
                () -> assertTrue(ValidParentheses.checkParentheses("((())())")),
                () -> assertTrue(ValidParentheses.checkParentheses("(()(()))")),
                () -> assertTrue(ValidParentheses.checkParenthesesEnhanced("(()())")),
                () -> assertTrue(ValidParentheses.checkParenthesesEnhanced("()")),
                () -> assertTrue(ValidParentheses.checkParenthesesEnhanced("((())())")),
                () -> assertTrue(ValidParentheses.checkParenthesesEnhanced("(()(()))")),
                () -> assertTrue(ValidParentheses.checkParenthesesEnhanced2("(()())")),
                () -> assertTrue(ValidParentheses.checkParenthesesEnhanced2("()")),
                () -> assertTrue(ValidParentheses.checkParenthesesEnhanced2("((())())")),
                () -> assertTrue(ValidParentheses.checkParenthesesEnhanced2("(()(()))"))
        );
    }

    @Test
    public void noValidExpressionWithParentheses(){
        assertAll(
                () -> assertFalse(ValidParentheses.checkParentheses("(")),
                () -> assertFalse(ValidParentheses.checkParentheses(")")),
                () -> assertFalse(ValidParentheses.checkParentheses("((()")),
                () -> assertFalse(ValidParentheses.checkParentheses("()(()))")),
                () -> assertFalse(ValidParentheses.checkParenthesesEnhanced("(")),
                () -> assertFalse(ValidParentheses.checkParenthesesEnhanced(")")),
                () -> assertFalse(ValidParentheses.checkParenthesesEnhanced("((()")),
                () -> assertFalse(ValidParentheses.checkParenthesesEnhanced("()(()))")),
                () -> assertFalse(ValidParentheses.checkParenthesesEnhanced2("(")),
                () -> assertFalse(ValidParentheses.checkParenthesesEnhanced2(")")),
                () -> assertFalse(ValidParentheses.checkParenthesesEnhanced2("((()")),
                () -> assertFalse(ValidParentheses.checkParenthesesEnhanced2("()(()))"))
        );
    }

}