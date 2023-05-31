import java.util.ArrayList;
import java.util.Date;

public class BankAccount {
    private int accountID;
    private String customerName;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    public BankAccount() {
        this(0, "", 0);
    }

    public BankAccount(int accountID, String customerName, double balance) {
        this.accountID = accountID;
        this.customerName = customerName;
        this.balance = balance;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate/100;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount, String description) {
        if (balance - amount < 0) {
            System.out.println("Insufficient funds.");
            return;
        }

        balance -= amount;
        transactions.add(new Transaction('W', amount, balance, description));
    }

    public void deposit(double amount, String description) {
        balance += amount;
        transactions.add(new Transaction('D', amount, balance, description));
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
}
