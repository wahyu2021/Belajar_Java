package programmer.zaman.now.application;

import programmer.zaman.now.data.City;

public class AbstractClassApp {
    public static void main(String[] args) {
        City city = new City();
        city.setName("Palembang");
        city.sayHello();
    }
}
