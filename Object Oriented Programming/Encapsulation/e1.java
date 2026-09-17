public class e1 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1000000);
        acc1.deposit(10011.11);
        System.out.println(acc1.getBalance());
        
        
    }
}
//Using Encapsulated Design
class BankAccount {
    private double balance;
    public void deposit(double amount) {
        if(amount > 0 ) { 
            balance+=amount;
        }
    }
    public double getBalance(){
        return balance;
    }
    public BankAccount(double balance) {
        this.balance = balance;
    }
}