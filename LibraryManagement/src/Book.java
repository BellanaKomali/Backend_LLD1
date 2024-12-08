
public abstract class Book implements Lendable {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    Book() {
        isAvailable = true;
    }
    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    Book(Book other) {
        this.isbn = other.isbn;
        this.author = other.author;
        this.title = other.title;
        this.isAvailable = true;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }


    public boolean lend(User user) {
        if(isAvailable && user.canBorrowBooks()) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    @Override
    public void returnBook(User user) {
        isAvailable = true;
    }

    @Override
    public boolean isAvailble() {
        return isAvailable;
    }
   abstract void displayBookDetails();
}