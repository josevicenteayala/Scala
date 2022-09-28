package codewars;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Return a string that looks like a diamond shape when printed on the screen, using asterisk (*) characters. Trailing spaces should be removed, and every line must be terminated with a newline character (\n).
 *
 * Return null/nil/None/... if the input is an even number or negative, as it is not possible to print a diamond of even or negative size.
 *
 * Examples
 * A size 3 diamond:
 *
 *  *
 * ***
 *  *
 * ...which would appear as a string of " *\n***\n *\n"
 *
 * A size 5 diamond:
 *
 *   *
 *  ***
 * *****
 *  ***
 *   *
 * ...that is:
 *
 * "  *\n ***\n*****\n ***\n  *\n"
 *
 * A size 7 diamond:
 *
 *      *
 *     ***
 *    *****
 *   *******
 *    *****
 *     ***
 *      *
 * ...that is:
 *
 * "   *\n  ***\n*****\n *******\n *****\n  ***\n   *\n"
 * identify the number of layers from 1 to n number = (odd+1)/2
 * loop the numbers of layers and create the diamond
 * */
public class DrawDiamond {

    public static final String BLANK = " ";
    public static final String ASTERISK = "*";

    public static void main(String[] args) {
        System.out.println(drawDiamond(7));
        int n = 23;

        IntStream.range(0, n * 2)
                .filter(i -> i % 2 > 0)
                .map(i -> {
                    System.out.println("i: " + i);
                    int result = i > n ? n - (i - n) : i;
                    System.out.println("result: " + result);
                    return result;
                })
                .mapToObj(i -> " ".repeat((n - i) / 2) + "*".repeat(i) + "\n")
                .collect(Collectors.joining());
    }

    public static String drawDiamond(int diamondSize){
        if(diamondSize <= 0 || diamondSize % 2 == 0) return null;
        int odds = (diamondSize + 1)/2;
        int asteriskQuantityAscending = 1;
        int asteriskQuantityDescending = diamondSize-2;
        StringBuilder stringBuilder = new StringBuilder();

        for (int l = odds-1; l >= 0; l--){
            stringBuilder.append(fillDiamond(l, asteriskQuantityAscending));
            asteriskQuantityAscending += 2;
        }

        for (int l = 1; l < odds; l++){
            stringBuilder.append(fillDiamond(l, asteriskQuantityDescending));
            asteriskQuantityDescending -= 2;
        }

        return stringBuilder.toString();
    }

    private static String fillDiamond(int numberOfBlanks, int numberOfAsterisks) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(BLANK.repeat(numberOfBlanks));
        stringBuilder.append(ASTERISK.repeat(numberOfAsterisks));
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    public static String drawDiamondEnhanced(final int n) {
        if (n < 0 || n % 2 == 0) {
            return null;
        }

        return IntStream.range(0, n * 2)
                .filter(i -> i % 2 > 0)
                .map(i -> i > n ? n - (i - n) : i)
                .mapToObj(i -> " ".repeat((n - i) / 2) + "*".repeat(i) + "\n")
                .collect(Collectors.joining());
    }

}
