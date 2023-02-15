package section3;

public class PrimitiveFloatingTypes {

    public static void main(String[] args) {
        /*
            Floating point primitive types: float and double
        */
        float numeroFloat = (float) 3.4028235E38D;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Minimum value for float type: " + Float.MIN_VALUE);
        System.out.println("Maximum value for float type: " + Float.MAX_VALUE);

        double numeroDouble = 1.7976931348623157E308;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Minimum value for double type: " + Double.MIN_VALUE);
        System.out.println("Maximum value for double type: " + Double.MAX_VALUE);
    }

}
