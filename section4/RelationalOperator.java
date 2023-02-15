package section4;

public class RelationalOperator {

    public static void main(String[] args) {
        int a = 3;
        int b = 2;

        boolean c = (a == b);
        System.out.println("c = " + c);

        boolean d = a != b;
        System.out.println("d = " + d);

        String cadena = "Hola";
        String cadena2 = "Hola";
        boolean e = cadena == cadena2; // compares object references
        System.out.println("e = " + e);

        boolean f = cadena.equals(cadena2); // compare string content
        System.out.println("f = " + f);

        boolean g = a >= b; // greater than > or greater than or equal to >=
        System.out.println("g = " + g);

        if (a % 2 == 0) {
            System.out.println("It's an even number");
        } else {
            System.out.println("It's an odd number");
        }

        int age = 10;
        int adultAge = 18;
        if (age >= adultAge) {
            System.out.println("It's an adult");
        } else {
            System.out.println("It's a minor");
        }
    }

}
