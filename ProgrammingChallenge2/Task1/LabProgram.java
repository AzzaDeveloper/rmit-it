package Task1;

import java.util.Scanner;

public class LabProgram {
    public static void main(String args[]) {

        FileReader fr = new FileReader();
        try {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the name of the file:");
            String filename = scanner.nextLine();
            
            // Modify this method call when testing the search version of readBooks
            Book[] books = fr.readBooks(filename);

            for (int i = 0; i < books.length; i++) {
                System.out.println(books[i]);
            }
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}