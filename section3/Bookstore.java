package section3;

import java.util.Scanner;

public class Bookstore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = scanner.nextLine();

        System.out.println("Enter id:");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter price:");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter free shipping (true/false):");
        boolean freeShipping = Boolean.parseBoolean(scanner.nextLine());

        System.out.println(name + " #" + id);
        System.out.println("Price: $" + price);
        System.out.println("Free Shipping: " + freeShipping);
    }

}
