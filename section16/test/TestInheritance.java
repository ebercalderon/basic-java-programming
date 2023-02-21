package section16.test;

import section16.domain.Customer;
import section16.domain.Employee;

import java.util.Date;

public class TestInheritance {

    public static void main(String[] args) {
//        Employee employee1 = new Employee("Carlos", 1025);
//        System.out.println("employee1 = " + employee1);
        var date = new Date();

        Customer customer1 = new Customer("Juan", 'M', 18, "742 Evergreen Terrace", date, true);
        System.out.println("customer1 = " + customer1);
    }

}
