package section15.test;

import section15.domain.Person;

public class TestPerson {

    public static void main(String[] args) {
        Person person1 = new Person("Juan");
        System.out.println("person1 = " + person1.toString());

        Person person2 = new Person("Karla");
        System.out.println("person2 = " + person2.toString());
    }

}
