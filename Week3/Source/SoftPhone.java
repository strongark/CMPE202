
/**
 * Write a description of class SoftPhone here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SoftPhone extends Phone
{
    private String phoneNumber;
    private String serviceProvider;

    /**
     * Constructor for objects of class SoftPhone
     */
    public SoftPhone()
    {
      
    }
    

    public void makeCall()
    {
        // put your code here
       System.out.println(this.getClass().getName()+" Make Call");
    }
   

    public void connectNetwork()
    {
        // put your code here
       System.out.println(this.getClass().getName()+" Connect Network");
    }
}
