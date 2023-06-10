package password;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  Return password equals or with more than 8 characters
 */
public class PasswordValid {
    public static void main(String[] args) {

        List<String> passwordList = Arrays.asList("12345678", "1234567", "123456789", "12345678910");

        List<String> filterPasswordValid = passwordList.stream()
                .filter(password -> password.length() >= 8)
                .collect(Collectors.toList());

        System.out.println("Password Valid List");
        filterPasswordValid.forEach(System.out::println);
    }
}
