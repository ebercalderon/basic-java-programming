package section13;

public class WordThis {

    public static void main(String[] args) {
//        Person person1 = new Person( new String("Juan"), "Perez");
        Person person1 = new Person( "Juan", "Perez");
        System.out.println("person1 = " + person1);
        System.out.println("person1 name = " + person1.name);
        System.out.println("person1 last name = " + person1.lastName);

    }

}

class Person {
    String name;
    String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        System.out.println("person object using this = " + this);
    }
}
