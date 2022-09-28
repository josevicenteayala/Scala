package codewars;

import java.util.Arrays;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Complete the method/function so that it converts dash/underscore delimited words into camel casing.
 * The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case).
 *
 * Examples
 * "the-stealth-warrior" gets converted to "theStealthWarrior"
 * "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
 * */
public class StringToCamelCase {

    public static final String UNDERSCORE = "_";
    public static final String DASH = "-";

    public static String convertToCamelCase(String dashUnderscoreWords){
        if(dashUnderscoreWords.contains(UNDERSCORE)){
             return convertToCamelcase(dashUnderscoreWords, UNDERSCORE);
        } else if(dashUnderscoreWords.contains(DASH)) {
            return convertToCamelcase(dashUnderscoreWords, DASH);
        }
        return dashUnderscoreWords;
    }

    private static String convertToCamelcase(String dashUnderscoreWords, String separator) {
        StringBuilder stringBuilder = new StringBuilder();

        Function<String, Stream<String>> stringStreamFunction = s -> {
            stringBuilder.append(s.substring(0,1).toUpperCase());
            stringBuilder.append(s.substring(1).toLowerCase());

            return Stream.of(stringBuilder.toString());
        };
        Arrays.stream(dashUnderscoreWords.split(separator)).flatMap(stringStreamFunction).collect(Collectors.joining());
        return dashUnderscoreWords.charAt(0) +  stringBuilder.substring(1);
    }

    static String toCamelCase(String s){
        Matcher m = Pattern.compile("[_|-](\\w)").matcher(s);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, m.group(1).toUpperCase());
        }
        return m.appendTail(sb).toString();
    }

    public static void main(String[] args) {
        System.out.println(toCamelCase("Any_test_is_so_cool"));
    }

}
