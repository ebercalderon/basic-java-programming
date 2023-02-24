package section23.com.project;

public class Order {
    private final int idOrder;
    private Computer[] computers;
    private static int counterOrders;
    private static final int MAX_COMPUTERS = 10;
    private int counterComputers;

    public Order() {
        this.idOrder = ++Order.counterOrders;
        this.computers = new Computer[Order.MAX_COMPUTERS];
    }

    public void addComputer(Computer computer) {
        if (this.counterComputers < Order.MAX_COMPUTERS) {
            this.computers[this.counterComputers++] = computer;
        } else {
            System.out.println("You exceeded the limit = " + Order.MAX_COMPUTERS);
        }
    }

    public void showOrder() {
        System.out.println("Order : # " + this.idOrder);
        System.out.println("Computers: " + this.idOrder);
        for (int i = 0; i < this.counterComputers; i++) {
            System.out.println(this.computers[i]);
        }
    }
}
