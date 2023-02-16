package section11;


import section11.classes.Person;

public class StepByReference {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Juan";
        System.out.println("person1 name = " + person1.name);
        valueChange(person1);
        System.out.println("change of person1 name = " + person1.name);

    }

    public static void valueChange(Person person) {
        person.name = "Karla";
    }

}
