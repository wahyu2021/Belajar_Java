public class AppShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape.getCorner());

        shape = new Rectangle();
        System.out.println(shape.getCorner());
    }
}
