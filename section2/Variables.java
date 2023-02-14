package section2;

import java.util.Scanner;

public class Variables {

    /*
    Shortcuts.
        ctrl + CLICK : variable definition location
        ctrl + SPACE : variable selection
        psvm + TAB  -> public static void main
        sout + TAB  -> System.out.println
     */
    public static void main(String[] args) {
        String title = "Book";
        String author = "Eber";
        System.out.println(title + " was written by " + author);

        // variable definition
        int myIntegerVariable = 10;
        System.out.println(myIntegerVariable);

        // variable value modification
        myIntegerVariable = 5;
        System.out.println(myIntegerVariable);

        String myStringVariable = "greetings";
        System.out.println(myStringVariable);

        // var - type inference in java
        var myIntegerVariable2 = 15;
        System.out.println(myIntegerVariable2);

        /*
         Rules for defining variables.
            var myVariable = 1;
            var _myVariable = 2;
            var $myVariable = 3:
         */

        // Concatenation: Left to right evaluation (string context) and parenthesis (priority)
        // Special characters: \n,\t,\b, \', \"

        // Scanner class
        System.out.println("Enter your name: ");
        Scanner console = new Scanner(System.in);
        // Type inference - Java 10
        var user = console.nextLine();
        System.out.println("user = " + user); // soutv + TAB -> Prints a value

    }

}
