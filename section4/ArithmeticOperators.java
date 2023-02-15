package section4;

public class ArithmeticOperators {

    public static void main(String[] args) {
        int a = 3, b = 2;
        var result = a + b;
        System.out.println("sum result = " + result);

        result = a - b;
        System.out.println("subtract result = " + result);

        result = a * b;
        System.out.println("multiplication result = " + result);

        var result2 = 3D / b;
        System.out.println("division result = " + result2);

        result = a % b;
        System.out.println("modulus result = " + result);

        if (b % 2 == 0)
            System.out.println("It is an even number");
        else
            System.out.println("It is an odd number");
    }

}
