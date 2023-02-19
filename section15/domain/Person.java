package section15.domain;

public class Person {
    private int idPerson;
    private String name;
    private static int peopleCounter;

    public Person(int idPerson, String name) {
        this.idPerson = idPerson;
        this.name = name;
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
}
