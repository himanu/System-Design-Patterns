package Creational.AFDP.Factory;

import Creational.AFDP.GUIComponents.Button.ButtonI;
import Creational.AFDP.GUIComponents.Button.MacButton;
import Creational.AFDP.GUIComponents.Cursor.CursorI;
import Creational.AFDP.GUIComponents.Cursor.MacCursor;

public class MacGUIFactory implements GUIFactory {
    public ButtonI createButton() {
        return new MacButton();
    }
    public CursorI createCursor() {
        return new MacCursor();
    }
}
