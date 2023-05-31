import java.text.DecimalFormat;
import java.util.Scanner;

public class InterestRateLab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#####");

        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        String input = scanner.nextLine();
        String[] inputArr = input.split(" for ");
        double balance = Double.parseDouble(inputArr[0].trim());
        double interestRate = Double.parseDouble(inputArr[1].trim());

        double interest = balance * (interestRate / 1200);
        System.out.println("The interest is: " + df.format(interest));
    }
}