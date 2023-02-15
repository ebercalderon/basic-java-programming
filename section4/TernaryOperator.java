package section4;

public class TernaryOperator {

    public static void main(String[] args) {
        var result = (1 > 2) ? "true" : "false";
        System.out.println("result = " + result);

        var number = 9;
        result = (number % 2 == 0) ? "even number" : "odd number";
        System.out.println("result = " + result);
    }

}
