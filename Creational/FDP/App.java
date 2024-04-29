package Creational.FDP;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        PizzaFactory factory = new ConcretePizzaFactory();
        Pizza p = factory.createPizza("Paneer");
        p.getProductName();
    }
}
