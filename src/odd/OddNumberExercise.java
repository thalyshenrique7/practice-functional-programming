package odd;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  In a list with integers numbers, return a new list only with square of odd numbers
 */
public class OddNumberExercise {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> calculate = numbers.stream()
                .filter(odd -> odd % 2 == 1)
                        .map(odd -> odd * odd)
                                .collect(Collectors.toList());

        System.out.println(calculate);
    }
}
