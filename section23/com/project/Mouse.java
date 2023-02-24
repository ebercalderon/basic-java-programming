package section23.com.project;

public class Mouse extends InputDevice {
    private final int idMouse;
    private static int counterMouses;

    public Mouse(String inputType, String brand) {
        super(inputType, brand);
        this.idMouse = ++Mouse.counterMouses;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "idMouse=" + idMouse +
                ", " + super.toString() +
                '}';
    }
}
