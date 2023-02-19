package section14.domain;

public class Person {
    private String name;
    private double salary;
    private boolean deleted;

    public Person(String name, double salary, boolean deleted) {
        this.name = name;
        this.salary = salary;
        this.deleted = deleted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", deleted=" + deleted +
                '}';
    }
}
