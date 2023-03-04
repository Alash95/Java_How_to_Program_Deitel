package ch04.ex04_18;

import java.util.Scanner;

public class CreditLimitCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int accountNumber = 0;
        int balance = 0;
        int charges = 0;
        int credit = 0;
        int creditLimit = 0;
        int newBalance = 0;

        System.out.println("Enter the beginning balance or 0 to quit: ");
        int beginningBalance = input.nextInt();
        System.out.println("Enter the charges or 0 to quit: ");
        int totalCharges = input.nextInt();
        System.out.println("Enter the credits or 0 to quit: ");
        int totalCredit = input.nextInt();
        System.out.println("Enter the credit limit or 0 to quit: ");
        int totalCreditLimit = input.nextInt();

        while (beginningBalance > 0 && totalCharges > 0 && totalCredit > 0 &&
        totalCreditLimit > 0){
            balance += beginningBalance;
            charges += totalCharges;
            credit += totalCredit;
            creditLimit += totalCreditLimit;
            accountNumber += 1;

            newBalance = balance + charges - credit;

            System.out.println("Enter the beginning balance or 0 to quit: ");
            beginningBalance = input.nextInt();
            System.out.println("Enter the charges or 0 to quit: ");
            totalCharges = input.nextInt();
            System.out.println("Enter the credits or 0 to quit: ");
            totalCredit = input.nextInt();
            System.out.println("Enter the credit limit or 0 to quit: ");
            totalCreditLimit = input.nextInt();
        }
        if (newBalance > creditLimit) {
            System.out.println("Credit Limit Exceeded");
        }
        else {
            System.out.printf("New balance of %d account numbers is: %d", accountNumber, newBalance);
        }
    }
}

/**
 * The program should input all these facts as integers, calculate the new balance
 * (= beginning balance + charges – credits), display the new balance and determine
 * whether the new balance exceeds the customer’s credit limit. For those customers
 * whose credit limit is exceeded, the program should display the message "Credit limit
 * exceeded".
 */
/**
 * Initialize account number to zero
 * Initialize balance to zero
 * initialize charges to zero
 * initialize credits to zero
 * initialize credit limit to zero
 * Prompt the user to enter the beginning balance, charges and credits
 * Input the beginning balance, charges and credits or (possibly the sentinel)
 * While the user has not yet entered the sentinel
 * Calculate new balance by adding charges to balance minus credits
 * Prompt the user to enter the beginning balance, charges and credits
 * Input the beginning balance, charges and credits or (possibly the sentinel)
 * if the new balance is lesser than credit limit
 * print new balance
 * Else
 * print "Credit Limit exceeded"
 */