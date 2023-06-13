package concatenateString;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 *  Return all words concatenate without duplicate
 */
public class ConcatenateString {
    public static void main(String[] args) {

        String[] wordsList = {"Java", "Stream", "Java", "API"};

        String concatenate = Arrays.stream(wordsList)
                        .distinct()
                                .collect(Collectors.joining());

        System.out.println(concatenate);
    }
}
