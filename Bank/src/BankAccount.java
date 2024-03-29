/*
Written by Dexter Jones

Pseudocode:

Fields:

string firstName
string lastName
int accountID
double balance
Methods:

constructor():  initialize balance to zero
deposit() - will accept a single value double parameter; the parameter value is added to the existing balance
withdrawal() - accepts a single value double dollar amount; the parameter value is subtracted from the existing balance
Setters and getters for firstName, lastName, and accountID
getBalance() getter to return the balance
accountSummary() - prints all account information
 */
public class BankAccount {
    protected String firstName;
    protected String lastName;
    protected int accountID;
    protected int idCounter;
    protected double balance;

    public BankAccount() { // default constructor
        this.firstName = "";
        this.lastName = "";
        this.accountID = ++idCounter;
        this.balance = 0;
    }

    public BankAccount(String firstName, String lastName) { // parameterized constructor
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountID = ++idCounter;
        this.balance = 0;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public int getAccountID() {
        return accountID;
    }
    public double getBalance() {
        return balance;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }
    public void deposit(double deposit) { // adds deposit to current balance
        balance += deposit;
    }

    public void withdrawal(double withdrawal) { // withdrawals money from balance
        balance -= withdrawal;
    }

    public String accountSummary() { // prints all account information formatted
        return String.format("First Name: '%s'\nLast Name: '%s'\nAccount ID: %d\nBalance: %.2f", firstName, lastName, accountID, balance);
    }

}
