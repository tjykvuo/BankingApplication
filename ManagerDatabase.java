
/**
 * class ManagerDatabase.
 * This class holds a list of all manager details for the manager of the local branch.
 *
 * @author Daniel Ambrose & Starfranklyn Olivers
 * @version v1.1 10 December, 2020.
 */
import java.util.ArrayList;

public class ManagerDatabase
{
    private static ArrayList entries;

    /**
     * Construct an empty CopyOfDatabase.
     */
    public ManagerDatabase()
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
     * Get manager with the username in the database 
     */    
    public Manager getManager(String ValueIn)
    {
        for(int index = 0; index < entries.size(); index++ )
        {
            Manager entry = (Manager)entries.get(index);
            if (entry.getUsername().equals(ValueIn)) {
                return entry;
            }
        }
        return null;
    }
    /**
     * Get manager with the name in the database
     */
    public Manager selectManager(String ValueIn)
    {
        for(int index = 0; index < entries.size(); index++ )
        {
            Manager entry = (Manager)entries.get(index);
            if (entry.getName().equals(ValueIn)) {
            return entry;
           }
        }
        return null;
    }
}
