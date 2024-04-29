package Behavioral.Observer;

public class Editor {
    public EditorEventManager notificationManager;

    Editor() {
        this.notificationManager = new EditorEventManager();
    }

    void save() {
        // logic to save data
        // notify subscribers
        this.notificationManager.notifySubscribers("Saved Successfully");
    }
}
