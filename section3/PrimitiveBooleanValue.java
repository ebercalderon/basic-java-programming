package section3;

public class PrimitiveBooleanValue {

    public static void main(String[] args) {
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);

        if (varBoolean) {
            System.out.println("The flag is true");
        } else {
            System.out.println("The flag is false");
        }

        int age = 10;
        //boolean isAdult = age >= 18;
        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a minor");
        }
    }

}
