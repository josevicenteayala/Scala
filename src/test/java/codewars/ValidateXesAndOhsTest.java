package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateXesAndOhsTest {

    @Test
    public void sameQuantityOfOhsAndXes (){
       assertTrue(ValidateXesAndOhs.getXO("ooxx"));
    }

    @Test
    public void sameQuantityButXInUpperCase (){
        assertTrue(ValidateXesAndOhs.getXO("ooxXm"));
    }

    @Test
    public void moreXesThanOhs (){
        assertFalse(ValidateXesAndOhs.getXO("xooxx"));
    }

    @Test
    public void noXesAndOhs (){
        assertTrue(ValidateXesAndOhs.getXO("zpzpzpp"));
    }

    @Test
    public void withoutXes (){
        assertFalse(ValidateXesAndOhs.getXO("zzoo"));
    }
}