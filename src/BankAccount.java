import java.util.ArrayList;
import java.util.Objects;

public class BankAccount {
    private double balance;
    private String ownerName;

    public ArrayList<String> transactions = new ArrayList<>();
    public BankAccount() {
        balance = 0.0;
        ownerName = null;
    }
    public BankAccount(double balance, String ownerName) {
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Total amount after deposited is " + balance);
            transactions.add("Deposited "+ balance);
        }
    }

    public void withdraw(double amount) {
        if (balance < 0 || amount > balance) {
            balance -= amount;
            System.out.println("Total amount after withdrawl is " + balance);
            transactions.add("withdrawl " + balance);
        }
    }

    public void printTransactionHistory() {
        for(String s : transactions) {
            System.out.println(s);
        }
    }
    public void setBalance(double balance) {
        if(balance < 0) {
            throw new RuntimeException("Balance should not be negative");
        }
        else {
            this.balance = balance;
        }
    }
    public double getBalance() {
        return this.balance;
    }
    public void setOwnerName(String ownerName) {
        if(Objects.equals(ownerName, "")) {
            throw new RuntimeException("name should not be null");
        }
        else {
            this.ownerName = ownerName;
        }
    }
    public String getOwnerName(String ownerName) {
        return this.ownerName;
    }
}
