package section4;

public class PrecedenceOperators {

    public static void main(String[] args) {
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        var result = 4 + 5 * 6 / 3;//4 + ((5*6)/3)
        System.out.println("result = " + result);//14

        result = (4 + 5) * 6 / 3;
        System.out.println("result = " + result);
    }

}
