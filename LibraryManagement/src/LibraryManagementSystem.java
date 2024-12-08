import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    private List<Book> bookInventory;
    private List<User> registeredUsers;

    public LibraryManagementSystem() {
        bookInventory = new ArrayList<>(); // Initialize the book inventory
        registeredUsers = new ArrayList<>(); // Initialize the registered users list
    }
    public void addBook(Book book) {
        bookInventory.add(book);
    }
    public void registerUser(User user) {
        registeredUsers.add(user);
    }

    public List<User> getRegisteredUsers() {
        return registeredUsers;
    }

}
