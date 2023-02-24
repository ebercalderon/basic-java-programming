package section23.com.project;

public class Monitor {
    private final int idMonitor;
    private String brand;
    private double size;
    private static int counterMonitors;

    private Monitor() {
        this.idMonitor = ++Monitor.counterMonitors;
    }

    public Monitor(String brand, double size) {
        this();
        this.brand = brand;
        this.size = size;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", brand='" + brand + '\'' +
                ", size=" + size +
                '}';
    }
}
