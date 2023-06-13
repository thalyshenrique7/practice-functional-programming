package upper;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperExercise {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello", "world", "java");

        List<String> upper = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        upper.forEach(System.out::println);

        System.out.println("-------------------------");

        List<String> onlyFirstUpper = list.stream()
                .map(word -> word.substring(0 ,1).toUpperCase() + word.substring(1).toLowerCase())
                .collect(Collectors.toList());

        onlyFirstUpper.forEach(System.out::println);
    }
}
