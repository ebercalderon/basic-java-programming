package section4;

public class EqualityOperators {

    public static void main(String[] args) {
        int a = 3;
        int b = 2;

        boolean c = (a == b);
        System.out.println("c = " + c);

        boolean d = a != b;
        System.out.println("d = " + d);

        String cadena = "Hello";
        String cadena2 = "Hello";
        boolean e = cadena == cadena2; //compare object references
        System.out.println("e = " + e);

        boolean f = cadena.equals(cadena2); //compare string contents
        System.out.println("f = " + f);

    }

}
