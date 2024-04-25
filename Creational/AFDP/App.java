package Creational.AFDP;

public class App {
    public static void main(String[] args) {
        GUIFactory fac = new MacGUIFactory();
        Client client = new Client(fac);
        client.run();
    }
}
