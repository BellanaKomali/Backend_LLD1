public abstract class User {
    private String userId;
    private String name;
    private String contactInfo;
    private static int totalUsers;
    public String getUserId() {
        return this.userId;
    }
    public String getName() {
        return this.name;
    }
    public String getContactInfo() {
        return this.contactInfo;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    User() {
        this.userId = this.generateUniqueId();
    }
    User(String name, String contactInfo) {
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
    }
    User(User other) {
        this.userId = generateUniqueId();
        this.name = other.name;
        this.contactInfo = other.contactInfo;
    }
    public final String generateUniqueId() {
        return "User : " + ++totalUsers;
    }

    public static int getTotalUsers() {
        return totalUsers;
    }
    public abstract void displayDashboard();
    public abstract  boolean canBorrowBooks();


}
