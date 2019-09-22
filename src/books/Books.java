package books;

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

}