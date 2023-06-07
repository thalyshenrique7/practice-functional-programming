package string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  Return words with more than 5 characters
 */
public class StringMoreThan5Characters {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Honda Civic", "Corolla", "Celta", "Gol", "Bmw", "Mercedes", "Hyundai");

        List<String> filter = words.stream()
                .filter(word -> word.length() > 5)
                .collect(Collectors.toList());

        filter.forEach(System.out::println);
    }
}
