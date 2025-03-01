import java.time.LocalDate;
class LibraryItem {
    LocalDate dateOfIssue, dateOfReturn;
    String title, author;

    LibraryItem(LocalDate dateOfIssue, String title, String author) {
        this.dateOfIssue = dateOfIssue;
        this.dateOfReturn = dateOfIssue.plusDays(7);
        this.title = title;
        this.author = author;
    }
    void display() {
        System.out.println("Issued: " + dateOfIssue + ", Return: " + dateOfReturn + 
                           ", Title: " + title + ", Author: " + author);
    }
}
class Book extends LibraryItem {
    int noOfPages;

    Book(LocalDate dateOfIssue, String title, String author, int noOfPages) {
        super(dateOfIssue, title, author);
        this.noOfPages = noOfPages;
    }
    @Override
    void display() {
        super.display();
        System.out.println("Pages: " + noOfPages);
    }
}
class DVD extends LibraryItem {
    int videoLength;
    DVD(LocalDate dateOfIssue, String title, String author, int videoLength) {
        super(dateOfIssue, title, author);
        this.videoLength = videoLength;
    }
    @Override
    void display() {
        super.display();
        System.out.println("Length: " + videoLength + " hrs");
    }
}
class Journal extends LibraryItem {
    int issueNumber;
    Journal(LocalDate dateOfIssue, String title, String author, int issueNumber) {
        super(dateOfIssue, title, author);
        this.issueNumber = issueNumber;
    }
    @Override
    void display() {
        super.display();
        System.out.println("Issue No: " + issueNumber);
    }
}
public class LibrarySystem {
    public static void main(String[] args) {
        Book book = new Book(LocalDate.now(), "Metamorphosis", "Franz Kafka", 100);
        DVD dvd = new DVD(LocalDate.now(), "Harry Potter", "JK Rowling", 2);
        Journal journal = new Journal(LocalDate.now(), "The Diary of a Young Girl", "Anne Frank", 101);
        book.display();
        dvd.display();
        journal.display();
    }
}
