import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word,or number: ");
        String integer = scanner.nextLine();
        boolean isPalindrome = true;
        int length = integer.length();
        for (int i = 0; i < length / 2; i++) {
            if (integer.charAt(i) != integer.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(integer + " is a palindrome");
        } else {
            System.out.println(integer+ " is not a palindrome");
        }
    }
}

