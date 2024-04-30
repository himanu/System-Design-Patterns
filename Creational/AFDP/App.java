package Creational.AFDP;

import Creational.AFDP.Factory.GUIFactory;
import Creational.AFDP.Factory.MacGUIFactory;

public class App {
    public static void main(String[] args) {
        GUIFactory fac = new MacGUIFactory();
        Client client = new Client(fac);
        client.run();
    }
}
