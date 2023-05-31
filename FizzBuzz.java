import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int input = scanner.nextInt();
        if (input % 3 == 0 && input % 5 ==0){
            System.out.println("Fizz");
        } else if (input % 5 == 0) {
                System.out.println("Buzz");
        } else if (input % 3 == 0) {
            System.out.println("FizzBuzz");
        } else {
            System.out.println("Not a fizzbuzz");
        }

    }
}
