package programmer.zaman.now.data;

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

    public String toString(){
        return "Product name: " + getName() + "\nPrice: " + getPrice();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Product)) return false;

        Product product = (Product) obj;

        if(price != product.price) return false;
        return name != null ? name.equals(product.name) : product.name == null;
    }
}
