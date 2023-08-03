package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Book {

    // attributes
    private String name;
    private int numberOfPages;
    private int publicationYear;
    private LocalDateTime addedToShelf;

    //constructor
    public Book(String name, int numberOfPages, int publicationYear) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
        this.addedToShelf = LocalDateTime.now();
    }

    //getter
    public String getName() {
        return name;
    }

    //    format << A Brief History of Time, 256 pages, 1988
//                  title                 pages     year
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy " +
                "HH:mm:ss");
        return "\t" + getName() + ", " + this.numberOfPages + ", "
                + this.publicationYear + " (item added: " +
                formatter.format(this.addedToShelf) + ")";
    }
}
