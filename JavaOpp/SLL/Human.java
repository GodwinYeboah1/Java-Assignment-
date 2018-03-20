// the keyword extends allow me to use the Mammal method 
// reusable code 
class Human extends Mammal {
    // drive = 5
    int drive = 0;
    
    public void goToWork(){
        System.out.println("I'm going to work, something only humans can do.");
    }
    // dont forget to declar the datetype in java 
    public void driving(int miles){
        drive += miles;
        System.out.println("You just drove about : ");
        System.out.println(drive);

    }
}
