package section15.domain;

public class Person {
    private int idPerson;
    private String name;
    private static int peopleCounter;

    public Person(String name) {
        this.name = name;
        // Increase the counter for each new object
        Person.peopleCounter++;
        // Assign the new value to the idPerson variable
        this.idPerson = Person.peopleCounter;

    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getPeopleCounter() {
        return peopleCounter;
    }

    public static void setPeopleCounter(int peopleCounter) {
        Person.peopleCounter = peopleCounter;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idPerson=" + idPerson +
                ", name='" + name + '\'' +
                '}';
    }
}
