package section4;

public class ConditionalOperators {

    public static void main(String[] args) {
        int a = 8;
        int minValue = 0;
        int maxValue = 10;

        boolean result = a >= 0 && a <= 10;
        if (result) {
            System.out.println("Within range");
        } else {
            System.out.println("Out of range");
        }

        boolean onVacation = false;
        boolean dayOff = true;

        if (onVacation || dayOff) {
            System.out.println("Father can attend son's game");
        } else {
            System.out.println("Father is busy");
        }
    }

}
