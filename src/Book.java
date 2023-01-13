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
        return authorName.toString();
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return bookName + " "+ year + " " + authorName;
    }

    public boolean equals(Object object) {
        if (this.getClass() != object.getClass()) {
            return false;
        }
        Book book = (Book) object;
        return bookName.equals(book.bookName) && year == book.year && authorName.equals(book.authorName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(authorName, bookName, year);
    }
}
