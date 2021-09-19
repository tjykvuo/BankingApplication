
/**
 * class Employee
 * This class extends the parent class Role
 * This is a class for a branch employee of a local branch of a bank.
 * The branch employee is able to change his/her own employee details,
 * add and remove appointment from the list,
 * view and print a list of all customer appointments(past and upcoming)(with whom and date),
 * refer customer application to the branch manager for application processing.
 * 
 * 
 * @author Daniel Ambrose & Starfranklyn Olivers
 * @version v1.1 10 December, 2020.
 */
import java.util.ArrayList;

public class Employee extends Role
{
    private long employeeId;
    private static ArrayList<Appointment> appointments;
    private ArrayList<String> financialServices; //"new accounts", "overdrafts", "loans", "credit cards"
    private Appointment appointment;
    
    public Employee(String personName, String personAddress, String personUsername, String passwordIn, long employeeNumber) {
        super(personName, personAddress, personUsername, passwordIn);
        employeeId = employeeNumber;
        financialServices = new ArrayList<String>();
        appointments = new ArrayList<Appointment>();
    }
    /**
     * Add an appointment to the list.
     */    
    public void addAppointment(Appointment booking)
    {
        appointments.add(booking);
    }
    /**
     * Add an appointment to the list.
     */ 
    public void removeAppointment(Appointment booking)
    {
        appointments.remove(booking);
    }
    /**
     * A list of customer appointments (with date and to whom).
     */ 
    public void previewlist()
    {
        for(int index = 0; index < appointments.size(); index++ )
        {
            Appointment entry = appointments.get(index);
            entry.previewAppointment();
        }
    }
    /**
     * View their calendar for upcoming appointments
     */
    public void viewUpcoming()
    {
        for(int index = 0; index < appointments.size(); index++ )
        {
            Appointment entry = appointments.get(index);
            entry.listUpcoming();
        }
    }
    
    /**
     * Print a list of all appointments
     */
    public void viewPast()
    {
        for(int index = 0; index < appointments.size(); index++ )
        {
            Appointment entry = appointments.get(index);
            entry.listPast();
        }
    }
    /**
     * Refer customers to the branch manager for application processing.
     */
    public void referCustomers(Manager managerIn, CustomerApplication application ) { 
        managerIn.addApplication(application);            
    }
    
    public void addFinancialService(String service)
    {
       financialServices.add(service);
    }
    
    public void employeeDetails() {
       super.list();
       System.out.println("Financial Services " + financialServices);
       System.out.println("Appointments ");
       for(int index = 0; index < appointments.size(); index++ )
        {
            Appointment entry = appointments.get(index);
            entry.listUpcoming();
        }
    }
}
