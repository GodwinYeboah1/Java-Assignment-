import java.util.Random;

public class BankAccount{
    private String accountNumber;
    private double checkingBalance;
    private double savingBalance;
    private static int numberOfAccount = 0;
    private static int totalAmountInAccount = 0;


    private static int accountNumberGen(){
        Random accNum = new Random();
        int newAccNumber =accNum.nextInt(100000000) + 1;
        return newAccNumber;
    }

    
}