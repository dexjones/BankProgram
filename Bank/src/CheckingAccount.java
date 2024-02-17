/*
Written by Dexter Jones

Implement a CheckingAccount class that inherits from the BankAccount class, that:

Has an interest rate attribute
Allows overdraft withdrawals and charges a $30 fee
Methods:

processWithdrawal() - will display a negative balance that includes a $30 overdraft fee and denotes that a fee has been accessed
displayAccount() - should display all superclass attributes and provides an additional interest rate
Ensure that your program has the two required classes and a test class.
 */
public class CheckingAccount extends BankAccount {
    private double interestRate;

    public void processWithdrawal() { //display negative balance & includes overdraft fee

    }

    public String displayAccount() {
        return String.format("First Name: '%s'\nLast Name: '%s'\nAccount ID: %d\nBalance: %.2f\nInterest Rate: %.2f", firstName, lastName, accountID, balance, interestRate);
    }
}
