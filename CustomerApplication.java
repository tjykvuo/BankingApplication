
/**
 * class customerApplication.
 * This class controls all customer 
 * application for bank services.
 *
 * @author Daniel Ambrose & Starfranklyn Olivers
 * @version v1.1 10 December, 2020.
 */
public class CustomerApplication
{
    // instance variables - replace the example below with your own
    private long applicationId;
    private String applicationType;
    private String comment;
    private String applicationStatusComment;
    private boolean outstanding;

    /**
     * Constructor for objects of class customerApplications
     */
    public CustomerApplication(long applicationIdIn, String applicationTypeIn, String commentIn)
    {
        applicationId = applicationIdIn;
        applicationType = applicationTypeIn;
        comment = commentIn;
        applicationStatusComment = "";
        outstanding = true;
    }
    public long getApplicationId()
    {
        return applicationId;
    }
    /**
     * Enter a comment for this Customer Application.
     */
    public void setComment(String comment)
    {
        this.applicationStatusComment = comment;
        outstanding = false;
    }

    /**
     * Return the comment for this Customer Application.
     */
    public String getStatus()
    {
        return "Manager's Comment " + applicationStatusComment + "is outstanding" + outstanding;
    }
    
    public void list() {
        if (outstanding){
            System.out.println("Application " + applicationType + " is outstanding");
            }
    } 
}
