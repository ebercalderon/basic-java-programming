package section10.box;

public class Box {
    int width;
    int height;
    int depth;

    public Box() {
    }

    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public int calculateVolume() {
        return width * height * depth;
    }
}
