package section2;

import java.util.Scanner;

public class ConsoleScanner {

    public static void main(String args[]) {
        System.out.println("Enter your name:");
        Scanner console = new Scanner(System.in);
        var user = console.nextLine();
        System.out.println("User = " + user);
        System.out.println("Enter a title:");
        var title = console.nextLine();
        System.out.println("Result: " + title + " " + user);
    }

}
