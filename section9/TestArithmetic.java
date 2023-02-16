package section9;

public class TestArithmetic {

    public static void main(String[] args) {

        Arithmetic arithmetic1 = new Arithmetic();
        System.out.println("arithmetic1 a: " + arithmetic1.a);
        System.out.println("arithmetic1 b: " + arithmetic1.b);

        Arithmetic arithmetic2 = new Arithmetic(5, 8);
        System.out.println("arithmetic2 a: " + arithmetic2.a);
        System.out.println("arithmetic2 b: " + arithmetic2.b);

    }

}
