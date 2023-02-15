package section3;

import java.util.Scanner;

public class TypeConversions {

    public static void main(String[] args) {
        // Convert String type to int type
        var age = Integer.parseInt("20");
        // var age = "20";
        System.out.println("age = " + (age + 1));

        var piValue = Double.parseDouble("3.1416");
        System.out.println("piValue = " + piValue);

        // Request a value
        var console = new Scanner(System.in);
        // System.out.println("Provide your age:");
        // age = Integer.parseInt( console.nextLine() );
        // System.out.println("age = " + age);

        var ageText = String.valueOf(10);
        System.out.println("ageText = " + ageText);

        var character = "hello".charAt(1);
        System.out.println("character = " + character);

        System.out.println("Provide a character:");
        character = console.nextLine().charAt(0);
        System.out.println("character = " + character);
    }

}
