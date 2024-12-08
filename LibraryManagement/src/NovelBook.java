public class NovelBook extends Book {
    private String genre;
    NovelBook(String isbn, String title, String author, String genre) {
        super(isbn,title,author);
        this.genre = genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    public String getGenre() {
        return genre;
    }

    public void displayBookDetails() {
        System.out.println("------TextBook Details-------- ");
        System.out.println("Isbn : " + getIsbn());
        System.out.println("Title : " + getTitle());
        System.out.println("Author : " + getAuthor());
        System.out.println("Subject : " + getGenre());
    }
}
