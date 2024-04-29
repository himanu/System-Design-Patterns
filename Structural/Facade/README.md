# Facade Design Pattern
1. It is used to hide the complexities of a subsystem/library.
2. It provides a simple interface to a library, a framework or a complex set of classes.

[**Sample Example**](#example-codes)

## Problem
1. Imagine our client code uses a library. It is initializing objects of the library, managing them and calling their methods in a particular order.
2. The client class should have buisness logic, but right now it majorly contains library usage code.
3. Also, for any new update in the library, the client class also needs an update.
4. This class design is not scalable.

## Solution
1. The Pattern solves the above problem by defining a Simple Interface/Class to the complex library/subsystem. This interface or class is called Facade Interface.
2. **The Facade Interface handles the subsystem initialization**
2. **The client class should be unaware of the subsystem.**
3. **When the facade size becomes too big we can extract some part of the code to other facade class**


## Use Cases
1. When we need a simple interface to a complex subsystem
2. Use the Facade when you want to structure a subsystem into layers. We can reduce coupling between multiple subsystems by requiring them to communicate only through facades.

## Class Structure

### Different Classes/Interfaces
1. **Facade Class**: It initializes, manages subsystem objects and provides useful methods for the client.
2. **Client Class**: It contains buisness logic and uses the Facade class to use library/subsystem.
3. **Subsystem Classes**: These are set of classes of the subsystem/library.

### UML Diagram
![alt text](<Screenshot 2024-04-27 at 10.39.48 AM.png>)

## Example Code
1. In the above example, the client wants to use the Framework for video conversion.
2. Without the Facade class, the client needs to handle all the complexity of initializing and managing framework class objects.
3. But in the above example, we are using a Facade class. It hides all complexity from the client.
4. The client just called a Facade class method for video conversion. 