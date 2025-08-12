import java.util.Scanner;

public class Bank {

    Scanner input = new Scanner(System.in);

    public void modeList() {
        String[] modes = {
            "0 - Save & Exit Program",
            "1 - AccountManager",
            "2 - None"
        };

        System.out.println("\nSupported Commands:");
        for (String mode : modes) {
            System.out.println(mode);
        }
        modeSelector();
    }

    public void commandsListAccountManager() {
        String[] modes = {
            "0 - Go Back",
            "1 - createAccount",
            "2 - None"
        };

        System.out.println("\nSupported Commands:");
        for (String mode : modes) {
            System.out.println(mode);
        }
        commandsAccountManagerSelector();
    }

    public void modeSelector() {
        System.out.print("\nSelect a mode (0, 1, 2...): ");
        int command = input.nextInt();

        switch (command) {
            case 0:
                System.out.print("Exiting system...");
                return;
            case 1:
                commandsListAccountManager();
                break;
            case 2:
                break;
            default:
                System.out.println("Invalid Command.");
        }
    }

    public void commandsAccountManagerSelector() {
        AccountManager accountManager = new AccountManager();
        System.out.print("\nSelect a command (0, 1, 2...): ");
        int command = input.nextInt();

        switch (command) {
            case 0:
                modeList();
                break;
            case 1:
                accountManager.createAccount();
                break;
            case 2:
                break;
            default:
                System.out.println("Invalid Command.");
            
        }

    }

    public void run() {
        System.out.println("Welcome to the Banking System!");
        modeList();
    }

    public static void main(String[] args) {
        new Bank().run();
    }
}