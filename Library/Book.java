
package Library;

public class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages){
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    public Book(String author){
        this.author = author;
        this.title = null;
        this.pages = 0;
    }

    public Book(Book other){
        this.title = other.title;
        this.author = other.author;
        this.pages = other.pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book: " + this.title + " Author: " + this.title + " Pages: " + this.pages;
    }
}
