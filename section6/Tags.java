package section6;

public class Tags {

    public static void main(String[] args) {
        start:
        for (var counter = 0; counter < 3; counter++) {
            if (counter % 2 != 0) {
                continue start; // go to the line of code of the label
            }
            System.out.println("counter = " + counter);
        }
        /*
        for (var counter = 0; counter < 3; counter++) {
            if (counter % 2 != 0) {
                continue; // go to next iteration
            }
            System.out.println("counter = " + counter);
        }

        var counter = 0;
        while (counter < 3){
            System.out.println("counter = " + counter);
            counter++;
        }

        var counter = 0;
        do{
            System.out.println("counter = " + counter);
            counter++;
        }while( counter < 3);


        for( var counter = 0 ; counter < 3 ; counter++ ){
            System.out.println("counter = " + counter);
        }
        */
    }

}
