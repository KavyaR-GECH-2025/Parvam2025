//1. Create a BankAccount class with private fields for account number, account holder name, and balance.
//    Provide public methods to deposit and withdraw money while ensuring the balance cannot go negative.


package assignment1;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount; // Corrected: Updating balance
            System.out.println("Withdrawn: " + amount + " | Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("123456", "Kavya", 20000.00);
        a1.deposit(500);
        a1.withdraw(300);
        a1.withdraw(1500);
    }
}
