public class HelloWorldTest {
    public static void main(String[] args){
        HelloWorld Hw = new HelloWorld();

        HelloWorld hW = new HelloWorld();
        String greeting = hW.greet();
        String greetingWithName = hW.greet("Godwin");
    
        if (greeting.equals("Hello World") || greetingWithName.equals("Hello Eduardo")){

            System.out.println(greetingWithName);
            System.out.println("Test successful");
        } else{
            System.out.println("Test Fail");
        }
        // Hw.goodbye("godwin") return a value 
        System.out.println(Hw.goodbye("godwin"));
    }
}
