package Creational.AFDP;

public class WindowsGUIFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }
    public Cursor createCursor() {
        return new WindowsCursor();
    }
}
