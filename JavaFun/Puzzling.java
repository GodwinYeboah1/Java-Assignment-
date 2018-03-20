// dont forget to import the ArrayList
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Puzzling{

    public static void main(String[] args){
        // --------------------------------------1
            // created an array in java
            int[] arr1 = {3,5,1,2,7,9,8,13,25,32};
            // Puzzling.newlist(arr1);
            // System.out.println( Puzzling.newlist(arr1));
        // --------------------------------------
        // --------------------------------------2
            // created an array in java
            String[] names = {"Nancy", "Jinichi","Fujibayashi", "Momochi", "Ishikawa"};
            // Puzzling.NewNames(names);
            System.out.println(Puzzling.NewNames(names));
        // --------------------------------------

        // --------------------------------------3
            // created an array in java
            String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
            // Puzzling.NewNames(names);
            System.out.println(Puzzling.alphabetFun(alphabet));
        // --------------------------------------
 
    }
    // method bellows

    // i need the ArrayList In my method function
       public static ArrayList<Integer> newlist(int[] arr){
        // created a new  muttable array list 
        ArrayList<Integer> greater = new ArrayList<Integer>();
            // loop that display values
            for(int i= 0; i < arr.length; i++)
            {
                // System.out.println(arr[i]);
                // want to add() numbers greater then 10 
                if(arr[i] > 10){
                    greater.add(arr[i]);
                }
            }
            return greater;
        }

        // --------------------------------------2
        public static ArrayList<String> NewNames(String[] arr){
        //  shuffle
        // TO PRINT NICE Arrays.toString(arr)
        System.out.println(Arrays.toString(arr));

        List<String> list = Arrays.asList(arr);
        // random
        Collections.shuffle(list);
        // change back to array
        list.toArray(arr);
        System.out.println(Arrays.toString(arr));

        ArrayList<String> numGreaterFive = new ArrayList<String>();

            for(int i = 0; i < arr.length; i++){
                System.out.println(arr[i]);
                if(arr[i].length() > 5){
                    numGreaterFive.add(arr[i]);
                }
            }
            return numGreaterFive;
        }

        public static ArrayList<String> alphabetFun(String[] arr){
            Random rNum = new Random();
            ArrayList<String>  alp = new ArrayList<String>();
            for(int i= 0; i < arr.length; i++){
                // random
                int r  =rNum.nextInt() * 26;
                // stores the first temp arr[i]
                int Temp = Integer.valueOf(arr[i]);

                // arr[r] gives a random number and stores it in arr[i]
                arr[i] = arr[r];  
                alp.add(arr[i]);
            }
            
            // System.out.println("First letter: " +  arr[0]);
            // System.out.println("Last letter: " +  arr[arr.length]);
            return alp;
        }



    }
     