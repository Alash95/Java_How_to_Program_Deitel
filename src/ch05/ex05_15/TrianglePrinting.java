package ch05.ex05_15;

import java.util.Scanner;

public class TrianglePrinting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a number");
        int number = scan.nextInt();

        secondTriangle(number);
        firstTriangle(number);
        thirdTriangle(number);
        fourthTriangle(number);
    }

    public static void firstTriangle(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void secondTriangle(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = i; j < number; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void thirdTriangle(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= number; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void fourthTriangle(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

