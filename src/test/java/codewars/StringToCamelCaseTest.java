package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToCamelCaseTest {

    @Test
    public void convertWordsWithUnderscoreToCamelCase(){
        String words = "This_Is_An_example";
        assertEquals("ThisIsAnExample",StringToCamelCase.convertToCamelCase(words));
    }

    @Test
    public void convertWordsWithDashToCamelCase(){
        String words = "This-Is-An-example";
        assertEquals("ThisIsAnExample",StringToCamelCase.convertToCamelCase(words));
    }

    @Test
    public void convertWordsWithUnderscoreFirsWordInLowerCaseToCamelCase(){
        String words = "this_Is_An_example";
        assertEquals("thisIsAnExample",StringToCamelCase.convertToCamelCase(words));
    }

    @Test
    public void convertWordsWithDashFirstWordInLowerCaseToCamelCase(){
        String words = "this-Is-An-example";
        assertEquals("thisIsAnExample",StringToCamelCase.convertToCamelCase(words));
    }

}