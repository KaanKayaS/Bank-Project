public class Current extends Account {

    public Current(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("Insufficient funds in account " + getID());
        } else {
            super.withdraw(amount);
        }
    }

    @Override
    protected double getDailyRate() {
        return 0; // Faizsiz hesap, günlük faiz oranı sıfırdır
    }
}