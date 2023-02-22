package section17.test;

import section17.operations.Operations;

public class TestOperations {

    public static void main(String[] args) {
        var result1 = Operations.add(5, 3);
        System.out.println("result1 = " + result1);

        var result2 = Operations.add(2.0, 3);
        System.out.println("result2 = " + result2);

        var result3 = Operations.add(3, 5L);
        System.out.println("result3 = " + result3);
    }

}
