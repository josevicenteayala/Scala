package codewars;

import java.util.Locale;
import java.util.stream.IntStream;

/**
 * Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive.
 * The string can contain any char.
 * */
public class ValidateXesAndOhs {

    public static boolean getXO (String str) {
        char[] charArray = str.toLowerCase().toCharArray();
        int numberOfOhs = countNumberOfAnSpecificCharacter(charArray, Character.valueOf('o'));
        int numberOfXes = countNumberOfAnSpecificCharacter(charArray, Character.valueOf('x'));
        return numberOfOhs == numberOfXes;
    }

    public static boolean getXOSuperCoolSolution (String str) {
        str = str.toLowerCase();
        int oLength = str.replace("o", "").length();
        int xLength = str.replace("x", "").length();
        return oLength == xLength;
    }

    private static int countNumberOfAnSpecificCharacter0(char[] charArray, Character character) {
        return IntStream.range(0, charArray.length).map(counter -> charArray[counter] == character ? 1 : 0).sum();
    }

    private static int countNumberOfAnSpecificCharacter(char[] charArray, Character character) {
        int counter = 0;
        for(Character c: charArray) {
            counter += c == character ? 1 : 0;
        }
        return counter;
    }

}
