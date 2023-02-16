package section5;

public class IfElseStatement {

    public static void main(String[] args) {
        boolean condition = true;

        if (condition) {
            System.out.println("Condition is true");
        } else {
            System.out.println("Condition is false");
        }

        int number = 5;
        String numberText = "Unknown number";

        if (number == 1) {
            numberText = "Number one";
        } else if (number == 2) {
            numberText = "Number two";
        } else if (number == 3) {
            numberText = "Number three";
        } else if (number == 4) {
            numberText = "Number four";
        } else {
            numberText = "Number not found";
        }

        System.out.println("numberText = " + numberText);
    }

}
