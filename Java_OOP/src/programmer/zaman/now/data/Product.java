package programmer.zaman.now.data;

import java.util.Objects;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "Product name: " + getName() + "\nPrice: " + getPrice();
    }


    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;

        return price == product.price && Objects.equals(name, product.name);
    }

    @Override
    public final int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + price;
        return result;
    }
}
