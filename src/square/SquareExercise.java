package square;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  Find the square for each number in a list and return a new list with the results
 */
public class SquareExercise {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squares = numbers.stream()
                .map( number -> number * number)
                .collect(Collectors.toList());

        squares.forEach(System.out::println);
    }
}
