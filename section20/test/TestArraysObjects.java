package section20.test;

import section20.domain.Person;

public class TestArraysObjects {

    public static void main(String[] args) {
        Person[] people = new Person[2];

        people[0] = new Person("Juan");
        people[1] = new Person("Carlos");

        System.out.println("person 0 = " + people[0]);
        System.out.println("person 1 = " + people[1]);
    }

}
