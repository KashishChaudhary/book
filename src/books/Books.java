package books;

import java.util.Scanner;
public class Books {
    private String bookName;
    private String authorName;
    private long ISBN;

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public Books(String bookName, String authorName, long ISBN) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return
                ("Book Name:" + bookName + "\nAuthor Name:" + authorName + "\nISBN;" + ISBN);
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println("enter the no of books");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String bookName[] = new String[n];
        String authorName[] = new String[n];
        long ISBN[] = new long[n];
        scanner.nextLine();
        if (n == 0) {
            System.out.println("N/A");
        } else {
            for (int i = 0; i < n; i++) {
                bookName[i] = scanner.nextLine();
                authorName[i] = scanner.nextLine();
                ISBN[i] = scanner.nextLong();
                scanner.nextLine();
            }
        }
        for (int j = 0; j < n; j++) {
            System.out.println("--------------------------------");
            System.out.println("Book Name:" + bookName[j] + "\nAuthor name:" + authorName[j] + "\nISBN:" + ISBN[j]);
            System.out.println("--------------------------------");
        }
    }

}

