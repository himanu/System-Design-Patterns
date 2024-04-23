package Creational.FDP;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Factory f = new Product1Creator();
        Product prod = f.createProduct();
        prod.getProductName();

        f = new Product2Creator();
        prod = f.createProduct();
        prod.getProductName();
    }
}
