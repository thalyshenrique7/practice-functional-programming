package integer;

import java.util.Arrays;
import java.util.List;

/**
 *  Verify if exists integers numbers in a list
 */
public class IntegerExercise {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(-2, 0, 5, -10, 3);

        boolean verify = integers.stream()
                .anyMatch(number -> number > 0);

        System.out.println(verify);
    }
}
