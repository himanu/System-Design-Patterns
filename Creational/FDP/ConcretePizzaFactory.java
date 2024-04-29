package Creational.FDP;

public class ConcretePizzaFactory extends PizzaFactory {
    public Pizza createPizza(String type) {
        if (type == "Paneer")
            return new PaneerPizza();
        else 
            return new OnionPizza();
    }
}
