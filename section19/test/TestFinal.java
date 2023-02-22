package section19.test;

import section19.domain.Person;

public class TestFinal {

    public static void main(String[] args) {
        final int myVariable = 10;
        System.out.println("myVariable = " + myVariable);
        //myVariable = 5;

        //Person.CONSTANT = 5;
        System.out.println("CONSTANT = " + Person.CONSTANT);
    }

}
