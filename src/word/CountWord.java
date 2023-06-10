package word;

import java.util.Arrays;
import java.util.List;

public class CountWord {
    public static void main(String[] args) {

        List<String> wordsList = Arrays.asList("Honda Civic", "Corolla", "Nissan 350Z", "Subaru", "Eclipse", "Mustang");

        long wordCount = wordsList.stream()
                .flatMap(word -> Arrays.stream(word.split("\\s+")))
                .count();

        System.out.println("Quantity words in list: " + wordCount);
    }
}
