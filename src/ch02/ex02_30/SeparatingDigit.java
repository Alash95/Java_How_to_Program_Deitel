/**
 * 2.30      (Separating the Digits in an Integer) Write an application that inputs one number consisting of
 * five digits from the user, separates the number into its individual digits and prints the digits separated
 * from one another by three spaces each. For example, if the user types in the number 42339, the program should print
 *
 * 4  2  3  3  9
 *
 * Assume that the user enters the correct number of digits. What happens when you enter a number with more than
 * five digits? What happens when you enter a number with fewer than five digits? [Hint: It’s possible to do this
 * exercise with the techniques you learned in this chapter. You’ll need to use both division and remainder
 * operations to “pick off ” each digit.]
 */


package ch02.ex02_30;

import java.util.Scanner;

public class SeparatingDigit {

    public static void main(String[] args) {

        int digit, digit1, digit2, digit3, digit4, digit5;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a digit: ");
        digit = input.nextInt();

        digit1 = digit % 10;
        digit /= 10;

        digit2 = digit % 10;
        digit /= 10;

        digit3 = digit % 10;
        digit /= 10;

        digit4 = digit % 10;
        digit /= 10;

        digit5 = digit % 10;

        System.out.printf("%d   %d    %d    %d    %d%n", digit5, digit4, digit3, digit2, digit1);
    }

}
