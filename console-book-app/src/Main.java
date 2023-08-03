
import model.Book;

import java.util.Scanner;
import java.util.ArrayList;

/*** BOBSAYS:
 * Write a program that first reads book information from
 * the user. The details to be asked for each book include
 * the title, the number of pages and the publication year.
 * Entering an empty string as the name of the book ends
 * the reading process.
 *
 * After this the user is asked for what is to be printed.
 * If the user inputs "everything", all the details
 * are printed: the book titles, the numbers of pages and
 * the publication years. However, if the user enters the
 * string "name", only the book titles are printed.
 *
 * It is probably worthwhile to implement a class called
 * Book to represent a book. There are two points in
 * total available for this exercise.
 *
 */

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        System.out.println("\n\tEnter the book details or leave blank " +
                "and\n\tpress enter to exit");

        while (true) {
            System.out.print("\tBook title: ");
            String bookTitle = scan.nextLine();

            if (bookTitle.isEmpty()) {
                break;
            }

            System.out.print("\tNumber of pages: ");
            int numOfPages = Integer.valueOf(scan.nextLine());

            System.out.print("\tYear of publication: ");
            int pubYear = Integer.valueOf(scan.nextLine());

            books.add(new Book(bookTitle, numOfPages, pubYear));
            System.out.println();
        }

        if (books.isEmpty()) {
            System.out.println("\tThank You for supporting our app!");
            return;
        }

        System.out.println("\n\tWhat information about the books You'd like " +
                "to be displayed? ");
        System.out.println("\toptions: everything, name");
        System.out.print("\tYour option: ");
        String userChose = scan.nextLine();


        while (!(userChose.equals("name") || userChose.equals("everything"))) {
            System.out.print("\tEnter valid option: ");
            userChose = scan.nextLine();
        }

            if (userChose.equals("everything")) {
                System.out.println();
                for (Book aBook : books) {
                    System.out.println(aBook);
                }
            } else if (userChose.equals("name")) {
                System.out.println();
                for (Book aBook : books) {
                    System.out.println("\t" + aBook.getName());
                }
            }
        scan.close();
    }
}