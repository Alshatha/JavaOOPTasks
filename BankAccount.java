// BankAccount.java
public class BankAccount {
    private String accountNumber;
    private double balance;

    // Getter and Setter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accNum) {
        accountNumber = accNum;
    }

    // Getter and Setter for balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double bal) {
        balance = bal;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setAccountNumber("123456789");
        acc.setBalance(1000.50);

        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Balance: " + acc.getBalance());
    }
}
