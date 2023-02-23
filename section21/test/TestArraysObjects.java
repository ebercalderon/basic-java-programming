package section21.test;

import section21.domain.Person;

public class TestArraysObjects {

    public static void main(String[] args) {
        Person[] people = new Person[2];

        people[0] = new Person("Juan");
        people[1] = new Person("Carlos");

        System.out.println("person 0 = " + people[0]);
        System.out.println("person 1 = " + people[1]);

        for (int i = 0; i < people.length; i++) {
            System.out.println("person element " + i + " = " + people[i]);
        }

        String[] fruits = {"Orange", "Banana", "Grape"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("fruit " + i + " = " + fruits[i]);
        }

    }

}
