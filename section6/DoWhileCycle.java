package section6;

public class DoWhileCycle {

    public static void main(String[] args) {
        /*
        var counter = 0;
        while (counter < 3){
            System.out.println("counter = " + counter);
            counter++;
        }
        */

        var counter = 0;
        do {
            System.out.println("counter = " + counter);
            counter++;
        } while (counter < 3);
    }

}
