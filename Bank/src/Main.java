/*
Written by Dexter Jones

Driver class - tests Superclass BankAccount and subclass CheckingAccount for functionality

Pseudocode:

Creates object BankAccount
Adds money to balance
calls Checking account methods


 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String firstName, lastName, s;
        int accountID, choice = 0;
        double balance, deposit, withdraw;
        final double interest = 5;
        CheckingAccount cAccount = new CheckingAccount();

        System.out.println("Bank Account Program\n------------------------------");

        while (choice != 4) {
            System.out.print("Main menu\n\n1: Add Bank Account for customer\n2: Deposit funds into account\n3: Withdrawal funds from account" +
                    "\n4: Exit program");
            System.out.println("\n------------------------------\n");

            while (true) {
                System.out.print("Enter from the options above: ");
                s = scnr.nextLine();
                try {
                    choice = Integer.parseInt(s);
                    break;
                }
                catch (Exception e) {
                    System.out.print(e.getMessage());
                    System.out.print("Please enter a number between 1 and 4");
                }
            }
            switch (choice) {
                case 1: // Add Checking Account
                    System.out.println("\n------------------------------\n");
                    System.out.print("First Name: ");
                    firstName = scnr.nextLine();
                    System.out.print("Last Name: ");
                    lastName = scnr.nextLine();

                    System.out.println("\n------------------------------\n");
                    cAccount = new CheckingAccount(firstName, lastName, interest);
                    System.out.println(cAccount.displayAccount());
                    break;

                case 2: // Deposit funds
                    System.out.println("\n------------------------------\n");
                    System.out.print("Enter deposit amount: ");
                    while (true) {
                        s = scnr.nextLine();
                        try {
                            deposit = Integer.parseInt(s);
                            break;
                        }
                        catch (NumberFormatException e) {
                            System.out.println("Invalid entry. Please enter a dollar amount for deposit");
                        }
                    }
                    cAccount.deposit(deposit);
                    System.out.println("\n------------------------------\n");
                    System.out.println(cAccount.displayAccount());
                    break;

                case 3: // Withdraw
                    System.out.println("\n------------------------------\n");
                    System.out.print("Enter withdraw amount: ");
                    while (true) {
                        s = scnr.nextLine();
                        try {
                            withdraw = Integer.parseInt(s);
                            break;
                        }
                        catch (NumberFormatException e) {
                            System.out.println("Invalid entry. Please enter a dollar amount for deposit");
                        }
                    }
                    cAccount.processWithdrawal(withdraw);
                    System.out.println("\n------------------------------\n");
                    System.out.println(cAccount.displayAccount());
                    break;
                case 4:
                    System.out.println("\n------------------------------\n");
                    System.out.print("Exiting program...");
            }

        }
    }
}