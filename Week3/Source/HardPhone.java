
/**
 * Write a description of class HardPhone here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HardPhone extends Phone
{
    // instance variables - replace the example below with your own
    private String screenType;
    private String batteryType;
    private String simType;

    
    /**
     * Constructor for objects of class HardPhone
     */
    public HardPhone()
    {
         // Constructor
      
    }

    protected void display()
    {
        // put your code here
       System.out.println(this.getClass().getName()+" Display");
    }
    
    
     protected void batteryManagement()
    {
        // put your code here
       System.out.println(this.getClass().getName()+" Battery");
    }
    
    public void makeCall()
    {
        // put your code here
       System.out.println(this.getClass().getName()+" Make Call");
    }
    
    protected void recharge()
    {
        // put your code here
       System.out.println(this.getClass().getName()+" Recharge");
    }
    
    
    protected void connectNetwork()
    {
        // put your code here
       System.out.println(this.getClass().getName()+" Connect Network");
    }
}
