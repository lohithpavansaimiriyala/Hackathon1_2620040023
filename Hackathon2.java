import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Parameterized constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Method to return current balance
    public double checkBalance() {
        return balance;
    }

    // Method to display account details
    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNext()) {
            String accNum = scanner.next();
            String accHolder = scanner.next();
            double initialBalance = scanner.nextDouble();

            BankAccount account = new BankAccount(accNum, accHolder, initialBalance);

            if (scanner.hasNextDouble()) {
                double depositAmount = scanner.nextDouble();
                account.deposit(depositAmount);
            }

            if (scanner.hasNextDouble()) {
                double withdrawAmount = scanner.nextDouble();
                account.withdraw(withdrawAmount);
            }

            account.displayAccount();
        }

        scanner.close();
    }
}
