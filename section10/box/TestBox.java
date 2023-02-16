package section10.box;

public class TestBox {

    public static void main(String[] args) {
        int width = 3;
        int height = 2;
        int depth = 6;

        Box box1 = new Box();
        box1.width = width;
        box1.height = height;
        box1.depth = depth;
        int result = box1.calculateVolume();

        System.out.println("Volume of box 1: " + result);

        Box box2 = new Box(2, 4, 6);
        System.out.println("Volume of box 2: " + box2.calculateVolume());
    }

}
