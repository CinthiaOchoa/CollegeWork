import java.util.Scanner;

public class BuzzFeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FunctionProb.fizzbuzz(6);
        FunctionProb.fizzbuzz(5);
        FunctionProb.fizzbuzz(8);

        int val = scanner.nextInt();
        while (val != 0) {
            String output = buzzFeed(val);
            System.out.println(output);
            val = scanner.nextInt();
        }
    }

    public static String buzzFeed(int num) {
        if (num % 2 == 0) {
            return "Buzz";
        } else {
            return "Feed";
        }
    }
}


