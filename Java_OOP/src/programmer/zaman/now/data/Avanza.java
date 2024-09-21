package programmer.zaman.now.data;

public class Avanza implements Car{
    private String driver;
    private String brand;

    @Override
    public void drive() {
        System.out.println(getDriver() + " is driving in " + getBrand());
    }

    @Override
    public String getBrand() {
        return this.brand;
    }

    public String getDriver() {
        return driver;
    }

    public void setBrand(String brand) {
        if(brand != null){
            this.brand = brand;
        }
    }

    public void setDriver(String driver) {
        if(driver != null){
            this.driver = driver;
        }

    }
}
