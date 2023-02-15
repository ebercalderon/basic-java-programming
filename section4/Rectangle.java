package section4;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your solution here
        System.out.println("Enter the height:");
        int height = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the width:");
        int width = Integer.parseInt(scanner.nextLine());
        int area = height * width;
        int perimeter = (height + width) * 2;
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

}
