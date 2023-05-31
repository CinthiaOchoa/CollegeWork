public class Saving extends BankAccount {

    public Saving(int accountID, String customerName, double balance) {
        super(accountID, customerName, balance);
    }

    @Override
    public void withdraw(double amount, String atm_transaction) {
        if (getBalance() - amount < 0) {
            System.out.println("Insufficient funds.");
            return;
        }

        setBalance(getBalance() - amount);
        getTransactions().add(new Transaction('W', amount, getBalance(), "Withdrawal"));
    }
}

