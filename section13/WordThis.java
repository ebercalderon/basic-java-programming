package section13;

public class WordThis {

    public static void main(String[] args) {
//        Person person1 = new Person( new String("Juan"), "Perez");
        Person person1 = new Person("Juan", "Perez");
        System.out.println("person1 = " + person1);
        System.out.println("person1 name = " + person1.name);
        System.out.println("person1 last name = " + person1.lastName);

    }

}

class Person {
    // super(); call to the constructor of the Parent class (object)
    String name;
    String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        System.out.println("person object using this = " + this);
//        Print print = new Print();
        new Print().print(this);
    }
}

class Print {

    public Print() {
        super(); // call to the constructor of the Parent class (object)
    }

    public void print(Person person) {
        System.out.println("person from print = " + person);
        System.out.println("print current object (this) = " + this);
    }

}
