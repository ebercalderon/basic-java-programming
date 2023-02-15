package section4;

import java.util.Scanner;

public class GreaterTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide number1:");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Provide number2:");
        int number2 = Integer.parseInt(scanner.nextLine());
        System.out.println("The greater number is:");
        System.out.println(number1 > number2 ? number1 : number2);
    }

}
