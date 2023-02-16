package section9;

public class Arithmetic {
    // Class attributes
    int a;
    int b;

    // Empty constructor
    public Arithmetic(){
        System.out.println("Executing constructor");
    }

    // Method
    public void add() {
        int result = a + b;
        System.out.println("result = " + result);
    }

    public int addWithReturn() {
        //int result = a + b;
        //return result;
        return this.a + this.b;

    }

    public int addWithArguments(int a, int b){
        this.a = a; // The argument an is assigned to the attribute this.a
        this.b = b;
        //return a + b;
        return this.addWithReturn();
    }
}
