package Behavioral.Iterator;

public class Application {
    public static void main(String[] args) {
        MyList collection = new MyList();
        collection.addElement("Ball");
        collection.addElement("Dog");
        collection.addElement("Apple");
        Iterator iterator = collection.getIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
