package Behavioral.Observer;

public class Application {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.notificationManager.addSubscriber(new ConcreteSubscriber("Subscriber 1"));
        editor.notificationManager.addSubscriber(new ConcreteSubscriber("Subscriber 2"));

        editor.save();
    }
}
