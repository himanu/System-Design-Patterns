package Creational.FDP;

public class Product2Creator extends Factory {
    Product createProduct() {
        return new ConcreteProduct2();
    }
}
