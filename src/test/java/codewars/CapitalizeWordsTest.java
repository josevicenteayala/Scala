package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CapitalizeWordsTest {


    @Test
    public void toJadenCaseTest() {
        CapitalizeWords capitalizeWords = new CapitalizeWords();
        assertEquals ("The Boy Is A Good Kid", capitalizeWords.toJadenCase("the boy is a good kid"));
    }

    @Test
    public void nullArgument() {
        CapitalizeWords capitalizeWords = new CapitalizeWords();
        assertEquals(null, capitalizeWords.toJadenCase(null));
    }

    @Test
    public void emptyArgument() {
        CapitalizeWords capitalizeWords = new CapitalizeWords();
        assertEquals(null, capitalizeWords.toJadenCase(""));
    }
}