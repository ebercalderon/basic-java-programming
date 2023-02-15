package section4;

public class UnitaryOperators {

    public static void main(String[] args) {
        int a = 3;
        int b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        boolean c = true;
        boolean d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        //increment
        //1.pre-increment (symbol before variable)
        int e = 3;
        int f = ++e;//variable is incremented first, then its value is used
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        //2.post increment (symbol after variable)
        int g = 5;
        int h = g++;//variable value is used first, then it is incremented
        System.out.println("g = " + g);//increment is pending
        System.out.println("h = " + h);

        //decrement
        //1.pre-decrement
        int i = 2;
        int j = --i;//variable is decremented first
        System.out.println("i = " + i);//already decremented
        System.out.println("j = " + j);

        //2.post-decrement
        int k = 4;
        int l = k--;//variable value is used first, then decrement is pending
        System.out.println("k = " + k);//decrement is pending
        System.out.println("l = " + l);
    }

}
