package codewars;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class CapitalizeWords {

    public String toJadenCase(String phrase) {
        if (Objects.isNull(phrase) || phrase.isEmpty()) return null;

        String result = Arrays.stream(phrase.split(" ")).map(s -> s.substring(0, 1).toUpperCase() + s.substring(1)+ " ").collect(Collectors.joining());

        return result.trim();
    }
}
