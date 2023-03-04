package ch04.ex04_38;

import java.util.Scanner;

public class FactorialC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an exponent: ");
        int exponent = scanner.nextInt();

        System.out.print("Enter number of terms: ");
        int numberOfTerms = scanner.nextInt();

        double result = 1;
        int counter = 1;

        while (counter <= numberOfTerms) {
            int auxCounter = counter;
            double factorial = 1;

            while (auxCounter > 0) {
                factorial *= auxCounter;
                auxCounter--;
            }
            result += Math.pow(exponent, counter) / factorial;
            counter++;
        }
        System.out.printf("e^%d = %f", exponent, result);
    }
}
