package ch03.ex03_11;

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {


        Account account1 = new Account("John Green", 50.00);
        Account account2 = new Account("James Blue", -7.53);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

        System.out.print("Enter withdrawal amount for account1: ");
        double withdrawalAmount = input.nextDouble();
        System.out.printf("%nwithdrawing %.2f from account1 balance%n%n", withdrawalAmount);
        account1.withdraw(withdrawalAmount);

        System.out.print("Enter withdrawal amount for account2: ");
        withdrawalAmount = input.nextDouble();
        System.out.printf("%nwithdrawing %.2f from account2 balance%n%n", withdrawalAmount);
        account2.withdraw(withdrawalAmount);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());






//        System.out.printf("Initial name is: %s%n%n", account1.getName());
//
//        System.out.println("Please enter the name:");
//        String myName = input.nextLine();
//        account1.setName(myName);
//        System.out.println();
//
//        System.out.printf("Name in object account1 is: %n%s%n", account1.getName());
    }
}
