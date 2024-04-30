package Creational.AFDP.Factory;

import Creational.AFDP.GUIComponents.Button.ButtonI;
import Creational.AFDP.GUIComponents.Button.WindowsButton;
import Creational.AFDP.GUIComponents.Cursor.CursorI;
import Creational.AFDP.GUIComponents.Cursor.WindowsCursor;

public class WindowsGUIFactory implements GUIFactory {
    public ButtonI createButton() {
        return new WindowsButton();
    }
    public CursorI createCursor() {
        return new WindowsCursor();
    }
}
