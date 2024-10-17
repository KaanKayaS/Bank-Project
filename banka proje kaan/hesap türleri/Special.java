import java.time.LocalDate;

public class Special extends Account {
    private static final double ANNUAL_INTEREST_RATE = 0.12;

    public Special(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("Insufficient funds in account " + getID());
        } else if (amount < getBalance()) {
            System.out.println("Cannot withdraw the entire balance in account " + getID());
        } else {
            super.withdraw(amount);
        }
    }

    @Override
    protected double getDailyRate() {
        return ANNUAL_INTEREST_RATE / 365;
    }
}