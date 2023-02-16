package section11.classes;

public class Person {
    // Class attributes
    public String name;     // Not best practice - public
    public String lastName;

    //Class methods
    public void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Last Name: " + lastName);
    }
}
