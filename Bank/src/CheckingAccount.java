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

    public CheckingAccount() {
        super();
        this.interestRate = 0;
    }
    public CheckingAccount(String firstName, String lastName, double interestRate) {
        super(firstName, lastName);
        this.interestRate = interestRate;
    }

    public void processWithdrawal(double amount) { //display negative balance & includes overdraft fee
        withdrawal(amount);
        if (balance < 0) {
            balance -= 30; // overdraft fee of 30$
            System.out.printf("Account overdrawn. A 30$ overdraft fee has been assessed.\nYour new balance is: $%.2f", balance);
        }
    }

    public String displayAccount() {
        return String.format("%s\nInterest rate: %.2f%%",super.accountSummary(),interestRate);
    }
}
