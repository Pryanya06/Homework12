public class Book {
    private String title;
    private Author author;
    private int publishingYear;

    public Book(String title) {
        this.title = title;
    }

    public Book(Author author) {
        this.author = author;
    }

    public Book(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public Book(String родственныеДуши, Author henry, int i) {
    }

    public String getTitle() {
        return title;
    }
    public Author getAuthor() {
        return author;
    }
    public int getPublishingYear() {
        return publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
