import java.text.NumberFormat;
import java.util.Scanner;

public class BankAccountApp {
    private static final Scanner scanner = new Scanner(System.in);
    private static final NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) {
        BankAccount account = createAccount();

        int choice;
        do {
            displayMenu();
            choice = getUserChoice();

            switch (choice) {
                case 1:
                    System.out.println("Account Information:");
                    displayAccountInfo(account);
                    break;
                case 2:
                    deposit(account);
                    break;
                case 3:
                    withdraw(account);
                    break;
                case 4:
                    displayTransactions(account);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        scanner.close();
    }

    private static BankAccount createAccount() {
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter account ID: ");
        int accountID = scanner.nextInt();

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        System.out.println();
        System.out.println("Account created successfully.");

        return new Saving(accountID, customerName, initialBalance);
    }

    private static void displayMenu() {
        System.out.println("Select an option:");
        System.out.println("1. Display account information");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Display transactions");
        System.out.println("5. Exit");
    }

    private static int getUserChoice() {
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    private static void displayAccountInfo(BankAccount account) {
        System.out.println("Customer name: " + account.getCustomerName());
        System.out.println("Account ID: " + account.getAccountID());
        System.out.println("Balance: " + currencyFormatter.format(account.getBalance()));
        System.out.println("Interest rate: " + account.getAnnualInterestRate() + "%");
        System.out.println("Monthly interest: " + currencyFormatter.format(account.getMonthlyInterest()));
    }

    private static void deposit(BankAccount account) {
        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();

        account.deposit(amount, "Bank transaction");

        System.out.println("Deposit successful.");
    }

    private static void withdraw(BankAccount account) {
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();

        account.withdraw(amount, "ATM transaction");

        System.out.println("Withdrawal successful.");
    }

    private static void displayTransactions(BankAccount account) {
        System.out.println("Transaction history:");
        System.out.println("Type\tAmount\tBalance\tDescription");

        for (Transaction transaction : account.getTransactions()) {
            String type = transaction.getTransactionType() == 'D' ? "Deposit" : "Withdrawal";
            String amount = currencyFormatter.format(transaction.getAmount());
            String balance = currencyFormatter.format(transaction.getBalance());
            String description = transaction.getDescription();

            System.out.printf("%s\t%s\t%s\t%s\n", type, amount, balance, description);
        }
    }
}