import java.util.ArrayList;
import java.util.Scanner;

public class AccountManager {
    
    Scanner input = new Scanner(System.in);
    Account accountCommands = new Account(null, null, null, 0);

    private ArrayList<Account> accounts = new ArrayList<>();

    public String accountNumberGenerator() {
        int max = 999999;
        int min = 100000;
        int range = max - min;
        
        int generated = (int)(Math.random() * range) + min;
        String token = Integer.toString(generated);

        return token;
    }

    public void createAccount() {
        String accountNumber = accountNumberGenerator();

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        double balance = 0;

        Account account = new Account(accountNumber, firstName, lastName, balance);
        accounts.add(account);

        System.out.print("Account Created Successfully." +
             "\nAccount Number: " + accountNumber +
             "\nAccount Name: " + firstName + " " + lastName);

        input.close();
    }

}