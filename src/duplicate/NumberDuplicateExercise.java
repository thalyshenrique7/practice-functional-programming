package duplicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  In a list of numbers, remove each number duplicate and return new list with numbers no duplicates
 */
public class NumberDuplicateExercise {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 9, 10);

        List<Integer> filterNoDuplicate = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        filterNoDuplicate.forEach(System.out::println);
    }
}
