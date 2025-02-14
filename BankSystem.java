// Base class
abstract class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + ", New Balance: $" + balance);
        } else {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void withdraw(double amount);
}

// SavingsAccount subclass
class SavingsAccount extends BankAccount {
    private static final double MIN_BALANCE = 100;

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() - amount) >= MIN_BALANCE) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: $" + amount + ", New Balance: $" + getBalance());
        } else {
            System.out.println("Withdrawal failed! Minimum balance of $" + MIN_BALANCE + " must be maintained.");
        }
    }
}

// CheckingAccount subclass
class CheckingAccount extends BankAccount {
    private double transactionFee;

    public CheckingAccount(double balance, double transactionFee) {
        super(balance);
        this.transactionFee = transactionFee;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() - amount - transactionFee) >= 0) {
            setBalance(getBalance() - (amount + transactionFee));
            System.out.println("Withdrawn: $" + amount + " (Fee: $" + transactionFee + "), New Balance: $" + getBalance());
        } else {
            System.out.println("Withdrawal failed! Insufficient funds.");
        }
    }
}

// Main class for testing
public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(500);
        CheckingAccount checking = new CheckingAccount(300, 1.0);

        System.out.println("\nTesting Savings Account:");
        savings.deposit(200);
        savings.withdraw(550);
        savings.withdraw(100);

        System.out.println("\nTesting Checking Account:");
        checking.deposit(100);
        checking.withdraw(50);
        checking.withdraw(350);
    }
}
