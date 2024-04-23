package Creational.FDP;

public class Product1Creator extends Factory {
    Product createProduct() {
        return new ConcreteProduct1();
    }
}
