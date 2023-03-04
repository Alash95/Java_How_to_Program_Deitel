package ch04.ex04_39;

import java.util.Scanner;

public class EnforcingPrivacyWithCryptography {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a four digit number: ");
        int number = input.nextInt();

        input.close();

        System.out.printf("%n%d encrypted is %d%n", number, encrypt(number));
        System.out.printf("%n%d decrypted is %d%n", encrypt(number), decrypt(encrypt(number)));

    }

    public static int encrypt(int number) {
        int encryptedNumber = 0;

        int div = 1000;
        while (number > 0) {
            int digit = number / div;
//            System.out.println(digit);


            number = number % div;

            div /= 10;

            digit = (digit + 7) % 10;

            encryptedNumber = encryptedNumber * 10 + digit;


        }
        return swappingDigits(encryptedNumber);
    }
    /*
     * swap the first digit with the third, and swap the second digit with the
     * fourth.
     */
    private static int swappingDigits(int number) {
        int digit1 = number / 1000;
        number %= 1000;
        int digit2 = number / 100;
        number %= 100;
        int digit3 = number / 10;
        number %= 10;
        int digit4 = number;

        return digit3 * 1000 + digit4 * 100 + digit1 * 10 + digit2;
    }

    public static int decrypt (int number) {
        int decryptedNumber = 0;

        int div = 1000;
        while (number > 0) {
            int digit = number / div;

            number = number % div;

            div /= 10;

            digit = ((digit + 10) - 7) % 10;
            System.out.println(digit);

            decryptedNumber = decryptedNumber * 10 + digit;


        }
        return swappingDigits(decryptedNumber);
    }


}
