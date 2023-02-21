package section16.domain;

import java.util.Date;

public class Customer extends Person {
    private int idCustomer;
    private Date registrationDate;
    private boolean vip;
    private static int customerCounter;

    public Customer(String name, char gender, int age, String address, Date registrationDate, boolean vip) {
        super(name, gender, age, address);
        this.idCustomer = ++Customer.customerCounter;
        this.registrationDate = registrationDate;
        this.vip = vip;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public static int getCustomerCounter() {
        return customerCounter;
    }

    public static void setCustomerCounter(int customerCounter) {
        Customer.customerCounter = customerCounter;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Customer{");
        sb.append("idCustomer=").append(idCustomer);
        sb.append(", registrationDate=").append(registrationDate);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
