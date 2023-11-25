package Task1;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReader {

    // This function returns all books in the input file
    public Book[] readBooks(String fileName) throws IOException {
        FileInputStream fileStream = new FileInputStream(fileName);
        Scanner inFs = new Scanner(fileStream);
        //
        int numBooks = inFs.nextInt();
        inFs.nextLine();
        //
        Book[] books = new Book[numBooks];
        //
        for (int i = 0; i < numBooks; i++) {
            String title = inFs.nextLine();
            String author = inFs.nextLine();
            int pages = inFs.nextInt();
            double price = inFs.nextDouble();
            inFs.nextLine();
            //
            Book book = new Book(title, author, pages, price);
            books[i] = book;
        }
        return books;
    }

    // This function returns all books that have the seach term in their title in
    // the input file
    public Book[] readBooks(String fileName, String searchTerm) throws IOException {
        FileInputStream fileStream = new FileInputStream(fileName);
        Scanner inFs = new Scanner(fileStream);
        //
        int numBooks = inFs.nextInt();
        inFs.nextLine();
        //
        Book[] books = new Book[numBooks];
        //
        for (int i = 0; i < numBooks; i++) {
            String title = inFs.nextLine();
            String author = inFs.nextLine();
            int pages = inFs.nextInt();
            double price = inFs.nextDouble();
            inFs.nextLine();
            //
            Book book = new Book(title, author, pages, price);
            books[i] = book;    
        }
        int numBooksHasSearch = 0;
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getTitle().contains(searchTerm)) {
                numBooksHasSearch++;
            }
        }
        Book[] booksWithTitle = new Book[numBooksHasSearch];
        int c = 0;
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getTitle().contains(searchTerm)) {
                booksWithTitle[c] = books[i];
                c++;
            }
        }
        return booksWithTitle;
    }
}