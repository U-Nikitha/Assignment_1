/**
 * The FibonacciSeries class takes user input for the number of terms in the Fibonacci series and
 * prints the series.
 */
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci Series:");
        printFibonacciSeries(n);
    }

    /**
     * The function prints the Fibonacci series up to a given number of terms.
     *
     * @param n The parameter "n" represents the number of terms in the Fibonacci series that you want
     * to print.
     */
    static void printFibonacciSeries(int n) {
        int firstTerm = 0, secondTerm = 1;

        // The code block inside the for loop is responsible for generating and printing the Fibonacci
        // series.
        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}