package string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  Filter a list of strings to get only strings with first char specific
 */
public class StringFilterExercise {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "python", "php", "javascript", "angular");
        char specific = 'j';

        List<String> filters = words.stream()
                .filter( word -> word.charAt(0) == specific)
                .collect(Collectors.toList());

        filters.forEach(System.out::println);
    }
}
