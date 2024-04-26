package Creational.FDP;

public abstract class Factory {
    abstract Product createProduct();

    /** Factory class contains buisness logic also. It's main purpose is not to create object
     * but to use that object in some buisness logic
     */
    void someBuisnessLogic() {

    }
}
