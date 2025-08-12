import java.util.Scanner;

public class Bank {

    public void commandList() {
        String[] commands = {
            "1 - createAccount",
            "2 - none",
            "3 - none"
        };

        System.out.println("Supported Commands:");
        for (String command : commands) {
            System.out.println(command);
        }
        commandSelector();
    }

    public void commandSelector() {
        Scanner input = new Scanner(System.in);
        AccountManager accountManager = new AccountManager();
        System.out.print("Select a command (1, 2...): ");
        int command = input.nextInt();

        switch (command) {
            case 1:
                accountManager.createAccount();
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Invalid Command.");
                commandSelector();
        }

        input.close();
    }

    public void run() {
        System.out.println("Welcome to the Banking System!");
        commandList();
    }
    public static void main(String[] args) {
        new Bank().run();
    }
}