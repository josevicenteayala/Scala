package codewars;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LexicographicalOrderTest {

    @Test
    public void validateStringIsContained(){
        String[] initialArray = new String[]{"arp", "live", "strong"};
        String[] secondArray = new String[]{"lively", "alive", "harp", "sharp", "armstrong"};
        String[] arrayExpected = new String[]{"arp", "live", "strong"};
        String[] arrayResult = LexicographicalOrder.inArray(initialArray, secondArray);

        Arrays.stream(arrayResult).forEach(s -> System.out.println(s));

        assertArrayEquals(arrayExpected, arrayResult);
    }

    @Test
    public void validateStringIsNotContained(){
        String[] initialArray = new String[]{"tarp", "mice", "bull"};
        String[] secondArray = new String[]{"lively", "alive", "harp", "sharp", "armstrong"};
        String[] arrayExpected = new String[]{};
        String[] arrayResult = LexicographicalOrder.inArray(initialArray, secondArray);

        Arrays.stream(arrayResult).forEach(s -> System.out.println(s));

        assertArrayEquals(arrayExpected, arrayResult);
    }

}