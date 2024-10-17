import java.time.LocalDate;

public class ShortTerm extends Account {
    private static final double ANNUAL_INTEREST_RATE = 0.17;
    private static final double MINIMUM_BALANCE = 1000;

    public ShortTerm(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < MINIMUM_BALANCE) {
            System.out.println("Minimum balance requirement not met in account " + getID());
        } else {
            super.withdraw(amount);
        }
    }

    @Override
    protected double getDailyRate() {
        return ANNUAL_INTEREST_RATE / 365;
    }
}