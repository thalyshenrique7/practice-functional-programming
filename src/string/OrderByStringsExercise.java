package string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  Ordered in order by crescent alphabetical a list of strings
 */
public class OrderByStringsExercise {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Sons of Anarchy", "Breaking Bad", "Supernatural", "Stranger Things", "Air Force");

        List<String> compareWords = words.stream()
                .sorted(String::compareTo)
                .collect(Collectors.toList());

        compareWords.forEach(System.out::println);
    }
}
