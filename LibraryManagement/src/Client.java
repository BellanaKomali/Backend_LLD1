public class Client {
    public static void main(String[] args) {
        User memeber = new Member();
        LibraryManagementSystem obj = new LibraryManagementSystem();
        obj.registerUser(memeber);
        System.out.println(obj.getRegisteredUsers());
    }
}
