import java.util.Date;

public class Transaction {

    private Date transactionDate;
    private char transactionType;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char transactionType, double amount, double balance, String description) {
        this.transactionDate = new Date();
        this.transactionType = transactionType;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public char getTransactionType() {
        return transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getDescription() {
        return description;
    }
}
