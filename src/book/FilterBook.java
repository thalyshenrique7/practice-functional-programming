package book;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterBook {
    public static void main(String[] args) {

        List<Book> bookList = Arrays.asList(new Book("Book 1", "Author 1", 2000),
                                            new Book("Book 2", "Author 2", 2011),
                                            new Book("Book 3", "Author 3", 2012));

        List<Book> filterBooks = bookList.stream()
                .filter(book -> book.getYear() > 2010)
                .collect(Collectors.toList());

        filterBooks.forEach(System.out::println);
    }
}
