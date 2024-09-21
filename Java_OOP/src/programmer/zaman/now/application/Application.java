package programmer.zaman.now.application;

import programmer.zaman.now.data.Product;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("Teh Pucuk", 4_500);
        System.out.println(product.getName());
        System.out.println(product.getPrice());
    }

}
