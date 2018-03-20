public class StringManipulatorTesting{
    // always start with the main function
    public static void main(String[] args){
    StringManipulator word = new  StringManipulator();
    String finalResult = word.trimAndConcat("  Hello   ", "  World  ");
    System.out.println(finalResult);

    // StringManipulator findings = new  StringManipulator();
    // String result = findings.getIndexOrNull("godwin", 'o');
    // System.out.println(result);


    }

}