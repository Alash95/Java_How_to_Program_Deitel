package ch04.ex04_31;

import java.util.Scanner;

public class Palindromes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a five digit number: ");
        int num = input.nextInt();

        if (num < 10000 || num >= 100000) {
            System.err.println("\n Invalid number. Try again\n");
        }
        else {
            int remainder, reversedNum = 0;
            int originalNum = num;
            while (num != 0) {
                remainder = num % 10;
                reversedNum = reversedNum * 10 + remainder;
                num /= 10;
            }
            if (reversedNum == originalNum) {
                System.out.println(originalNum + " is a palindrome");
            } else {
                System.out.println(originalNum + " is not a palindrome");
            }
        }
    }
}
