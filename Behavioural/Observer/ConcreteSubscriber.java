package Behavioural.Observer;

public class ConcreteSubscriber implements Subscribers{
    String name;

    ConcreteSubscriber(String name) {
        this.name = name;
    }
    public void update(String message) {
        System.out.println("Notification to " + this.name + ": " + message);
    }
}
