package section23.test;

import section23.com.project.*;

public class TestProject {

    public static void main(String[] args) {
        Monitor monitorASUS = new Monitor("HP", 13);
        Keyboard keyboardASUS = new Keyboard("Bluetooth", "ASUS");
        Mouse mouseASUS = new Mouse("Bluetooth", "ASUS");
        Computer computerASUS = new Computer("Computer ASUS", monitorASUS, keyboardASUS, mouseASUS);

        Monitor monitorDELL = new Monitor("DELL", 13);
        Keyboard keyboardDELL = new Keyboard("Bluetooth", "DELL");
        Mouse mouseDELL = new Mouse("Bluetooth", "DELL");
        Computer computerDELL = new Computer("Computer DELL", monitorDELL, keyboardDELL, mouseDELL);

        Order order1 = new Order();
        order1.addComputer(computerASUS);
        order1.addComputer(computerDELL);

        order1.showOrder();
    }

}
