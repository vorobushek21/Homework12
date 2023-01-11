public class Book {
    private String bookName;
    private int year;
    private Author authorName;

    public Book(String bookName, int year, Author authorName) {
        this.bookName = bookName;
        this.year = year;
        this.authorName = authorName;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getYear() {
        return this.year;
    }

    public String getAuthorName() {
        return authorName.getFirstName() + " " + authorName.getLastName();
    }

    public void setYear(int year) {
        this.year = year;
    }
}
