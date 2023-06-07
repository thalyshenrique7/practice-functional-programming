package odd;

import java.util.Arrays;
import java.util.List;

/**
 *  In a list with integers numbers, return a new list only with square of odd numbers
 */
public class OddNumberExercise {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int calculate = numbers.stream()
                .filter(odd -> odd % 2 == 1)
                .reduce(0, Integer::sum);

        System.out.println(calculate);
    }
}
