/**
 * The PrimeNumbersInRange class allows the user to input a range of numbers and prints out all the
 * prime numbers within that range.
 */
import java.util.Scanner;

/**
 * The PrimeNumbersInRange class takes a start and end value from the user and prints all prime numbers
 * within that range.
 */
public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter end of the range: ");
        int end = scanner.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + ":");
        printPrimeNumbersInRange(start, end);
    }

   // The `printPrimeNumbersInRange` method takes two parameters, `start` and `end`, which represent
   // the range of numbers. It then iterates through each number in the range and checks if it is a
   // prime number using the `isPrime` method. If a number is prime, it is printed out using
   // `System.out.print`.
    static void printPrimeNumbersInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // The `isPrime` method is a helper method that checks whether a given number is prime or not.
    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        // The code snippet `for (int i = 2; i <= Math.sqrt(number); i++) { if (number % i == 0) {
        // return false; } }` is checking whether a given number is prime or not.
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}