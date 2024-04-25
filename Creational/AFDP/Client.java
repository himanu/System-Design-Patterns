package Creational.AFDP;
/**
 * Client is not aware of concrete Factory and concrete product classes
 */
public class Client {
    private GUIFactory f;
    public Client(GUIFactory f) {
        this.f = f;
    }

    public void run() {
        Button btn = f.createButton();
        Cursor cursor = f.createCursor();
        btn.spellYourName();
        cursor.spellYourName();
    }
}
