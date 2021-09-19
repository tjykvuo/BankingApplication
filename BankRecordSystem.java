import java.util.Scanner;
import java.util.Date;
/**
 * class BankRecordSystem.
 * This is the class that contains the program logic
 * for the program and executes the whole banking application
 *
 * @author Daniel Ambrose & Starfranklyn Olivers
 * @version v1.1 10 December, 2020.
 */
public class BankRecordSystem
{
    
     CustomerDatabase customerBankData;
     EmployeeDatabase employeeBankData;
     ManagerDatabase ManagerBankData;

    /**
     * Constructor for objects of class BankRecordSystem
     */
    public BankRecordSystem()
    {
        customerBankData = new CustomerDatabase();
        employeeBankData = new EmployeeDatabase();
        ManagerBankData = new ManagerDatabase();
        
        //Customer(String personName, String personAddress, String personUsername, String passwordIn, long idValue, int balanceValue)
        Customer account1 = new Customer("Starfranklyn Olivers", "Liverpool, UK", "starfrank", "star1234", 109384, 500);
        Customer account2 = new Customer("Oliver Olivers", "New town, UK", "oliveol", "olive1234", 109354, 700);
        Customer account3 = new Customer("Tim Harry", "St Helens, UK", "Timha", "tim1234", 109388, 900);
        Customer account4 = new Customer("John Lewis", "Southampton, UK", "Johnle", "john1234", 109366, 1000);
        Customer account5 = new Customer("Christopher Columbus", "Warrington, UK", "chriscol", "chris1234", 109381, 1500);
        //addBankService(String service)
        account1.addBankService("Loan");
        account1.addBankService("Credit Card");
        account1.addBankService("Mortgage");
        account2.addBankService("Mortgage");
        account2.addBankService("Bill payment");
        account2.addBankService("SME support");
        account2.addBankService("Insurance");
        account3.addBankService("Wealth mangement");
        account3.addBankService("Loan");
        account3.addBankService("Debit card");
        account3.addBankService("Mobile wallet");
        account4.addBankService("Debit card");
        account4.addBankService("Insurance");
        account4.addBankService("Treasury services");
        account4.addBankService("Mortgage");
        account4.addBankService("Loan");
        account4.addBankService("Credit card");
        account4.addBankService("Internet banking");
        account4.addBankService("Bill payment");
        account5.addBankService("Mortgage");
        account5.addBankService("Loan");
        account5.addBankService("Internet banking");
        
        //Transaction(String transactionType, int amount)
        Transaction trans1 = new Transaction("deposit", 20);
        Transaction trans2 = new Transaction("withdrawl", 200);
        
        //addTransaction(Transaction newtransaction)
        account1.addTransaction(trans1);
        account1.addTransaction(trans2);
        account1.addTransaction(new Transaction("deposit", 150));
        account1.addTransaction(new Transaction("withdrawl", 100));
        
        account2.addTransaction(new Transaction("deposit", 2500));
        account2.addTransaction(new Transaction("deposit", 500));
        account2.addTransaction(new Transaction("deposit", 700));
        account2.addTransaction(new Transaction("withdrawl", 200));
        
        account3.addTransaction(new Transaction("deposit", 9000));
        account3.addTransaction(new Transaction("deposit", 5500));
        account3.addTransaction(new Transaction("deposit", 7800));
        account3.addTransaction(new Transaction("withdrawl", 2000));
        account3.addTransaction(new Transaction("deposit", 200));
        
        account4.addTransaction(new Transaction("deposit", 19000));
        account4.addTransaction(new Transaction("withdrawl", 2000));
        account4.addTransaction(new Transaction("deposit", 3000));
        account4.addTransaction(new Transaction("withdrawl", 9000));
        account4.addTransaction(new Transaction("deposit", 900));
        
        account5.addTransaction(new Transaction("deposit", 1900));
        account5.addTransaction(new Transaction("withdrawl", 1000));
        account5.addTransaction(new Transaction("deposit", 9900));
        account5.addTransaction(new Transaction("withdrawl", 8000));
        account5.addTransaction(new Transaction("deposit", 8500));
        account5.addTransaction(new Transaction("withdrawl", 1900));
        
        //Employee(String personName, String personAddress, String personUsername, String passwordIn, long employeeNumber)
        Employee employee1 = new Employee("Robert Steel", "Liverpool, UK", "robert", "robert1234", 20984);
        Employee employee2 = new Employee("Tony Brown", "Liverpool, UK", "tony", "tony1234", 20985);
        Employee employee3 = new Employee("Bill Clinton", "Liverpool, UK", "bill", "bill1234", 20986);
        //addBankService(String service)
        employee1.addFinancialService("new accounts");
        employee1.addFinancialService("overdrafts");
        employee1.addFinancialService("loans");
        
        employee2.addFinancialService("overdraft");
        employee2.addFinancialService("account upgrade");
        employee2.addFinancialService("account validation");
        employee2.addFinancialService("new accounts");
        
        employee3.addFinancialService("overdrafts");
        employee3.addFinancialService("loans");
        employee3.addFinancialService("account upgrade");
        employee3.addFinancialService("account validation");
        employee3.addFinancialService("account linking");
        
        //requestAppointment(Employee employee, String appointmentTypeIn, String dateIn) as a customer
        //Appointment(String appointmentTypeIn, String customerNameIn, String dateIn) 

        account1.requestAppointment(employee1, "Account",  "08.12.2020");
        account1.requestAppointment(employee3, "Insurance",  "21.12.2020");
        account2.requestAppointment(employee1, "Loan",  "10.12.2020");
        account3.requestAppointment(employee3, "overdrafts",  "12.12.2020");
        account4.requestAppointment(employee2, "Credit card",  "15.12.2020");
        account5.requestAppointment(employee2, "Debit card",  "19.12.2020");
        account4.requestAppointment(employee3, "Mortgage",  "21.12.2020");
        
        
        //create past appointment
        Appointment dc1 = new  Appointment("Loan & Card",account1.getName() ,  "02.11.2020");
        dc1.setDone(false);
        employee1.addAppointment(dc1);
        Appointment dc2 = new  Appointment("overdraft",account1.getName() ,  "09.11.2020");
        dc2.setDone(false);
        employee1.addAppointment(dc2);
        Appointment dc3 = new  Appointment("Loan & Card",account3.getName() ,  "01.11.2020");
        dc3.setDone(false);
        employee2.addAppointment(dc3);
        Appointment dc4 = new  Appointment("Mortgage",account2.getName() ,  "02.11.2020");
        dc4.setDone(false);
        employee2.addAppointment(dc4);
        Appointment dc5 = new  Appointment("Loan",account4.getName() ,  "08.11.2020");
        dc5.setDone(false);
        employee3.addAppointment(dc5);
        Appointment dc6 = new  Appointment("Credit Card",account5.getName() ,  "06.11.2020");
        dc6.setDone(false);
        employee3.addAppointment(dc6);
        Appointment dc7 = new  Appointment("Insurance",account5.getName() ,  "11.11.2020");
        dc7.setDone(false);
        employee3.addAppointment(dc7);
        
        //create upcoming appointment
        employee1.addAppointment(new  Appointment("Loan",account1.getName() ,"10.12.2020"));
        employee1.addAppointment(new  Appointment("Mortgage",account5.getName() ,"11.12.2020"));
        employee2.addAppointment(new  Appointment("Insurance",account4.getName() ,"10.12.2020"));
        employee2.addAppointment(new  Appointment("Overdraft",account3.getName() ,"12.12.2020"));
        employee2.addAppointment(new  Appointment("Credit card",account2.getName() ,"13.12.2020"));
        employee3.addAppointment(new  Appointment("Loan",account5.getName() ,"10.12.2020"));
        
        
        //Manager(String personName, String personAddress, String personUsername, String passwordIn, long employeeNumber)
        Manager manager1 = new Manager("Daniel Ambrose", "Liverpool, UK", "daniela", "daniel1234", 30584);

        //CustomerApplication(String applicationTypeIn, String commentIn)
        
        //referCustomers(Manager managerIn, CustomerApplication application )
        employee1.referCustomers(manager1, new CustomerApplication(9876, "Loan", "Please, review for your approval"));
        employee1.referCustomers(manager1, new CustomerApplication(7654, "Account", "Please, review for your approval"));
        employee1.referCustomers(manager1, new CustomerApplication(7694, "Wallet", "Please, review for your approval"));
        employee2.referCustomers(manager1, new CustomerApplication(7834, "Credit card", "Please, review for your approval"));
        employee2.referCustomers(manager1, new CustomerApplication(3546, "Debit card", "Please, review for your approval"));
        employee2.referCustomers(manager1, new CustomerApplication(6578, "Insurance", "Please, review for your approval"));
        employee3.referCustomers(manager1, new CustomerApplication(1230, "Loan", "Please, review for your approval"));
        employee3.referCustomers(manager1, new CustomerApplication(1673, "Wallet", "Please, review for your approval"));
        employee3.referCustomers(manager1, new CustomerApplication(7653, "Insurance", "Please, review for your approval"));
        employee3.referCustomers(manager1, new CustomerApplication(8753, "Debit card", "Please, review for your approval"));

        //addEntry(Role theRole)
        //Add customer to the database
        CustomerDatabase.addEntry(account1);
        CustomerDatabase.addEntry(account2);
        CustomerDatabase.addEntry(account3);
        CustomerDatabase.addEntry(account4);
        CustomerDatabase.addEntry(account5);
        //addEntry(Role theRole)
        //Add employee to the database
        EmployeeDatabase.addEntry(employee1);
        EmployeeDatabase.addEntry(employee2);
        EmployeeDatabase.addEntry(employee3);
        ManagerDatabase.addEntry(manager1);
        
        Scanner scan = new Scanner(System.in);
        Scanner usernameIn = new Scanner(System.in);
        boolean endTime = false;
        String username;

        while (!endTime){
            menuScreen();
            int choice = scan.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter your username");
                    username = usernameIn.nextLine();
                    customerSelect(employeeBankData, customerBankData, username);
                    break;
                case 2:
                    System.out.println("Enter your username");
                    username = usernameIn.nextLine();
                    employeeSelect(ManagerBankData,employeeBankData, username);
                    break;
                case 3:
                    System.out.println("Enter your username");
                    username = usernameIn.nextLine();
                    managerSelect(ManagerBankData, employeeBankData, customerBankData, username);
                    break;
                case 4:
                    System.out.println("logged out");
                    endTime = true;
                    break;
                default:
                    System.out.println("Please select options between 1 and 4");
                    break;
            }

        }

    }
    private static void menuScreen(){
        System.out.println("*******Bank Of Liverpool***********");
        System.out.println("1. Customer Login");
        System.out.println("2. Employee Login");
        System.out.println("3. Manager Login");
        System.out.println("4. Logout ");
        System.out.println("Please enter your choice: ");
    }
    
    private static void customerMenuScreen() {
        System.out.println("*******Bank Customer Action***********");
        System.out.println("1. View current balance");
        System.out.println("2. List most recent transactions");
        System.out.println("3. Update their personal details");
        System.out.println("4. Request an appointment with one of the employees");
        System.out.println("5. Logout ");
        System.out.println("Please enter your choice: ");
    }
    
    private static void employeeMenuScreen(){
        System.out.println("*******Bank Employee Action***********");
        System.out.println("1. View their calendar for upcoming appointments");
        System.out.println("2. Update personal details");
        System.out.println("3. List past appointments and the outcome");
        System.out.println("4. Refer customers to the branch manager for application processing");
        System.out.println("5. Logout ");
        System.out.println("Please enter your choice: ");
    }
    
    private static void managerMenuScreen(){
        System.out.println("*******Bank Manager Action***********");
        System.out.println("1. List current employees and appointments");
        System.out.println("2. View overview of customer accounts held in branch");
        System.out.println("3. Update personal details");
        System.out.println("4. List outstanding customer applications");
        System.out.println("5. Add customer accounts");
        System.out.println("6. Remove customer accounts");
        System.out.println("7. Add employees from the system");
        System.out.println("8. Remove employees from the system");
        System.out.println("9. Process customer applications and accept/decline as necessary");
        System.out.println("10. Logout ");
        System.out.println("Please enter your choice: ");
    }
    
    
    private static void personalDetailsUpdate() {
          System.out.println("****Personal details Update list***");
          System.out.println("1. Update your Name");
          System.out.println("2. Update your Address");
          System.out.println("3. Update your Username");
          System.out.println("4. Update Your Password");
          System.out.println("5. Back ");
          
    }
    private void updateDetails(Role roleIn) {
        boolean endUpdate = false;
        Scanner choice = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        
        while (!endUpdate){
            personalDetailsUpdate();
            int choiceIn = choice.nextInt();
            switch(choiceIn){
                    case 1: 
                      System.out.println("Please enter current name: ");
                      String name = scan.nextLine();
                      roleIn.changeName(name);
                      System.out.println("Your new Name has been changed to " + roleIn.getName());
                      break;
                    case 2:
                      System.out.println("Please enter your new address: ");
                      String address = scan1.nextLine();
                      roleIn.changeAddress(address);
                      System.out.println("Your new Address has been changed to " + roleIn.getAddress());
                      break;
                    case 3:
                      System.out.println("Please enter new username: ");
                      String username = scan2.nextLine();
                      roleIn.changeUsername(username);
                      System.out.println("Your new Name has been changed to " + roleIn.getUsername());
                      break;
                    case 4:
                      System.out.println("Please enter new password: ");
                      String password = scan3.nextLine();
                      roleIn.changePassword(password);
                      System.out.println("Your password has been changed successfuly ");
                      break;
                    case 5:
                      System.out.println("Back");
                      endUpdate = true;
                      break;
                    default:
                      System.out.println("Please select options between 1 and 5 ");
                      break;
             }
        }
     }
     
     public void customerSelect(EmployeeDatabase employeeBankDataIn,CustomerDatabase customerBankDataIn, String customerUsername) {
        Customer currentCustomer = accessAccount(customerBankDataIn, customerUsername);
        if (currentCustomer != null){
            String Name = currentCustomer.getName();
            System.out.println("Hi "+ currentCustomer.getName() + ", Your login was successful!!!");
            System.out.println();
            Scanner scan = new Scanner(System.in);
            Scanner scan1 = new Scanner(System.in);
            Scanner scan2 = new Scanner(System.in);
            Scanner scan3 = new Scanner(System.in);
            boolean endTime = false;
            int sum = 0;
            
            while (!endTime){
                customerMenuScreen();
                int choice = scan.nextInt();
                switch(choice){
                    case 1: 
                      System.out.println("Hi "+ currentCustomer.getName() + " Your current balance is " + currentCustomer.viewBalance());
                      System.out.println();
                      break;
                    case 2:
                      System.out.println("List of your most recent transactions:");
                      currentCustomer.mostRecentTransaction();
                      System.out.println();
                      break;
                    case 3:
                      updateDetails(currentCustomer);
                      System.out.println();
                      break;
                    case 4:
                      System.out.println("Enter the name of the employee, type of appointment and date to book an appointment");
                      System.out.println("Enter employee name: ");
                      String name = scan1.nextLine();
                      //Employee employee = selectEmployee(name);
                      System.out.println("Enter appointment type(New Account|Loan|Cerdit Card|Mortgage|Bill Payment|Other Issues): ");
                      String appointmentType = scan2.nextLine();
                      System.out.println("Enter Date: ");
                      String date = scan3.nextLine();
                      //currentCustomer.requestAppointment(employeeSelect(employeeBankDataIn, username), appointmentType, date);
                      System.out.println();
                      break;
                    case 5:
                      System.out.println("logged out");
                      endTime = true;
                      break;
                    default:
                      System.out.println("Please select options between 1 and 5");
                      break;
                    }
                }
        } else {
            //personalDetailsUpdate(); 
            Scanner usernameIn1 = new Scanner(System.in);
            System.out.println("Please enter your correct username");
            String username = usernameIn1.nextLine();
            customerSelect(employeeBankDataIn, customerBankDataIn, username);
        }
    }
    public void employeeSelect(ManagerDatabase managerBankDataIn, EmployeeDatabase employeeBankDataIn, String employeeUsername) {
        Employee currentEmployee = accessEmployee(employeeBankDataIn, employeeUsername);
        if (currentEmployee != null) {
            System.out.println("Hi "+ currentEmployee.getName() + ", Your login was successful!!!");
            System.out.println();
            Scanner scan = new Scanner(System.in);
            Scanner scan1 = new Scanner(System.in);
            Scanner scan2 = new Scanner(System.in);
            Scanner scan3 = new Scanner(System.in);
            Scanner scan4 = new Scanner(System.in);
            Scanner scan5 = new Scanner(System.in);
    
            boolean endTime = false;
            while (!endTime){
                employeeMenuScreen();
                int choice = scan.nextInt();
                switch(choice){
                    case 1:
                        System.out.println("Upcoming appointments calendar");
                        currentEmployee.viewUpcoming();
                        System.out.println();
                        break;
                    case 2:
                        updateDetails(currentEmployee);
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("List of past appointments and the outcome:");
                        currentEmployee.viewPast();
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("Enter the name of the Manager, type of application and your comment");
                        System.out.println("Enter Manager's name: ");
                        String name = scan2.nextLine();
                        Manager manager = selectManager(managerBankDataIn, name);
                        System.out.println("Enter your application ID ");
                        long applicationId = scan3.nextLong();
                        System.out.println("Enter application type(New Account|Loan|Cerdit Card|Mortgage|Bill Payment|Other Issues): ");
                        String appointmentType = scan4.nextLine();
                        System.out.println("Enter your comment to the manager ");
                        String comment = scan5.nextLine();
                        //CustomerApplication(long applicationId, String applicationTypeIn, String commentIn)
                        CustomerApplication application = new CustomerApplication(applicationId, appointmentType, comment);
                        //referCustomers(Manager managerIn, CustomerApplication application )
                        currentEmployee.referCustomers(manager, application);
                        System.out.println();
                        break;
                    case 5:
                        System.out.println("logged out");
                        endTime = true;
                        break;
                    default:
                        System.out.println("Please select options between 1 and 5");
                        break;
                }
            }
        }
        else {
            //personalDetailsUpdate(); 
            Scanner usernameIn1 = new Scanner(System.in);
            System.out.println("Please enter your correct username");
            String username = usernameIn1.nextLine();
            employeeSelect(managerBankDataIn, employeeBankDataIn, username);
        }
    }
    public void managerSelect(ManagerDatabase managerBankDataIn, EmployeeDatabase employeeBankDataIn, CustomerDatabase customerBankDataIn, String employeeUsername) {
        Manager currentEmployee = accessManager(managerBankDataIn, employeeUsername);
        if (currentEmployee != null) {
            System.out.println("Hi "+ currentEmployee.getName() + ", Your login was successful!!!");
            System.out.println();
            String name, address, username, password;
            long accountNumber, employeeNumber;
            int openingBalance;
            Scanner scan = new Scanner(System.in);
            Scanner scan1 = new Scanner(System.in);
            Scanner scan2 = new Scanner(System.in);
            Scanner scan3 = new Scanner(System.in);
            Scanner scan4 = new Scanner(System.in);
            Scanner scan5 = new Scanner(System.in);
            Scanner scan6 = new Scanner(System.in);
    
            boolean endTime = false;
            while (!endTime){
                managerMenuScreen();
                int choice = scan.nextInt();
                switch(choice){
                    case 1:
                        System.out.println();
                        System.out.println("List current employees and appointments");
                        currentEmployee.ListCurrentEmployees(employeeBankData);
                        System.out.println();
                        break;
                    case 2:
                        System.out.println();
                        System.out.println("List customer accounts held in branch");
                        currentEmployee.viewCustomerAccounts(customerBankData);
                        System.out.println();
                        break;
                    case 3:
                        updateDetails(currentEmployee);
                        System.out.println();
                        break;
                    case 4:
                        currentEmployee.viewOutstanding();
                        System.out.println();
                        break;
                    case 5:
                        System.out.println("Enter new customer account information,");
                        System.out.println("Please enter customer name: ");
                        name = scan1.nextLine();
                        System.out.println("Please enter customer address: ");
                        address = scan2.nextLine();
                        System.out.println("Please enter new username: ");
                        username = scan3.nextLine();
                        System.out.println("Please create a defaulf password for new customer: ");
                        password = scan4.nextLine();
                        System.out.println("Please enter account number for new customer: ");
                        accountNumber = scan5.nextLong();
                        System.out.println("Please enter opening balance for new customer: ");
                        openingBalance = scan6.nextInt();
                        currentEmployee.addCustomer(new Customer(name, address, username, password, accountNumber, openingBalance));
                        System.out.println();
                        break;
                    case 6:
                        System.out.println("Enter the name of the customer to remove");
                        String nameCustomer = scan1.nextLine();
                        Customer customer = selectAccount(customerBankDataIn, nameCustomer);
                        currentEmployee.removeCustomer(customer);
                        System.out.println("Customer removed from database");
                        System.out.println();
                        break;
                    case 7:
                        System.out.println("Enter new Employee's information,");
                        System.out.println("Please enter Employee name: ");
                        name = scan.nextLine();
                        System.out.println("Please enter Employee address: ");
                        address = scan1.nextLine();
                        System.out.println("Please enter new username: ");
                        username = scan2.nextLine();
                        System.out.println("Please create a defaulf password for new Employee: ");
                        password = scan3.nextLine();
                        System.out.println("Please enter account number for new Employee: ");
                        employeeNumber = scan4.nextLong();
                        currentEmployee.addEmployee(new Employee(name, address, username, password, employeeNumber));
                        System.out.println();
                        break;
                    case 8:
                        System.out.println("Enter the name of the Employee to remove");
                        String nameEmployee = scan1.nextLine();
                        Employee employee = selectEmployee(employeeBankDataIn, nameEmployee);
                        currentEmployee.removeEmployee(employee);
                        System.out.println("Employee removed from database");
                        System.out.println();
                        break;
                    case 9:
                        System.out.println("Enter the application ID to update");
                        long applicationId = scan1.nextLong();
                        CustomerApplication application = selectApplication(currentEmployee, applicationId);
                        System.out.print("current application information is ");
                        application.list();
                        System.out.println("Please add your comment to accept/decline as necessary");
                        String comment = scan2.nextLine();
                        application.setComment(comment);
                        System.out.println("Application status updated");
                        System.out.println();
                        break;
                    case 10:
                        System.out.println("logged out");
                        System.out.println();
                        endTime = true;
                        break;
                    default:
                        System.out.println("Please select options between 1 and 10");
                        System.out.println();
                        break;
                }
            }
        }
        else {
            //personalDetailsUpdate(); 
            Scanner usernameIn1 = new Scanner(System.in);
            System.out.println("Please enter your correct username");
            String username = usernameIn1.nextLine();
            managerSelect(managerBankDataIn, employeeBankDataIn, customerBankDataIn, username);
        }
    }
    private Customer accessAccount(CustomerDatabase customerBankDataIn, String ValueIn)
    {
        return customerBankDataIn.listRole(ValueIn);
    }
    private Customer selectAccount(CustomerDatabase customerBankDataIn, String ValueIn)
    {
        return customerBankDataIn.selectAccount(ValueIn);
    }

    private Employee selectEmployee(EmployeeDatabase employeeBankDataIn, String ValueIn)
    {
        return employeeBankDataIn.selectEmployee(ValueIn);
    }
    private Employee accessEmployee(EmployeeDatabase employeeBankDataIn, String ValueIn)
    {
        return employeeBankDataIn.getEmployee(ValueIn);
    }

    private Manager selectManager(ManagerDatabase employeeBankDataIn, String ValueIn)
    {
        return employeeBankDataIn.selectManager(ValueIn);
    }
    private Manager accessManager(ManagerDatabase employeeBankDataIn, String ValueIn)
    {
        return employeeBankDataIn.getManager(ValueIn);
    }

    private CustomerApplication selectApplication(Manager manager1, long ValueIn)
    {
        for (int index=0; index < manager1.size(); index++)
        {
            if (manager1.get(index).getApplicationId() == ValueIn)
                return manager1.get(index);
        }
        return null;
    }
}

