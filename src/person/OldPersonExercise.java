package person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Return the person with more than age
 */
public class OldPersonExercise {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(new Person("Jax", 30),
                                            new Person("Clay", 20),
                                            new Person("Chibs", 40));

        Person oldPerson = people.stream()
                .max(Comparator.comparingInt(Person::getAge))
                .orElse(null);

        System.out.println(oldPerson.getName());
    }
}
