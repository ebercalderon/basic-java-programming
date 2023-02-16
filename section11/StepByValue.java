package section11;

public class StepByValue {

    public static void main(String[] args) {
        var x = 10;
        System.out.println("x = " + x);

        valueChange(x);

        System.out.println("x new value = " + x);
    }

    public static void valueChange(int arg1) {
        System.out.println("arg1 = " + arg1);
        arg1 = 15;
    }
}
