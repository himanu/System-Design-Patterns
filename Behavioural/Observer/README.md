# Observer Design Pattern
It is used when we need to publish events to subscriber classes.

[**Above Example Guide**](#example-code)

## What Problem does it solve?
1. Consider a Customer class and a Shoe Store class.
2. The customer wants to know the availability of his favorite sneakers.
3. The Customer visits the Store daily to know the availability.
4. Clearly, this is not efficient.

## Solution
1. Instead of the customer going to the Shoe Store, the store would notify him/her whenever interested sneakers become available.
2. The solution follows a Publisher/Subscriber Model. 
3. Subscribers can subscribe to events published by the Publisher.
4. The Publisher would notify all subscribers about interested events.

## Class Structure

### Different Classes/Interfaces
1. **Publisher Class**: Apart from its buisness logic, it stores a list of subscribers and has a method to notify them. It should have methods to subscribe and unsubscribe.
2. **Subscriber Interface**: It is the interface implemented by different subscriber classes. In case we have only one type of subscriber then there is no need for it. Mostly it has a method to allow the publisher class to notify it of new events.
3. **Concrete Subscriber Classes**: Concrete implementations of the Subscriber Interface.
4. **Client Class**: Contains client code to use pattern.

### UML Diagram
![alt text](<Screenshot 2024-04-28 at 5.05.02 PM.png>)

## Example Code
The example is of an Editor application. On save operation, it sends notifications to all its listeners. The buisness logic of Editor resides in `Editor.java` class and `EditorEventManager.java` is used to store subscribers and send notifications to them.

The Above Example has below files for each type of class.
1. `Subscriber.java` represents the `Subscriber` interface in the above UML Diagram Image.
2. Similarly, `ConcreteSubscriber.java` represents the `Concrete Subscriber` class.
3. `Editor.java` contains buisness logic of Editor and it stores a `EditorEventManager` object.
4. `EditorEventManager.java` stores and notifies subscribers and represents the `Publisher` class.
5. `Application.java` represents the  `Client` class.