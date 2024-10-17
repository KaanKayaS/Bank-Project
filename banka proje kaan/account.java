import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Account extends Main {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.openingDate = LocalDate.of(2023, 5, 5); // Başlangıç tarihi: 05.05.2023
    }
     public int getID() {
        return accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void withdraw(double amount);

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited into account " + accountNumber);
    }
    
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds in account " + accountNumber);
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn from account " + accountNumber);
        }
    }
    public void getBalance() {
        System.out.println("Account " + accountNumber + " balance: " + balance);
    }
}