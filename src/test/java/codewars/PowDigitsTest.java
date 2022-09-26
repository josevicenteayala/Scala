package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowDigitsTest {

    @Test
    public void isValidDigitsWhenTheArgumentIs89() {
        assertEquals(1,PowDigits.digPow(89, 1));
    }

    @Test
    public void isValidDigitsWhenTheArgumentIs92() {
        assertEquals(-1,PowDigits.digPow(92, 1));
    }

    @Test
    public void isValidDigitsWhenTheArgumentIs46288() {
        assertEquals(51,PowDigits.digPow(46288, 3));
    }

}