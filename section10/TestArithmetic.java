package section10;

public class TestArithmetic {

    public static void main(String[] args) {
        // Local variables
        var a = 10;
        var b = 2;
        myMethod();

        Arithmetic arithmetic1 = new Arithmetic();
        System.out.println("arithmetic1 a: " + arithmetic1.a);
        System.out.println("arithmetic1 b: " + arithmetic1.b);

        Arithmetic arithmetic2 = new Arithmetic(5, 8);
        System.out.println("arithmetic2 a: " + arithmetic2.a);
        System.out.println("arithmetic2 b: " + arithmetic2.b);

    }

    public static void myMethod() {
        // the variable 'a' is outside the scope where it was defined
        // a = 10
        System.out.println("another method");
    }

}
