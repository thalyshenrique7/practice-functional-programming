package readArchive;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *  Read the contents of a text file and count the total number of words in it
 *  Return all names in archive
 */
public class ReadArchiveTxtExercise {
    public static void main(String[] args) throws IOException {
        Path archive = Paths.get("names.txt");


        List<Name> nameList = Files.lines(archive)
                .map(line -> line.split(" "))
                .map(list -> new Name(list[0]))
                .collect(Collectors.toList());

        nameList.forEach(System.out::println);

        long count = Files.lines(archive)
                .flatMap(line -> Stream.of(line.split(" ")))
                .count();

        System.out.println("Total names in archive: " + count);
    }


}
