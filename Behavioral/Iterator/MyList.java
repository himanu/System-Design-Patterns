package Behavioral.Iterator;
import java.util.ArrayList;
import java.util.List;

public class MyList implements IterableCollection {
    private List<String> list = new ArrayList<>();

    public Iterator getIterator() {
        /** passes <>this</> to the iterator */
        return new ListIterator(this);
    }

    public void addElement(String element) {
        this.list.add(element);
    }

    public List<String> getList() {
        return this.list;
    }
}
