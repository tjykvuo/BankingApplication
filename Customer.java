
/**
 * class Customer.
 * This class extends the parent class Role.
 * This is the class for a customer of the local bank branch.
 * The customer is able to change his/her own personal details,
 * view their current account balance,
 * list their most recent trannsactions,
 * deposit and withdraw money, add bank services,
 * add transaction and 
 * request an appointment with one of the employees of the local branch.
 *
 * @author Daniel Ambrose & Starfranklyn Olivers
 * @version v1.1 10 December, 2020.
 */
import java.util.ArrayList;
import java.util.Date;
public class Customer extends Role
{
    // instance variables - replace the example below with your own
    private long accountNumber;
    private int balance;
    private  ArrayList<Transaction> bankTransaction;
    private ArrayList<String> otherBankServices; // "Loan", "Mortgage", "Credit Card", "Wallet" "Bill Pay"
    private Appointment appointment;
    /**
     * Constructor for objects of class customer
     */
    
    public Customer(String personName, String personAddress, String personUsername, String passwordIn, long idValue, int balanceValue)
    {
        super(personName, personAddress, personUsername, passwordIn);
        accountNumber = idValue;
        balance = balanceValue;
        bankTransaction = new ArrayList<Transaction>();
        otherBankServices = new ArrayList<String>();
    }
    
    public int viewBalance()
    {
       return balance;
    }
    /**
     * List their most recent transactions
     */
    public void mostRecentTransaction() {
        int index = bankTransaction.size();
        bankTransaction.get((index-1)).print();
        if (index > 1) {
            index = index - 2;
            bankTransaction.get(index).print();
        }
    }
    
    public void showTransactions() {
        for (int index=0; index < bankTransaction.size(); index++)
        {
            bankTransaction.get(index).print();
        }
    }
    public void deposit(int anAmount)
    {
       balance = balance + anAmount;
       bankTransaction.add(new Transaction("deposit", anAmount));
    }

    public void withdraw(int anAmount)
    {
       if (anAmount <= balance) {
          balance = balance - anAmount;
          bankTransaction.add(new Transaction("withdraw", anAmount));
        } else {
          System.out.println("Insufficient Funds balance $"+ balance);
          bankTransaction.add(new Transaction("Transaction Failed", anAmount));
        }
    }
    
    public void addBankService(String service)
    {
       otherBankServices.add(service);
    }
    
    public void showBankService() {
        for (int index=1; index < otherBankServices.size(); index++)
        {
            System.out.println(otherBankServices.get(index));
        }
    }
    
    public void addTransaction(Transaction newtransaction){
       bankTransaction.add(newtransaction);       
    }
    /**
     * Request an appointment with one of the employees in their local branch
     */
    public void requestAppointment(Employee employee, String appointmentTypeIn, String dateIn) {
        employee.addAppointment(new Appointment(appointmentTypeIn, super.getName(), dateIn));
    }
    public void customerDetails() {
       super.list();
       System.out.println("Account Number: " + accountNumber);
       System.out.println("Balance: " + balance);
       System.out.println("Other Service held" + otherBankServices);
    }
}