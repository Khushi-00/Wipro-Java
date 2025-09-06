package corejava.Labsessions.Today24;

public class Payment {
	
	// Step 1: Method to be overridden
    public void pay() {
        System.out.println("Processing payment using a generic method.");
    }
   }
//Step 2: Child class CreditCard that overrides pay()
class CreditCard extends Payment {
 @Override
 public void pay() {
     System.out.println("Payment done using Credit Card.");
 }
}

//Step 3: Child class UPI that overrides pay()
class UPI extends Payment {
 @Override
 public void pay() {
     System.out.println("Payment done using UPI.");
 }
}

//Step 4: Child class NetBanking that overrides pay()
class NetBanking extends Payment {
 @Override
 public void pay() {
     System.out.println("Payment done using Net Banking.");
 }

//Step 5: Main class to test the payment methods
public class PaymentTest {
  public static void main(String[] args) {
      // Step 6: Create objects of each payment method

      Payment payment1 = new CreditCard();  // Reference of parent, object of CreditCard
      payment1.pay(); // Calls overridden method in CreditCard

      Payment payment2 = new UPI();         // Reference of parent, object of UPI
      payment2.pay(); // Calls overridden method in UPI

      Payment payment3 = new NetBanking();  // Reference of parent, object of NetBanking
      payment3.pay(); // Calls overridden method in NetBanking
  }

	}

}
