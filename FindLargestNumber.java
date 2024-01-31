/**
 * The FindLargestNumber class takes three numbers as input and finds the largest among them.
 */
import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // This code is prompting the user to enter the first number and then reading the input from the
       // user using the `nextDouble()` method of the `Scanner` class. The entered number is then
       // stored in the variable `num1` of type `double`.
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

       // This code is prompting the user to enter the second number and then reading the input from
       // the user using the `nextDouble()` method of the `Scanner` class. The entered number is then
       // stored in the variable `num2` of type `double`.
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        // The code `System.out.println("Enter the third number:");` is printing a message to the
        // console, asking the user to enter the third number.
        System.out.println("Enter the third number:");
        double num3 = scanner.nextDouble();

        double largest = findLargest(num1, num2, num3);

        System.out.println("The largest number is: " + largest);
    }

    // Function to find the largest among three numbers
   /**
    * The function finds the largest number among three given numbers.
    *
    * @param num1 The first number to compare.
    * @param num2 The second number to compare.
    * @param num3 The parameter num3 is a double data type. It represents the third number that we want
    * to compare and find the largest among the three numbers.
    * @return The largest of the three numbers (num1, num2, num3) is being returned.
    */
     public static double findLargest(double num1, double num2, double num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
