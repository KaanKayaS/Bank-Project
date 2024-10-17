import com.ShortTerm.java.ShortTerm;
import com.bank.java.Bank;

public class Main {
    public static void main(String[] args) {
        // Banka oluştur
        Bank bank = new Bank();

        // Kısa vadeli hesap oluştur
        ShortTerm shortTermAccount = Create_S_ID_balance(1, 2000);

        // Hesabı bankaya ekle
        bank.addAccount(shortTermAccount);

        // Diğer işlemler...
    }

    public static ShortTerm Create_S_ID_balance(int accountID, double initialBalance) {
        ShortTerm shortTermAccount = new ShortTerm(accountID, initialBalance);
        return shortTermAccount;
    }
}