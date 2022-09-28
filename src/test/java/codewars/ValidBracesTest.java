package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidBracesTest {

    @Test
    public void validBracesTest(){
        assertAll(
                () -> assertTrue(ValidBraces.isValidBracesExpression("(){}[]")),
                () -> assertTrue(ValidBraces.isValidBracesExpression("(()){{}}[[]]")),
                () -> assertTrue(ValidBraces.isValidBracesExpression("({[]})[()]{}[]")),
                () -> assertTrue(ValidBraces.isValidBracesExpression("[]")),
                () -> assertTrue(ValidBraces.isValidBracesExpression("{}")),
                () -> assertTrue(ValidBraces.isValidBracesExpression("()")),
                () -> assertTrue(ValidBraces.isValidBracesExpression("(){(})[]"))
        );
    }

    @Test
    public void noValidBracesTest(){
        assertAll(
                () -> assertFalse(ValidBraces.isValidBracesExpression("([){}[]")),
                () -> assertFalse(ValidBraces.isValidBracesExpression("((}{)){{}}[[]]")),
                () -> assertFalse(ValidBraces.isValidBracesExpression("({[]})[()]{}[{]")),
                () -> assertFalse(ValidBraces.isValidBracesExpression("[(}]")),
                () -> assertFalse(ValidBraces.isValidBracesExpression("]{}")),
                () -> assertFalse(ValidBraces.isValidBracesExpression("(()")),
                () -> assertFalse(ValidBraces.isValidBracesExpression("((){(})[]"))
        );
    }

}