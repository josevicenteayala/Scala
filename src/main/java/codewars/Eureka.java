package codewars;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * The number 89 is the first integer with more than one digit that fulfills the property partially introduced in the title of this kata.
 * What's the use of saying "Eureka"? Because this sum gives the same number.
 *
 * In effect: 89 = 8^1 + 9^2
 *
 * The next number in having this property is 135.
 *
 * See this property again: 135 = 1^1 + 3^2 + 5^3
 *
 * We need a function to collect these numbers, that may receive two integers a, b that defines the range [a, b] (inclusive)
 * and outputs a list of the sorted numbers in the range that fulfills the property described above.
 *
 * Let's see some cases (input -> output):
 *
 * 1, 10 -> [1, 2, 3, 4, 5, 6, 7, 8, 9]
 *
 * 1, 100 -> [1, 2, 3, 4, 5, 6, 7, 8, 9, 89]
 * If there are no numbers of this kind in the range [a, b] the function should output an empty list.
 *
 * 90, 100 --> []
 */
public class Eureka {

    public static List<Long> getEurekaNumbers(long initialRange, long finalRange) {
        return LongStream.range(initialRange, ++finalRange).filter(n->isEurekaNumber(n)).boxed().collect(Collectors.toList());
    }

    public static boolean isEurekaNumber(Long number){
        int maxExponent = number.toString().length();
        int[] ints = Long.toString(number).chars().map(i -> i - '0').toArray();
        return IntStream.range(1,++maxExponent).mapToDouble(e -> Math.pow(ints[e-1], e)).sum() == number.doubleValue();
    }

    private static boolean isEurekaNumberEnhanced(long x){
        String value = Long.toString(x);
        return IntStream.range(0, value.length())
                .mapToDouble(i -> Math.pow(Character.getNumericValue(value.charAt(i)), i + 1))
                .sum() == x;
    }

}
