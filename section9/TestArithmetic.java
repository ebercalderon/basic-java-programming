package section9;

public class TestArithmetic {

    public static void main(String[] args) {

        Arithmetic arithmetic1 = new Arithmetic();

        arithmetic1.a = 3;
        arithmetic1.b = 2;
        arithmetic1.add();

        var result = arithmetic1.addWithReturn();
        System.out.println("result from the test = " + result);

        result = arithmetic1.addWithArguments(5, 8);
        System.out.println("result using arguments = " + result);

    }

}
