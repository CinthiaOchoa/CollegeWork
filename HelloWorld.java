public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("test " + isPalindrome("mom"));
        System.out.println(isPalindrome("noon"));
        System.out.println(isPalindrome("monday"));
        displayPalindrome("mon");
    }

    public static boolean isPalindrome(String word) {
        String reversedWord = "";
        for (int index = word.length() -1; index >= 0; index--) {
            reversedWord += word.charAt(index);
        }
        return reversedWord.equals(word);
    }

    public static void displayPalindrome(String word) {
        boolean test = isPalindrome(word);
        System.out.println("print the result " + test);
    }

}
