// Base class
class BankAccount {
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Derived class
class SavingsAccount extends BankAccount {

    // Overriding withdraw() method
    void withdraw(double amount) {
        if ((balance - amount) >= 100) {
            balance = balance - amount;
            System.out.println("Withdrawn from Savings: " + amount);
        } else {
            System.out.println("Cannot withdraw. Minimum balance of 100 must be maintained.");
        }
    }
}

// Main class
public class BankExample {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();

        sa.deposit(500);          // Add money
        sa.showBalance();

        sa.withdraw(450);         // Not allowed (will go below 100)
        sa.withdraw(300);         // Allowed
        sa.showBalance();
    }
}
