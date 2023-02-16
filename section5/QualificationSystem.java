package section5;

import java.util.Scanner;

public class QualificationSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide a value between 0 and 10:");
        int grade = Integer.parseInt(scanner.nextLine());

        //If it's between 9 and 10 print: A
        if (grade >= 9 && grade <= 10)
            System.out.println("A");
        //If it's between 8 and less than 9 print: B
        else if (grade >= 8 && grade < 9)
            System.out.println("B");
        //If it's between 7 and less than 8 print: C
        else if (grade >= 7 && grade < 8)
            System.out.println("C");
        //If it's between 6 and less than 7 print: D
        else if (grade >= 6 && grade < 7)
            System.out.println("D");
        //If it's between 0 and less than 6 print: F
        else if (grade >= 0 && grade < 6)
            System.out.println("F");
        //If it's not within the range, print: Unknown value
        else
            System.out.println("Unknown value");
    }

}
