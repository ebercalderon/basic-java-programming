package section23.com.project;

public class Keyboard extends InputDevice {
    private final int idKeyboard;
    private static int counterKeyboards;

    public Keyboard(String inputType, String brand) {
        super(inputType, brand);
        this.idKeyboard = ++Keyboard.counterKeyboards;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "idKeyboard=" + idKeyboard +
                ", " + super.toString() +
                '}';
    }
}
