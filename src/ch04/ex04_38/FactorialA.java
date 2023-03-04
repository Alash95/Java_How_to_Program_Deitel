package ch04.ex04_38;

import java.util.Scanner;

public class FactorialA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        int aux = number;

        int factorial = 1;
        while (number > 1) {
            factorial *= number;
            number--;
        }
        System.out.printf("%n%d factorial = %d%n ", aux, factorial);

    }
}
