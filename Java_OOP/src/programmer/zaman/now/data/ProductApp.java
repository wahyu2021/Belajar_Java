package programmer.zaman.now.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Indomie Goreng", 3500);
        System.out.println(product.getName());
        System.out.println(product.getPrice());
    }
}
