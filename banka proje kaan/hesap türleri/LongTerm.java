import java.time.LocalDate;

public class LongTerm extends Account {
    private static final double ANNUAL_INTEREST_RATE = 0.24;
    private static final double MINIMUM_BALANCE = 1500;

    public LongTerm(int accountNumber, double balance) {
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