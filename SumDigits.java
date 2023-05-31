import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a positive number: ");
        int value = scanner.nextInt();
        int outcome = 0;

        while (value > 0) {
            int digit = value % 10;
            outcome += digit;
            value /= 10;
        }

        System.out.println("Addition of digits: " + outcome);
    }
}

