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
    private String firstName;
    private String lastName;
    private int accountID;
    private double balance;

    public BankAccount() { // default constructor
        this.firstName = "";
        this.lastName = "";
        this.accountID = 0;
        this.balance = 0;
    }

    public BankAccount(String firstName, String lastName, int accountID) { // parameterized constructor
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountID = accountID;
        this.balance = 0;
    }

    public String getfirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAccountID() {
        return accountID;
    }
    public double balance() {
        return balance();
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
        balance = deposit++;
    }

    public void withdrawal(double withdrawal) { // withdrawals money from balance
        balance = withdrawal--;
    }

    public String accountSummary() { // prints all account information formatted
        return String.format("First Name: '%s'\nLast Name: '%s'\nAccount ID: %d\nBalance: %.2f", firstName, lastName, accountID, balance);
    }
}
