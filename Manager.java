
/**
 * class Manager
 * This class extends the parent class Role
 * This is a class for a branch  manager of a local branch of a bank.
 * The branch manager is able to list current employees and appointments,
 * view overview of customer accounts held in the branch, 
 * Process customer applications and accept/decline as necessary,
 * add and remove application from the list,
 * print a list of all outstanding application,
 * add and remove customer from the customer database, 
 * add and remove employee from employee database.
 * 
 * 
 * @author Daniel Ambrose & Starfranklyn Olivers
 * @version v1.1 10 December, 2020.
 */
import java.util.ArrayList;
public class Manager extends Role
{
    private long employeeId;
    private ArrayList<CustomerApplication> application;
    private int commission = 0;

    /**
     * Constructor for objects of class manager
     */
    public Manager(String personName, String personAddress, String personUsername, String passwordIn, long employeeNumber)
    {
        super(personName, personAddress, personUsername, passwordIn);
        employeeId = employeeNumber;
        application = new ArrayList();
    }
    /**
     * List current employees and appointments
     */
    public void ListCurrentEmployees(EmployeeDatabase database) {
        database.list();
    } 
    
    /**
     * View overview of customer accounts held in branch.
     */
    public void viewCustomerAccounts(CustomerDatabase database) {
        database.list();
    }

    public Customer viewCustomerView(CustomerDatabase database, String username) {
        return database.listRole(username);
    }
    /**
     * Process customer applications and accept/decline as necessary
     */
    public void processApplication(CustomerApplication record, String commentIn) {
        record.setComment(commentIn);
    }
    /**
     * Get the index number of a Customer Application in the database
     */
    public int position(CustomerApplication record) {
        return application.indexOf(record);
    }
    /**
     * Get the Customer Application with the index number in the database
     */
    public CustomerApplication get(int index) {
        return application.get(index);
    }
    /**
     * Get the number of Customer Application in the database
     */
    public int size() {
        return application.size();
    }
    /**
     * Add an appplication to the list.
     */
    public void addApplication(CustomerApplication record)
    {
        application.add(record);
    }
    /**
     * Print a list of all outstanding applications
     */
    public void viewOutstanding()
    {
        System.out.println("outstanding customer applications");
        for(int index = 0; index < application.size(); index++ )
        {
            CustomerApplication entry = application.get(index);
            entry.list();
        }
    }
    /**
     * Add customer accounts to the database.
     */
    public void addCustomer(Customer theRole)
    {
        CustomerDatabase.addEntry(theRole);
    }
    /**
     * remove customer accounts from the database.
     */
    public void removeCustomer(Customer theRole)
    {
        CustomerDatabase.removeEntry(theRole);
    }
    /**
     * Add employee to the system.
     */
    public void addEmployee(Employee theRole)
    {
        EmployeeDatabase.addEntry(theRole);
    }
    
    /**
     * remove employee from the system
     */
    public void removeEmployee(Employee theRole)
    {
        EmployeeDatabase.removeEntry(theRole);
    }
    public void managerInfo() {
       super.list();
       //System.out.println("Employee ID: " + employeeId);
    }
}
