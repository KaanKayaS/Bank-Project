import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;


public class bank extends Main {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

     public LocalDate getDate() {
        return LocalDate.now();
    }

    public void deposit(int accountID, double amount) {
    for (Account account : accounts) {
        if (account.getID() == accountID) {
            account.deposit(amount);
            System.out.println("Deposit successful. Account ID: " + accountID + ", Amount: " + amount);
            return;
        }
    }
    System.out.println("Account not found. Account ID: " + accountID);
}
public void withdraw(int accountID, double amount) {
    for (Account account : accounts) {
        if (account.getID() == accountID) {
            if (account.getBalance() >= amount) {
                account.withdraw(amount);
                System.out.println("Withdrawal successful. Account ID: " + accountID + ", Amount: " + amount);
            } else {
                System.out.println("Insufficient funds. Account ID: " + accountID);
            }
            return;
        }
    }
    System.out.println("Account not found. Account ID: " + accountID);
}
}