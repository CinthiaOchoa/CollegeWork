/**
 * This program computes and displays the series
 * m(i) = 1 + 1/2 + 1/3 + ... + 1/i using a recursive method.
 * The value of m(i) is calculated for i = 1, 2, ..., 10.
 *
 * @author Cinthia Mariana Ochoa Torre
 * @version 1.0
 * @since 21 May 2023
 */
public class SumSeries {
    /**
     * computeSeries: This method recursively computes the value of the series m(i).
     *
     * @param i The value of i for which to compute the series.
     * @return The value of the series m(i).
     */
    public static double computeSeries(int i) {
        if (i == 1) {
            return 1.0; // Base case: m(1) = 1
        } else {
            return 1.0/i + computeSeries(i - 1);
        }
    } // End of method computeSeries
    /**
     * main: The main method is the entry point of the program.
     * It computes and displays the series as a test program in m(i)
     * for i = 1, 2, ..., 10.
     *
     * @param args The command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            double result = computeSeries(i);
            System.out.println("m(" + i + ") = " + result);
        }
    } // End of method main
} // End of class SumSeries
