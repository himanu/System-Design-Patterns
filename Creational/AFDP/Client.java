package Creational.AFDP;

import Creational.AFDP.GUIComponents.Button.ButtonI;
import Creational.AFDP.GUIComponents.Cursor.CursorI;
import Creational.AFDP.Factory.GUIFactory;

/**
 * Client is not aware of concrete Factory and concrete product classes
 */
public class Client {
    private GUIFactory f;
    public Client(GUIFactory f) {
        this.f = f;
    }

    public void run() {
        ButtonI btn = f.createButton();
        CursorI cursor = f.createCursor();
        btn.spellYourName();
        cursor.spellYourName();
    }
}
