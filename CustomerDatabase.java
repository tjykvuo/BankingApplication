
/**
 * class CustomerDatabase.
 * This class holds a list of all customers in the local bank branch.
 *
 * @author Daniel Ambrose & Starfranklyn Olivers
 * @version v1.1 10 December, 2020.
 */
import java.util.ArrayList;
import java.util.Iterator;

public class CustomerDatabase
{
    private static ArrayList entries;

    /**
     * Construct an empty Database.
     */
    public CustomerDatabase()
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
     * Get the index number of a customer in the database
     */
    public int position(Customer account) {
        return entries.indexOf(account);
    }
    /**
     * Get the customer with the index number in the database
     */
    public Role get(int index) {
        return (Role)entries.get(index);
    }
    /**
     * Get the number on the database
     */
    public int size() {
        return entries.size();
    }
    /**
     * Print a list of all current customers
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
     * Get customer with the username in the database
     */
    public static Customer listRole(String bame)
    {
        String username;
        for(int index = 0; index < entries.size(); index++ )
        {
            Customer entry = (Customer)entries.get(index);
            username = entry.getUsername();
            if (bame.equals(username)){
                return entry;
            }
        }
        return null;
    }

    /**
     * Get customer with the name in the database
     */
    public static Customer selectAccount(String ValueIn)
    {
        for(int index = 0; index < entries.size(); index++ )
        {
            Customer entry = (Customer)entries.get(index);
            if (entry.getName().equals(ValueIn)) {
                return entry;
            }
        }
        return null;
    }
}
