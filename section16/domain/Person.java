package section16.domain;

public class Person {
    protected String name;
    protected char gender;
    protected int age;
    protected String address;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, char gender, int age, String address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", gender=").append(gender);
        sb.append(", age=").append(age);
        sb.append(", address='").append(address).append('\'');
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
