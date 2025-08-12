public class Transaction {

    private double transactionAmount;
    private String accountNumberPayed;
    private String accountNumberPaying;

    public Transaction(double transactionAmount, String accountNumberPayed, String accountNumberPaying) {
        this.transactionAmount = transactionAmount;
        this.accountNumberPayed = accountNumberPayed;
        this.accountNumberPaying = accountNumberPaying; 
    }

    public String getAccountNumberPayed() {
        return accountNumberPayed;
    }

    public String getAccountNumberPaying() {
        return accountNumberPaying;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setAccountNumberPayed(String accountNumberPayed) {
        this.accountNumberPayed = accountNumberPayed;
    }

    public void setAccountNumberPaying(String accountNumberPaying) {
        this.accountNumberPaying = accountNumberPaying;
    }

    public void setTransactionAmount(double transactionAmount) {
        if (transactionAmount > 0) {
            this.transactionAmount = transactionAmount;
        } else {
            System.out.println("Invalid transaction amount.");
        }
    }

    @Override
    public String toString() {
        return "Transaction Details:\n" +
               "From Account: " + accountNumberPaying + "\n" +
               "To Account: " + accountNumberPayed + "\n" +
               "Amount: " + transactionAmount;
    }
}
