package section7;

public class TestPerson {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Juan";
        person1.lastName = "Perez";
        person1.displayInformation();

        Person person2 = new Person();

        System.out.println("person1 = " + person1);
        System.out.println("person2 = " + person2);

        person2.displayInformation();
        person2.name = "Karla";
        person2.lastName = "Lara";
        person2.displayInformation();
    }

}
