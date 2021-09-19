
/**
 *  class Role
 * This is the parent class of the class customer, class employee and class manager. 
 *
 * @author Daniel Ambrose & Starfranklyn Olivers
 * @version v1.1 10 December, 2020.
 */
public class Role
{
   public String name;
   public String address;
   private String username; 
   private String password;
   
   
   public Role(String personName, String personAddress, String personUsername, String passwordIn)
    {
        name = personName;
        address = personAddress;
        username = personUsername;
        password = passwordIn;
    }
   
   public void changeName(String newName)
   {
        name = newName;
   }
   public String getName()
   {
        return name;
   }
   public String getUsername()
   {
        return username;
   }
   public String getAddress()
   {
        return address;
   }
   public String getPassword()
   {
        return password;
   }
   public void changeAddress(String newAddress)
   {
        address = newAddress;
   }
   
   public void changeUsername(String newUsername){
        username = newUsername;
   }
   
   public void changePassword(String newPassword)
   {
       password = newPassword;
   }
      
   public void list(){
       System.out.println("Name: " + name);
       System.out.println("Address: " + address);
       System.out.println("Username: " + username);
   }
   public Role me(){
       return this;
   }
}
