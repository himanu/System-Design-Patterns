package Behavioural.Iterator;

public class ListIterator implements Iterator {
    private MyList collection;
    private int position = 0;

    ListIterator(MyList collection) {
        this.collection = collection;
    }

    public boolean hasNext() {
        return position < this.collection.getList().size();
    }

    public String next() {
        if (this.hasNext()) {
            this.position += 1;
            return this.collection.getList().get(this.position - 1);
        } else {
            throw new IndexOutOfBoundsException("List iterator is traversed completely");
        }
    }
}
