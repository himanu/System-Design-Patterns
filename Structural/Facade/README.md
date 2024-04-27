# Facade Design Pattern
1. It is used to hide complexities
2. It provides a simple interface to a library, a framework or a complex set of classes

## Problem
Imagine our client code is a library class objects. It is initializing object, managing them and calling methods in a particular order.
When we have lot of objects of the library then the code become messy and the buisness logic is coupled with the library.

To resolves this, we can define interface managing, and initializing the library classes objects. It hides the complexity and make the client decoupled from the library.

## Use Cases
1. When we need a simple interface to a complex subsystem
2. Use the Facade when you want to structure a subsystem into layers. We can reduce coupling between multiple subsystems by requiring them to communicate only through facades.

1. **Facade class handles the subsystem initialization**
2. **The client class should be unaware of the subsystem.**
3. **When the facade size become too big we can extract some part of code other facade**

## UML Diagram
![alt text](<Screenshot 2024-04-27 at 10.39.48 AM.png>)
