# Observer Design Pattern
It is used when we need to publish event to subscriber classes.

[**Above Example Guide**](#example-code)

## What Problem it solves?
1. Consider a Customer class and a Shoe Store class.
2. The customer wants to know the availability of his favourite sneakers.
3. Customer visits the Store on daily basis to know the availability.
4. Clearly this is not efficient.

## Solution
1. Instead of customer going to Shoe Store, Shoe store would notify him/her whenever interested sneakers become available.
2. The solution follows a Publisher/Subscriber Model. 
3. Subscribers can subscribe to events published by the Publisher.
4. Publisher would notify all subscriber about interested event.

## Class Structure

### Different Classes/Interfaces
1. **Publisher Class**: Apart from its buisness logic, it stores list of subscribers and has a method to notify them. It should have method to subscribe and unsubscribe.
2. **Subscriber Interface**: It is the interface implemented by different subscriber classes. In case we have only one type of subscriber then there is no need of it. Mostly it has a method to allow publisher class notify it above new events.
3. **Concreate Subscriber Classes**: Concrete implementations of the Subscriber Interface.
4. **Client Class**: Contains client code to use pattern.

### UML Diagram
![alt text](<Screenshot 2024-04-28 at 5.05.02 PM.png>)

## Example Code
The example is of an Editor application. On save operation, it sends notifications to all its listeners. The buisness logic of Editor resides in `Editor.java` class and `EditorEventManager.java` is used to store subscribers and send notification to them.

Above Example have below files for each type of class.
1. `Subscriber.java` representing `Subscriber` interface in the above UML Diagram Image.
2. Similarly `ConcreteSubscriber.java` representing `Concrete Subscriber` class.
3. Similarly `Editor.java` contains buisness logic of Editor and it stores `EditorEventManager` object.
4. Similarly `EditorEventManager.java` stores and notify subscribers.
5. Similarly `Application.java` representing `Client` class.