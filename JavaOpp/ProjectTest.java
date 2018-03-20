class ProjectTest{
    public static void main(String [] args){
         // create an object
    Project elevatorPitch = new Project();
    Project elevatorPitch1 = new Project("godwin");
    Project elevatorPitch3 = new Project("God", "I will re turn for my children");
    // first example
    elevatorPitch.setDescription("Welcome to coding Dojo");
    elevatorPitch.setName("tony");
    System.out.println("elevator Pitch name : " + elevatorPitch.getName() + " elevator Pitch Description : " + elevatorPitch.getDescription() );
    
    // second example
    elevatorPitch1.setDescription("this is my very face example");
    System.out.println("elevator Pitch name : " + elevatorPitch1.getName() + " elevator Pitch Description : " + elevatorPitch1.getDescription());

    // third example
    System.out.println("elevator Pitch name : " + elevatorPitch3.getName() + " elevator Pitch Description : " + elevatorPitch3.getDescription());
    }

}