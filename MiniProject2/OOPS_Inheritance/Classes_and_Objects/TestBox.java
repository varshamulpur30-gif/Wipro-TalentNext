public class TestBox {
    public static void main(String[] args) {
        Box b = new Box(10, 5, 2);

        System.out.println("Width = " + b.width);
        System.out.println("Height = " + b.height);
        System.out.println("Depth = " + b.depth);
        System.out.println("Volume = " + b.getVolume());
    }
}