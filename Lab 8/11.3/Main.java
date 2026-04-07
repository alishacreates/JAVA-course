// Design a Java application for a Library Management System:
// • Create class Book and Member.
// • Use encapsulation and constructors.
// • Implement interface Issueable with method issueBook().
// • Override methods where required.
// • Handle exception when book is not available.
// • Write a main() method to demonstrate all functionalities.

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}


interface Issueable {
    void issueBook(Book book) throws BookNotAvailableException;
}


class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }


    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean status) {
        this.isAvailable = status;
    }


    public String toString() {
        return "Book: " + title + " written by:" + author;
    }
}


class Member implements Issueable {
    private String name;
    private int memberId;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public void issueBook(Book book) throws BookNotAvailableException {
        if (!book.isAvailable()) {
            throw new BookNotAvailableException("Book is not available: " + book.getTitle());
        } else {
            book.setAvailable(false);
            System.out.println(name + " issued " + book.getTitle());
        }
    }


    public String toString() {
        return "Member: " + name + " (ID: " + memberId + ")";
    }
}


public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Java Programming", "James", true);
        Book book2 = new Book("Data Structures", "Reema", false);

        Member member1 = new Member("Alisha", 101);

        try {
            member1.issueBook(book1); 
            member1.issueBook(book2);
        } catch (BookNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }
}