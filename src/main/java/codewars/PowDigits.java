package codewars;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Some numbers have funny properties. For example:
 *
 * 89 --> 8¹ + 9² = 89 * 1
 *
 * 695 --> 6² + 9³ + 5⁴= 1390 = 695 * 2
 *
 * 46288 --> 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51
 *
 * Given a positive integer n written as abcd... (a, b, c, d... being digits) and a positive integer p
 *
 * we want to find a positive integer k, if it exists, such that the sum of the digits of n taken to the successive powers of p is equal to k * n.
 * In other words:
 *
 * Is there an integer k such as : (a ^ p + b ^ (p+1) + c ^(p+2) + d ^ (p+3) + ...) = n * k
 *
 * If it is the case we will return k, if not return -1.
 *
 * Note: n and p will always be given as strictly positive integers.
 * */
public class PowDigits {
    
    public static long digPow(int n, int p) {
        if(n < 0) return -1;
        String[] strings = String.valueOf(n).split("");
        List<Integer> integerList = Arrays.stream(strings).map(i -> Integer.valueOf(i)).collect(Collectors.toList());
        int sum = 0;
        for(int i:integerList){
           sum += Math.pow(i, p++);
        }

        if(sum % n == 0) return sum / n;
        
        return -1;
    }

    public static long digPowVersion2(int n, int p) {
        if(n < 0) return -1;
        int[] ints = String.valueOf(n).chars().map(Character::getNumericValue).toArray();
        int sum = IntStream.range(0, ints.length).map(counter -> (int) Math.pow(ints[counter], counter + p)).sum();

        return sum % n == 0 ? sum / n : -1;
    }

    private static Function<Integer, Double> getIntegerDoubleFunction(int pow) {
        System.out.println("pow is " + pow);
        ++pow;
        int finalPow = pow;
        return number -> Math.pow(number, finalPow);
    }

}
