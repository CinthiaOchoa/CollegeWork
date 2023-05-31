import java.util.Scanner;

public class IntegerScan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positives = 0;
        int negatives = 0;
        double total = 0;
        int input = 1;
        int count = 0;
        while (input != 0) {
            System.out.println("Enter an integer, the inputs need if it is 0:");
            input = scanner.nextInt();
            if (input > 0) {
                positives++;
            } else if (input < 0) {
                negatives++;
            }
            if(input != 0) {
                total += input;
                count++;
            }
        }
        double average = total / count;
        System.out.println("The number of positives is :" + positives);
        System.out.println("The number of negatives is :" + negatives);
        System.out.println("The total is :" + total);
        System.out.println("The average is :" + average);
    }
}

