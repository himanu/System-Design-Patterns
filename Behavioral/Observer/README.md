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
2. The solution follows a Publisher/Subscriber Model. Publisher would be Shoe Store and subscriber would be interested customers.
3. Subscribers can subscribe to events published by the Publisher.
4. The Publisher would notify all subscribers about interested events.

## Class Structure

### Different Classes/Interfaces
1. **Publisher Class**: Apart from its business logic, it stores a list of subscribers and has a method to notify them. It should have methods to allow subscribe and unsubscribe.
2. **Subscriber Interface**: It is the interface implemented by different subscriber classes. In case we have only one type of subscriber then there is no need for it. Mostly it has a method that the publisher object calls to notify it about the interested event.
3. **Concrete Subscriber Classes**: Concrete implementations of the Subscriber Interface.
4. **Client Class**: Contains client code to use pattern.

### UML Diagram
![alt text](<Screenshot 2024-04-28 at 5.05.02 PM.png>)

## Example Code
The example is of an Editor application. On save operation, it sends notifications to all its listeners. The business logic of Editor resides in `Editor.java` class and `EditorEventManager.java` is used to store subscribers and send notifications to them.

The `Application` class creates an `Editor` instance, adds two subscribers and invokes the `onSave` method. Subscribers are listening for the save operation, so at the end of it, the `Editor` class notifies all its subscribers about the operation through the `update` method defined on the `Subscriber` interface.