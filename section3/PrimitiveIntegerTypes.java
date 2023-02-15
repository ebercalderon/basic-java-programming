package section3;

public class PrimitiveIntegerTypes {

    public static void main(String args[]) {
        /*
            Primitive integer types: byte, short, int, long
         */
        byte numeroByte = (byte) 129; // Byte.MAX_VALUE -> 128
        System.out.println("Byte value:" + numeroByte);
        System.out.println("Byte minimum value:" + Byte.MIN_VALUE);
        System.out.println("Byte maximum value:" + Byte.MAX_VALUE);

        short numeroShort = (short)32768; // Short.MAX_VALUE -> 32767
        System.out.println("Short number = " + numeroShort);
        System.out.println("Short minimum value:" + Short.MIN_VALUE);
        System.out.println("Short maximum value:" + Short.MAX_VALUE);

        int numeroInt = (int)2147483648L;
        System.out.println("Int number = " + numeroInt);
        System.out.println("Int minimum value:" + Integer.MIN_VALUE);
        System.out.println("Int maximum value:" + Integer.MAX_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("Long number = " + numeroLong);
        System.out.println("Long minimum value:" + Long.MIN_VALUE);
        System.out.println("Long maximum value:" + Long.MAX_VALUE);
    }

}
