# Factory Method Design Pattern
1. It is a creational design pattern
2. It is used when we have a bunch of classes of the same type and we need to create an object of one of them using some logic.

[**Above Example Guide**](#example-code)

## What Problem does it solve?
1. Consider an Application for a Piza Restaurant.
2. The Application would have a Pizza class and various subclasses for each Pizza type like ChilliPiza, PaneerPiza, CornPizza etc.
3. Right now, the Application uses some logic to decide the Pizza type to be created. 
4. If the application needs to create the Pizza in another class, we need to repeat the logic in that class also.
5. This approach is error-prone due to duplication of the logic.

## Solution
1. This pattern suggests this Pizza type decision logic to a separate class also known as Factory Class.
2. The Factory class must provide a method to create a Pizza. The type of Pizza created would depend on the logic of the method.
3. To make the application flexible to use other logic also, we can define an Interface for Factory Classes. This interface would have the method signature to create a Pizza.


## Class Structure

### Different Classes/Interfaces
1. **Concrete Product Classes**: Classes for Products the application wants to create. Foreg: ChilliPizza, MushroomPizza etc.
2. **Product Interface**:  Interface of all Product classes.
3. **Factory Classes**: These classes create a Product using some logic. Each Factory class has a different logic to decide which product to create. 
4. **Factory Interface**: Interface for all Factory Classes
3. **Client Class**: The client class.

### UML Diagram


## Example Code
The example is of a Home Builder application. `App.java` wants to create homes with different settings.
`Builder.java` provides methods to create `Home` objects in multiple steps.


 
