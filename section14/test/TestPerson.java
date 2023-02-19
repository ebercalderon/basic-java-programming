package section14.test;

import section14.domain.Person;

public class TestPerson {

    public static void main(String[] args) {
        Person person1 = new Person("Juan", 5000.0, false);
//        System.out.println("person1 name = " + person1.getName());
        System.out.println("person1 = " + person1);
        person1.setName("Juan Carlos");
        //person1.name = "Juan Carlos";
        //System.out.println("name = " person1.name);
//        System.out.println("person1 with name change  = " + person1.getName());
//        System.out.println("person1 salary = " + person1.getSalary());
//        System.out.println("person1 deleted = " + person1.isDeleted());}
        System.out.println("person1 = " + person1);
    }

}
