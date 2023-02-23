package section22.pe.com.sales.test;

import section22.pe.com.sales.*;

public class SalesTest {

    public static void main(String[] args) {
        Product product1 = new Product("Shirt", 50.00);
        Product product2 = new Product("Pant", 100.00);

        Order order1 = new Order();
        order1.addProduct(product1);
        order1.addProduct(product2);

        order1.showOrder();
    }

}
