package Behavioural.Iterator;
import java.util.ArrayList;
import java.util.List;

public class MyList implements Aggregate {
    private List<String> list = new ArrayList<>();

    public Iterator getIterator() {
        return new ListIterator(this);
    }

    public void addElement(String element) {
        this.list.add(element);
    }

    public List<String> getList() {
        return this.list;
    }
}
