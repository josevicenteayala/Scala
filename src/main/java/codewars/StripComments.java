package codewars;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Complete the solution so that it strips all text that follows any of a set of comment markers passed in. Any whitespace at the end of the line should also be stripped out.
 *
 * Example:
 *
 * Given an input string of:
 *
 * apples, pears # and bananas
 * grapes
 * bananas !apples
 * The output expected would be:
 *
 * apples, pears
 * grapes
 * bananas
 * The code would be called like so:
 *
 * var result = solution("apples, pears # and bananas\ngrapes\nbananas !apples", ["#", "!"])
 * // result should == "apples, pears\ngrapes\nbananas"
 */
public class StripComments {

    public static String stripComments(String text, String[] commentSymbols){
        String[] split = text.split("\n");
        StringBuffer stringBuffer = new StringBuffer();
        for (String word:split){
            boolean hasMatched = false;
            for(String symbol:commentSymbols){
                if(word.trim().isEmpty()){
                    stringBuffer.append(word + "\n");
                    hasMatched = true;
                    break;
                } else if(word.contains(symbol)){
                    stringBuffer.append(word.substring(0, word.indexOf(symbol)).replaceAll("\\s+$", "") + "\n");
                    hasMatched = true;
                    break;
                }
            }
            if(!hasMatched){
                stringBuffer.append(word.replaceAll("\\s+$", "") + "\n");
            }
        }
        return stringBuffer.substring(0,stringBuffer.length()-1).replaceAll("\\s+$", "");
    }

    public static String stripComments2(String text, String[] commentSymbols){
        String response = Arrays.stream(text.split("\n"))
                .map(s -> Arrays.stream(commentSymbols)
                        .filter(c -> s.contains(c))
                        .flatMap(c -> Stream.of(s.substring(0, s.indexOf(c))))
                        .findFirst()
                        .orElse(s).replaceAll("\\s+$", "") + "\n")
                .collect(Collectors.joining());
        return response.substring(0,response.length()-1).trim();
    }

    public static String filterCharacters(String word, String[] commentSymbols){
        return Arrays.stream(commentSymbols).filter(c -> word.contains(c)).map(c -> word.substring(0, word.indexOf(c))).findFirst().orElse(word).trim();
    }


    public static void main(String[] args) {
        //System.out.println(stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[]{"#", "!"}));
        System.out.println("***********************************");
        System.out.println(stripComments("\n" +
                "\n" +
                "f\n" +
                "\n" +
                "dccd!da\n" +
                "\n" +
                "\n" +
                "\n" +
                "cb\n" +
                "\n" +
                "-e", new String[]{"#", "$", "!", "-"}));


    }
}
