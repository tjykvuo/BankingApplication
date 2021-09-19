
/**
 * class Transaction.
 * This class controls all 
 * customer transactions in the bank.
 *
 * @author Daniel Ambrose & Starfranklyn Olivers
 * @version v1.1 10 December, 2020.
 */
public class Transaction
{
    // instance variables - replace the example below with your own
    //private int id = 0;
    private String transactionType;
    private int amount;
    
    public Transaction(String transactionType, int amount) {
        //this.id = this.id + 1;
        this.transactionType = transactionType;
        this.amount= amount;
    }
   public void print()
   {
      System.out.println("Transaction Id: " + "   Type " + transactionType +
            "   Amount is " + amount);
   }
}