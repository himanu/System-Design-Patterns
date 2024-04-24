package Creational.FDP;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // with FDP
        Factory f = new Product1Creator();
        Product prod = f.createProduct();
        prod.getProductName();

        f = new Product2Creator();
        prod = f.createProduct();
        prod.getProductName();

        Product product = new ConcreteProduct1();
        product.getProductName();

        product = new ConcreteProduct2();
        product.getProductName();
    }
}
