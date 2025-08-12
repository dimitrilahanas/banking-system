public class Account {

    private String accountNumber;
    private String firstName;
    private String lastName;
    private double balance;

    public Account(String accountNumber, String firstName, String lastName, double balance) {
        this.accountNumber = accountNumber;
        this.firstName     = firstName;
        this.lastName      = lastName;
        this.balance       = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid Amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid Amount.");
        }
    }

    public void setBalance(double amount) {
        if (amount > 0 ) {
            balance = amount;
        } else {
            System.out.println("Invalid Amount.");
        }
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber +
             "\nAccount Holder: " + firstName + " " + lastName +
             "\nBalance: $" + String.format("%.2f", balance);

    }

}