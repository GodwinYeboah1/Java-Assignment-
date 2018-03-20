public class Person {
    private String age;
    private String name;
    private String email;
    // the variable is now private
    // to keep count of how many object we created 
    // with the Static data type
    private static int numberOfPeople = 0;
    public Person(String ageParam, String nameParam, String emailParam){
        age = ageParam;
        name = nameParam;
        email = emailParam;
        numberOfPeople++;
    }

    
    // getter 
    public void getUserInfo(){
        System.out.println("FullName:" + name + "\n Age: "+ age + "\n Email:"+ email);
    }
    // setter
    public String setName(String changeNamed){
        name = changeNamed;
        System.out.println("Your name has change");
        return name;
    }
    public static int peopleCount() {
        return numberOfPeople;
    }
}
