package Task1;

public class Book {

    private String title;
    private String author;
    private int pages;
    private double price;

    public Book(String title, String author, int pages, double price) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        String result = "";
        final String FORMAT = "%-25s";
        result += String.format(FORMAT + "%s\n", "Title:", title);
        result += String.format(FORMAT + "%s\n", "Author:", author);
        result += String.format(FORMAT + "%d\n", "Pages:", pages);
        result += String.format(FORMAT + "$%,.2f\n", "Price:", price);
        return result;
    }
}
