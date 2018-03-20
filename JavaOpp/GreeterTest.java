public class GreeterTest{
    // main function will run are function
    public static void main(String[] args){

        Greeter g = new Greeter();
        String greeting = g.greet();
        String greetingWithName = g.greet("Godwin");
        
        System.out.println(greetingWithName);
        // if (greeting.equals("Hello World") || greetingWithName.equals("Hello Godwin")){

        //     System.out.println(greetingWithName);
        //     System.out.println("Test successful");
        // } else{
        //     System.out.println("Test Fail");
        // }
    }
}