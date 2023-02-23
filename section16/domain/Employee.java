package section16.domain;

public class Employee extends Person {
    private int idEmployee;
    private double salary;
    private static int employeeCounter;

    public Employee(String name, double salary) {
        super(name);
        this.idEmployee = ++Employee.employeeCounter;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static int getEmployeeCounter() {
        return employeeCounter;
    }

    public static void setEmployeeCounter(int employeeCounter) {
        Employee.employeeCounter = employeeCounter;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("idEmployee=").append(this.idEmployee);
        sb.append(", salary=").append(this.salary);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
