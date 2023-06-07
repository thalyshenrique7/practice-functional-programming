package pairs;

import java.util.Arrays;
import java.util.List;

/**
 *  Calculate the sum of pairs of numbers in a list
 */
public class NumberPairExercise {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int calculate = numbers.stream()
                .filter(pair -> pair % 2 == 0)
                .reduce(0, Integer::sum);

        System.out.println(calculate);
    }
}
