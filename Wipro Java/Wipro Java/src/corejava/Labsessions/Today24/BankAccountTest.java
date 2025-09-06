package corejava.Labsessions.Today24;

//Abstract base class
abstract class BankAccount {
 // Fields
 protected String accountNumber;
 protected double balance;

 // Constructor to initialize fields
 public BankAccount(String accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }
 
//Abstract method to be implemented by subclasses
 abstract double calculateInterest();

 // Method to display account balance
 public void printBalance() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Current Balance: ₹" + balance);
 }
}

//Subclass for Savings Account with 4% interest
class SavingsAccount extends BankAccount {

 public SavingsAccount(String accountNumber, double balance) {
     super(accountNumber, balance);
 }

 // Implementing abstract method
 @Override
 double calculateInterest() {
     return balance * 0.04; // 4% interest
 }
}

//Subclass for Fixed Deposit Account with 6.5% interest
class FixedDepositAccount extends BankAccount {

 public FixedDepositAccount(String accountNumber, double balance) {
     super(accountNumber, balance);
 }

 // Implementing abstract method
 @Override
 double calculateInterest() {
     return balance * 0.065; // 6.5% interest
 }
}

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a savings account
        SavingsAccount savings = new SavingsAccount("SA1001", 100000);
        savings.printBalance();
        System.out.println("Interest (Savings): ₹" + savings.calculateInterest());
        System.out.println();

        // Create a fixed deposit account
        FixedDepositAccount fixed = new FixedDepositAccount("FD2001", 150000);
        fixed.printBalance();
        System.out.println("Interest (Fixed Deposit): ₹" + fixed.calculateInterest());

	}

}
