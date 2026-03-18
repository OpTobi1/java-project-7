package Library;

public class Library {
    private String name;
    private Book[] books;
    private int count;

    public Library(String name, int cap){
        this.name = name;
        this.books = new Book[cap];
        this.count = 0;
    }

    public Library(Library other) {
        this.name = other.name;
        this.count = other.count;
        this.books = new Book[other.books.length];
        for (int i = 0; i < other.count; i++) {
            this.books[i] = new Book(other.books[i]); // מניח שיש בנאי מעתיק ב-Book
        }
    }

    public void addBook(Book b){
        if(count < books.length){
            books[count] = b;
            count++;
        }
        else{
            System.out.println("Library is full");
        }
    }

    public void printAllBooks(){
        for(int i = 0; i < count; i++){
            System.out.println(books[i]);
        }
    }

    public void printLongestBook(){
        if (count == 0) return;

        Book longest = books[0];
        for(int i = 1; i < count; i++){
            if(books[i].getPages() > longest.getPages()){
                longest = books[i];
            }
        }
        System.out.println("longest book: " + longest);
    }

    public void sortBooksByAuthor(){
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (books[j].getAuthor().compareTo(books[j + 1].getAuthor()) > 0) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String str = "Library: " + name + "\n";
        str += "Number of books: " + count + "\n";
        str += "Books:\n";
        for (int i = 0; i < count; i++) {
            str += "Book: '" + books[i].getTitle() + "', Author: '" + books[i].getAuthor() +
                    "', Pages: " + books[i].getPages() + "\n";
        }
        return str;
    }
}
