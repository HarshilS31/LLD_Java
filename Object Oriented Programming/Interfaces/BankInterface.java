public class BankInterface {
    public static void main(String[] args) {
        BankAcc account = new BankAcc(1000.0); // Initial balance of 1000
        account.checkBalance(); // Check initial balance
        account.depositAmt(500.0); // Deposit 500
        account.checkBalance(); // Check balance after deposit
        account.depositAmt(-200.0); // Attempt to deposit a negative amount
        account.checkBalance(); // Final balance check


    }

}
interface accMethods {
    double depositAmt(double amt);
    void checkBalance();

}

class BankAcc implements accMethods {
    private double balance;

    public BankAcc(double initialBalance) {
        this.balance = initialBalance;
    }
    public double depositAmt(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("Deposited: " + amt);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
        return balance;
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

}