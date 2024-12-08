public class TextBook extends Book {
    private String subject;
    private int edition;

    TextBook(String isbn, String title, String author,String subject, int edition) {
        super(isbn,title,author);
        this.subject = subject;
        this.edition = edition;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void setEdition(int edition) {
        this.edition = edition;
    }

    public String getSubject() {
        return subject;
    }

    public int getEdition() {
        return edition;
    }

    public void displayBookDetails() {
        System.out.println("------TextBook Details-------- ");
        System.out.println("Isbn : " + getIsbn());
        System.out.println("Title : " + getTitle());
        System.out.println("Author : " + getAuthor());
        System.out.println("Subject : " + getSubject());
        System.out.println("Edition : " + getEdition());
    }
}
