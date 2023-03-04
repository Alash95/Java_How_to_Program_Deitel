package ch04.ex04_32;

import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {


//    public static void isDecimal() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        int binary = scan.nextInt();

        int number = binary;
        int decimal = 0 , counter = 0;

        while (number > 0){
            int rem = number % 10;

            decimal += rem * Math.pow(2, counter);
            number /= 10;

            counter++;
        }
        System.out.printf("%n%d in binary is %d in decimal%n ", binary, decimal);
    }
}
