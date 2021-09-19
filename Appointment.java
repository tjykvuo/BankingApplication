
/**
 * class Appointment.
 * This class controls all customer appointment 
 * with the employess of the local bank branch.
 *
 * @author Daniel Ambrose & Starfranklyn Olivers
 * @version v1.1 10 December, 2020.
 */
import java.util.Date;

public class Appointment
{
    // instance variables - replace the example below with your own
    //private int id;
    private String appointmentType;
    private String customerName;
    private String appointmentDate;
    private String appointmentDetails;
    private boolean notDone = true;

    /**
     * Constructor for objects of class Appointments
     */
    public Appointment(String appointmentTypeIn, String customerNameIn, String dateIn)
    {
        //id = id + 1;
        appointmentType = appointmentTypeIn;
        customerName = customerNameIn;
        appointmentDate = dateIn;
        appointmentDetails = "";
    }
     /**
     * Sets the flag indicating that the appointment is done.
     */
    public void setDone(boolean doneIt)
    {
        notDone = doneIt;
    }
    
    public void updateDetail(String detailsIn)
    {
        appointmentDetails = detailsIn;
    }
    public void previewAppointment()
    {
       System.out.println("Appointment Date: "+ appointmentDate + ", with "  + customerName);
    }
    public void listUpcoming()
    {
        if(notDone) { 
            System.out.println("Appointment Type: " + appointmentType +
             ",   schedule for " + appointmentDate);
            }
    }
    public void listPast()
    {
       if(!notDone) {
        System.out.println("Appointment Type: " + appointmentType +
             ",   schedule for " + appointmentDate + ". Details: " + appointmentDetails);
            }
    }
}
