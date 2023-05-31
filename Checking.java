public class Checking extends BankAccount {
    private static final double OVERDRAFT_LIMIT = -200.00;

    public Checking() {
        super();
    }

    public Checking(int accountID, String customerName, double balance) {
        super(accountID, customerName, balance);
    }

    @Override
    public void withdraw(double amount, String atm_transaction) {
        if (getBalance() - amount < OVERDRAFT_LIMIT) {
            System.out.println("Overdraft limit exceeded.");
            return;
        }

        setBalance(getBalance() - amount);
        getTransactions().add(new Transaction('W', amount, getBalance(), "Withdrawal"));
    }
}
