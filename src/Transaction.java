import java.util.Scanner;

public class Transaction {

    private double transactionAmount;
    private String accountNumberPayed;
    private String accountNumberPaying;

    Scanner sc = new Scanner(System.in);

    public Transaction(double transactionAmount, String accountNumberPayed, String accountNumberPaying) {
        this.transactionAmount = transactionAmount;
        this.accountNumberPayed = accountNumberPayed;
        this.accountNumberPaying = accountNumberPaying; 
    }

    public String accountNumberPayed() {
        System.out.print("Who would you like to pay (Account Number)? ");
        accountNumberPayed = sc.next();
        return accountNumberPayed;
    }

    public String accountNumberPaying() {
        System.out.print("Your Account Number: ");
        accountNumberPaying = sc.next();
        return accountNumberPaying;
    }

    public double transactionAmount() {
        System.out.print("How much would you like to send (Format 00.00)? ");
        transactionAmount = sc.nextDouble();
        return transactionAmount;
    }
}