public class Book {
    private String title;
    private Author author;
    private int publishingYear;

    public Book(String title,Author author,int publishingYear) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
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
