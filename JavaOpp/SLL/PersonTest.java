import java.beans.PersistenceDelegate;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("10", "Tom", "Timwinyeboah@gmail.com");
        Person person2 = new Person("5", "williams", "tomyeboah@gmail.com");
        Person person3 = new Person("23","petter", "petter@Gmail.com");

        person1.getUserInfo();
        person1.setName("tony");
        person1.getUserInfo();
        System.out.println(Person.peopleCount());
    }
}