package codewars;

import net.liftweb.http.S;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of the strings of a1 which are substrings of strings of a2.
 *
 * Example 1:
 * a1 = ["arp", "live", "strong"]
 *
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 *
 * returns ["arp", "live", "strong"]
 *
 * Example 2:
 * a1 = ["tarp", "mice", "bull"]
 *
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 *
 * returns []
 *
 * Notes:
 * Arrays are written in "general" notation. See "Your Test Cases" for examples in your language.
 * In Shell bash a1 and a2 are strings. The return is a string where words are separated by commas.
 * Beware: In some languages r must be without duplicates.
 * */
public class LexicographicalOrder {

    public static String[] inArray(String[] array1, String[] array2) {
       return Arrays.asList(array1).stream().sorted().filter(s -> !Arrays.stream(array2).filter(string -> string.contains(s)).collect(Collectors.toList()).isEmpty()).toArray(String[]::new);
    }
}
