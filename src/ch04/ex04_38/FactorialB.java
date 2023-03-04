package ch04.ex04_38;

import java.util.Scanner;

public class FactorialB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTerms;
        System.out.print("Enter the number of terms: ");
        numberOfTerms = scanner.nextInt();

        double result = 0;
        int termsCounter = 0;

        while (termsCounter < numberOfTerms) {
            int auxCounter = termsCounter;
            int factorial = 1;

            while (auxCounter > 1) {
                factorial *= auxCounter;
                auxCounter--;
            }
            result += 1.0 / factorial;
            termsCounter++;
        }
        System.out.printf("e = %f%n", result);
    }
}
