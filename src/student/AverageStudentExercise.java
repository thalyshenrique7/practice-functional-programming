package student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *  Calculate the average of students and return the student with more than average
 */
public class AverageStudentExercise {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList( new Student("Tyler", 7, 6.5, 8),
                                                new Student("Caleb", 9, 8.5, 10),
                                                new Student("Trent", 6, 6.5, 6.9));

        Student compareToAverage = students.stream()
                .max(Comparator.comparingDouble(Student::averageStudent))
                .orElse(null);

        System.out.println(compareToAverage);
    }
}
