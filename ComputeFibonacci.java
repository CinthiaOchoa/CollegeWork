/**
 * ComputeFibonacci: A program to compute the Fibonacci series
 * and count the number of times the fib method is called.
 * This program demonstrates the computation of the Fibonacci
 * series using recursion and keeps track of the number of times
 * the fib method is called.
 *
 * @author Cinthia Mariana Ochoa Torre
 * @version 1.0
 * @since 21 May 2023
 */
public class ComputeFibonacci {
    private static int fibCalls = 0;

    /**
     * fib: Calculates the Fibonacci number at a given index.
     * @param index The index of the Fibonacci number to calculate.
     * @return The Fibonacci number at the specified index.
     */
    public static long fib(int index) {
        fibCalls++; // Increment the counter every time the method is called

        if (index == 0) { // Base case
            return 0;
        } else if (index == 1) { // Base case
            return 1;
        } else { // Reduction and recursive calls
            return fib(index - 1) + fib(index - 2);
        }
    } // End of method fib

    /**
     * main: The main method of the program.
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        int index = 10;
        long result = fib(index);
        System.out.println("The Fibonacci number at index " + index + " is: " + result);
        System.out.println("The fib method was called " + fibCalls + " times.");
    } // End of method main
} // End of class ComputeFibonacci
