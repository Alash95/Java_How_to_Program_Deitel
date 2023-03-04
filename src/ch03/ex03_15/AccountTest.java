package ch03.ex03_15;

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {


        Account account1 = new Account("John Green", 50.00);
        Account account2 = new Account("James Blue", -7.53);

        displayAccount(account1);
        displayAccount(account2);

        displayDeposit(account1);
        displayDeposit(account2);

        displayWithdrawal(account1);
        displayWithdrawal(account2);

        displayAccount(account1);
        displayAccount(account2);
    }

    public static void displayAccount(Account accountToDisplay) {
        System.out.printf("%s balance is $%.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
    }

    public static void displayDeposit(Account depositToAdd) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter deposit amount for %s%n", depositToAdd.getName());
        double depositAmount = input.nextDouble();

        System.out.printf("%nadding %.2f to %s balance%n%n", depositAmount, depositToAdd.getName());
        depositToAdd.deposit(depositAmount);
    }

    public static void displayWithdrawal(Account amountToWithdraw) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter withdrawal amount for %s%n", amountToWithdraw.getName());
        double withdrawalAmount = input.nextDouble();

        System.out.printf("%ndeducting %.2f from %s balance%n%n", withdrawalAmount, amountToWithdraw.getName());
        amountToWithdraw.withdraw(withdrawalAmount);
    }


}
