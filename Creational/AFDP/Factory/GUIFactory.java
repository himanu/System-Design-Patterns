package Creational.AFDP.Factory;

import Creational.AFDP.GUIComponents.Button.ButtonI;
import Creational.AFDP.GUIComponents.Cursor.CursorI;

public interface GUIFactory {
    ButtonI createButton();
    CursorI createCursor();
}