
public class casting {
    public  static void main(String[] args) {
        // Explicitly Casting  meaning 
        // converting a bigger data type 
        // into a smaller data type 

        double d = 35.25;
        double dd = 35.99;
        double gg = 99.99;
        
        // casting the double d into a int
        int i = (int) d;
        int iii = (int)gg;
        
        // casting the double dd into a int
        int ii = (int) dd;
        System.out.println(i);
        System.out.println(ii);
        System.out.println(iii);

        // Implicit Casting
        // converting smaller type data type 
        // into a bigger data type
        int t  = 35;
        float f = t;
        System.out.println("The number is: " + f);

    }
    
}