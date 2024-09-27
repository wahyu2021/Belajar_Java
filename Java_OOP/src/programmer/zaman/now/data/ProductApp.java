package programmer.zaman.now.data;

import java.util.Objects;

public class ProductApp {
    public static void main(String[] args) {
        Product product1 = new Product("Ind Goreng", 3500);
        Product product2 = new Product("Indomie Goreng", 3500);
        System.out.println(product1);
        System.out.println(product2);

        System.out.println(product1.equals(product2));
        System.out.println(product1.hashCode() == product2.hashCode());
    }
}
