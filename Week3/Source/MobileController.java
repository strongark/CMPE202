
/**
 * Write a description of class MobileController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class MobileController
{
    // instance variables - replace the example below with your own
   
    /**
     * Constructor for objects of class MobileController
     */
    public MobileController()
    {
        
    }

   
    public static void main(String[] args){
        
        /**
        * List of SoftPhones
        */
       Vonage vonage = new Vonage();
       vonage.makeCall();
       vonage.connectNetwork();
       
       /**
        * List of HardPhones
        */
       ArrayList<HardPhone> phoneList = new ArrayList<HardPhone>();
       
       //Samsung Phones
       phoneList.add(new SamsungS5());
       phoneList.add(new SamsungS6());
       phoneList.add(new SamsungS7());
       
       //iPhones
       phoneList.add(new iPhone5());
       phoneList.add(new iPhone6());
       phoneList.add(new iPhone7());
       
       //Nokia Phones
       phoneList.add(new Nokia4());
       phoneList.add(new Nokia5());
       phoneList.add(new Nokia6());
       
       for(HardPhone phone:phoneList)
       {
           phone.batteryManagement();
           phone.connectNetwork();
           phone.display();
           phone.recharge();
           phone.makeCall();
        }
    }
    
}
