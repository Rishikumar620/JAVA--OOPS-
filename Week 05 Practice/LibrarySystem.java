//Create a class hierarchy for a library system with classes such as LibraryItem, Book, DVD, and Journal. Implement methods for checking out and returning items.
class LibraryItem {
    String title;
    int itemId;
    boolean checkedOut;
    LibraryItem(String title, int itemId) {
        this.title = title;
        this.itemId = itemId;
        this.checkedOut = false;
    }
    void checkOut() {
        if (checkedOut) {
            System.out.println(title + " is already checked out");
        } else {
            checkedOut = true;
            System.out.println(title + " has been checked out");
        }
    }
    void returnItem() {
        if (!checkedOut) {
            System.out.println(title + " was not checked out");
        } else {
            checkedOut = false;
            System.out.println(title + " has been returned");
        }
    }
}
class Book extends LibraryItem {
    Book(String title, int itemId) {
        super(title, itemId);
    }
}
class DVD extends LibraryItem {
    DVD(String title, int itemId) {
        super(title, itemId);
    }
}
class Journal extends LibraryItem {
    Journal(String title, int itemId) {
        super(title, itemId);
    }
}
public class LibrarySystem {
    public static void main(String[] args) {
        Book book = new Book("MATH", 101);
        DVD dvd = new DVD("CGU", 202);
        Journal journal = new Journal("R.D-Sharma", 303);
        book.checkOut();
        book.checkOut();
        book.returnItem();
    }
}
