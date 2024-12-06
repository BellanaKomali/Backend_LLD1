import java.sql.SQLOutput;

public class Member extends User {
    int borrowedBooksCount;
    int MAX_BORROW_LIMIT = 5;

    public Member() {
        super();
        this.borrowedBooksCount=0;
    }
    public Member(String name,String contactInfo){
        super(name,contactInfo);
        this.borrowedBooksCount=0;
    }
    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard");
        System.out.println("Books Borrowed : " + this.borrowedBooksCount);
    }
    public boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }
}
