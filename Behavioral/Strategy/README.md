
# Strategy Design Pattern
It is used when we have different strategies/algorithm

[**Above Example Guide**](#example-code)

## What Problem does it solve?
1. Consider the direction feature of the Google Map application. The direction feature displays the shortest path to reach the destination via different modes.
2. The implementation of the feature without the Strategy Pattern would be like below.
3. The GoogleMap class would have a method to find the shortest path.
4. This method would use conditional statements to consider all transport modes (like Walk, Car, Bicycle etc).
5. If we keep on adding new transport modes, the method size will also keep on increasing.
6. This is not scalable and our code will be hard to read.

## Solution
1. We can have multiple classes for each mode to calculate the shortest path. Each class is known as Strategy Class.
2. All Strategy classes would implement an interface. The interface must have a method that the client would use to find the shortest path.
3. The Client would stores an Object of type Strategy Interface. Through this object, it would find the shortest path.
4. The client is decoupled from Strategy Classes, it depends on their interface. So we can add new Strategy classes without modifying the Client class. Hurrah! our code is now scalable 😊.

## Class Structure

### Different Classes/Interfaces
1. **Strategy Interface**: Interface for all strategy classes. It must have a method that allows the client to use the strategy implemented in Strategy Classes.
2. **Strategy Classes**: Classes that are implementing the Strategy Interface. There is a separate Strategy class for each strategy/algorithm.
4. **Context Class**: The context class uses strategies using the Strategy Interface object. It has a Strategy Interface object.

### UML Diagram
![alt text](<Screenshot 2024-04-28 at 6.49.30 PM.png>)

## Example Code
1. The example is a simple calculator. The `context.java` is a Context Class, it is the main class that our application wants to use.
2. The `context.java` has a method `execute`, its behavior depends on the strategy. It stores an object of type `Strategy`.
3. The `Strategy.java` is an interface for all strategy classes.
4. `AdditionStrategy.java` and `Multiplication.java` classes define two strategies.
5. The `Application.java` creates an object of type `AdditionStrategy` and uses it in the `Context` class.
 