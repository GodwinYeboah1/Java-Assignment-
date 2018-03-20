// to use HashMap 
// step 1 import 
import java.util.HashMap;

public class Maps{
    // Create a new HashMap()
    //  Should not be in the main function
    static HashMap<String, String> userMap = new HashMap();

    public static void main(String[] args){
 

         // stores A string key and a string value 
        //  put() method
        userMap.put("godwinyeboah95@gmail.com", "godwinYeboah");
        userMap.put("princeyeboah@gmil.com", "prince Yeboah");

        userMap.put("headphones", "Beats");
        userMap.put("headphones", "apple");
        //  return the value and stores it in Name
        String Name = userMap.get("godwinyeboah95@gmail.com");
        // print Name to the console
        System.out.println(Name);
        //  return the value and stores it in newheadPhones 
        String newheadPhones =  userMap.get("headphones");
        // print newHeadPhone sto the console
        System.out.println(newheadPhones);
        // find my keys
        if(userMap.containsKey("headphones")) System.out.println(1);
        
    }
}
