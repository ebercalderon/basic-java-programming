package section20.test;

public class TestArrays {

    public static void main(String[] args) {
        int[] ages = new int[3];
        System.out.println("ages = " + ages);

        ages[0] = 10;
        System.out.println("ages 0 = " + ages[0]);

        // ages[3] = 5;

        for (int i = 0; i < ages.length; i++) {
            System.out.println("age element " + i + " = " + ages[i]);
        }
    }

}
