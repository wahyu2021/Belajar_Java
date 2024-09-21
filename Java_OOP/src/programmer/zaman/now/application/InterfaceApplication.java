package programmer.zaman.now.application;

import programmer.zaman.now.data.Avanza;

public class InterfaceApplication{
    public static void main(String[] args) {
        Avanza avanza = new Avanza();
        avanza.setBrand("Avanza");
        avanza.setDriver("Andinn");

        avanza.drive();
    }
}
