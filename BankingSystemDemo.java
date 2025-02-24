abstract class BankAccount {
    private String accountNumber;
    private double balance;
    protected static double interestRate;

    
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    
    public static void setInterestRate(double rate) {
        interestRate = rate;
    }

    
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }

   
    public abstract void calculateInterest();

    protected double getBalance() {
        return balance;
    }

    
    protected void updateBalance(double interest) {
        this.balance += interest;
    }
}


class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    
    public void calculateInterest() {
        double interest = getBalance() * (interestRate / 100);
        updateBalance(interest);
        System.out.println("Interest added: " + interest);
    }
}


public class BankingSystemDemo {
    public static void main(String[] args) {
       
        BankAccount.setInterestRate(4.5);

        
        SavingsAccount savingsAccount = new SavingsAccount("SA12345", 10000);

        
        System.out.println("Before Interest Calculation:");
        savingsAccount.displayAccountDetails();

        
        savingsAccount.calculateInterest();

        
        System.out.println("\nAfter Interest Calculation:");
        savingsAccount.displayAccountDetails();
    }
}
