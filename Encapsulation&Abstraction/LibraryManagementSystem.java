abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() { return itemId; }
    public void setItemId(String itemId) { this.itemId = itemId; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public abstract int getLoanDuration();

    public void displayItemDetails() {
        System.out.println("ID: " + itemId + " | Title: " + title + " | Author: " + author);
    }
}

class Book extends LibraryItem {
    public Book(String id, String title, String author) { super(id, title, author); }
    @Override public int getLoanDuration() { return 14; }
}

class Magazine extends LibraryItem {
    public Magazine(String id, String title, String author) { super(id, title, author); }
    @Override public int getLoanDuration() { return 7; }
}

class DVD extends LibraryItem {
    public DVD(String id, String title, String author) { super(id, title, author); }
    @Override public int getLoanDuration() { return 3; }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book = new Book("B01", "1984", "George Orwell");
        Magazine mag = new Magazine("M01", "Tech Today", "Various");
        DVD dvd = new DVD("D01", "Inception", "Christopher Nolan");

        book.displayItemDetails();
        System.out.println("Loan Duration: " + book.getLoanDuration() + " days\n");

        mag.displayItemDetails();
        System.out.println("Loan Duration: " + mag.getLoanDuration() + " days\n");

        dvd.displayItemDetails();
        System.out.println("Loan Duration: " + dvd.getLoanDuration() + " days");
    }
}
