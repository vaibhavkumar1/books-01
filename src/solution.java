import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0) {
            System.out.println("N/A");
        }
        Book[] books = new Book[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                String c = scanner.nextLine().trim();
            }
            String bname = scanner.nextLine().trim();
            String aname = scanner.nextLine().trim();
            String isbn = scanner.nextLine().trim();
            books[i] = new Book(bname, aname, isbn);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(books[i].toString());
        }
    }

}

class Book {
    private String bookname;
    private String authorname;
    private String isbn;

    public Book(String bookname, String authorname, String isbn) {
        this.bookname = bookname;
        this.authorname = authorname;
        this.isbn = isbn;
    }

    public String getauthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getisbn() {
        return isbn;
    }

    public void setisbn(String isbn) {
        this.isbn = isbn;
    }

    public String toString() {
        return "-----------------------\n" +
                "Book Name:    " + bookname +
                "\nAuthor Name:  " + authorname +
                "\nISBN:         " + isbn +
                "\n----------------------";
    }
}


