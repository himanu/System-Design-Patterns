package Creational.AFDP;

public class MacGUIFactory implements GUIFactory {
    public Button createButton() {
        return new MacButton();
    }
    public Cursor createCursor() {
        return new MacCursor();
    }
}
