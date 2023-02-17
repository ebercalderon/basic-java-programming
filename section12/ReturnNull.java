package section12;


import section11.classes.Person;

public class ReturnNull {

    public static void main(String[] args) {

//        Person person1 = new Person();
        Person person1 = null;
//        person1.name = "Juan";
//        System.out.println("person1 name = " + person1.name);
        person1 = valueChange(person1);
//        System.out.println("change of person1 name = " + person1.name);

    }

    public static Person valueChange(Person person) {
        if (person == null) {
            System.out.println("Invalid person value: null");
            return null;
        }
        person.name = "Karla";
        return person;
    }

}
