package Behavioral.Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EditorEventManager {
    private List<Subscribers> subscribers = new ArrayList<>();

    public void notifySubscribers(String message) {
        Iterator<Subscribers> iterator = this.subscribers.iterator();
        while(iterator.hasNext()) {
            iterator.next().update(message);
        }
    }

    public void addSubscriber(Subscribers s) {
        this.subscribers.add(s);
    }
}
