package section15.test;

import section15.domain.Person;

public class TestPerson {
    private int counter;

    public static void main(String[] args) {
        Person person1 = new Person("Juan");
        Person person2 = new Person("Karla");

        print(person1);
        print(person2);

        //this.counter = 10;
    }

    public static void print(Person person) {
        System.out.println("person = " + person);
    }

    public int getCounter() {
        print(new Person("Carlos"));
        return this.counter;
    }
}
