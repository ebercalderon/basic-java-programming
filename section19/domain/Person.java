package section19.domain;

public final class Person {
    public final static int CONSTANT = 1;

    private String name;

    public void print() {
        System.out.println("Print method");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
