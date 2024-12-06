public class Librarian extends User {
    private final String employeeNumber;

    Librarian(String name, String contactInfo,String employeeNumber) {
        super(name,contactInfo);
        this.employeeNumber = employeeNumber;
    }
    public void addNewBook(Book book) {
        //empty block
    }

    public void removeBook(Book book) {
        //empty block
    }
    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard");
        System.out.println("Employee Number : " + this.employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return false;
    }
}
