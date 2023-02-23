package section19.test;

import section19.domain.Person;

public class TestFinal {

    public static void main(String[] args) {
        final int myVariable = 10;
        System.out.println("myVariable = " + myVariable);
        //myVariable = 5;

        //Person.CONSTANT = 5;
        System.out.println("CONSTANT = " + Person.CONSTANT);

        final Person person1 = new Person();
        //person1 = new Person();
        person1.setName("Juan");
        System.out.println("person1 name = " + person1.getName());
        person1.setName("Carlos");
        System.out.println("person1 name = " + person1.getName());
    }

}
