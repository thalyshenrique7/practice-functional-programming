package readArchive;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  Read a CSV file (comma separated values) containing student information (name, age, grade) and return the average grade
 */
public class ReadArchiveStudentsExercise {
    public static void main(String[] args) throws IOException {

        Path archive = Paths.get("students.csv");

        List<Student> studentList = Files.lines(archive)
                .map(line -> line.split(";"))
                .map(list -> new Student(list[0], list[1], list[2]))
                .collect(Collectors.toList());

        studentList.forEach(System.out::println);
    }
}
