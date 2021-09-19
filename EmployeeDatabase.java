
/**
 *class EmployeeDatabase.
 *This class holds a list of all employess in the local bank branch.
 *
 * @author Daniel Ambrose & Starfranklyn Olivers
 * @version v1.1 10 December, 2020.
 */
import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDatabase
{
    private static ArrayList entries;

    /**
     * Construct an empty CopyOfDatabase.
     */
    public EmployeeDatabase()
    {
        entries = new ArrayList();
    }

    /**
     * Add an entry to the database.
     */
    public static void addEntry(Role theRole)
    {
        entries.add(theRole);
    }
    
    /**
     * remove an entry to the database.
     */
    public static  void removeEntry(Role theRole)
    {
        entries.remove(theRole);
    }
    
    /**
     * Get the index number of a employee in the database
     */
    public int position(Employee account) {
        return entries.indexOf(account);
    }
    /**
     * Get the employee with the index number in the database
     */
    public Role get(int index) {
        return (Role)entries.get(index);
    }
    /**
     * Get the number of employee in the database
     */
    public int size() {
        return entries.size();
    }
    /**
     * Print a list of all current employee
     */
    public void list()
    {
        for(int index = 0; index < entries.size(); index++ )
        {
            Role entry = (Role)entries.get(index);
            entry.list();
        }
    }
    /**
     * Get employee with the username in the database
     */
    public Employee getEmployee(String bame)
    {
        for(int index = 0; index < entries.size(); index++ )
        {
            Employee entry = (Employee)entries.get(index);
            if (entry.getUsername().equals(bame)){
                return entry;
            }
        }
        return null;
    }

    /**
     * Get employee with the name in the database
     */
    public Employee selectEmployee(String ValueIn)
    {
        for(int index = 0; index < entries.size(); index++ )
        {
            Employee entry = (Employee)entries.get(index);
            if (entry.getName().equals(ValueIn)){
                return entry;
            }
        }
        return null;
    }
    public Manager getManager(String ValueIn)
    {
        for(int index = 0; index < entries.size(); index++ )
        {
            Manager entry = (Manager)entries.get(index);
            if (entry.getName().equals(ValueIn)){
                return entry;
            }
        }
        return null;
    }
    public Manager selectManager(String ValueIn)
    {
        for(int index = 0; index < entries.size(); index++ )
        {
            Manager entry = (Manager)entries.get(index);
            if (entry.getName().equals(ValueIn)){
                return entry;
            }
        }
        return null;
    }
}
