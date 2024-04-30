# Adapter Design Pattern
1. It allows two incompatible classes to collaborate.

[**Above Example Guide**](#example-code)

## What Problem does it solve?
1. Consider an example of data analytic software.
2. The Software gets XML response from an external API.
3. To show data analysis (charts, graphs) the application is using a third-party library.
4. The third-party library only accepts JSON as input. However, the software has XML data.

## Solution
1. The Pattern solves the above problem by defining a class (Adapter class) that converts the XML data to JSON and uses the third-party library for data analysis.


## Class Structure

### Different Classes/Interfaces
1. **Client Class**: The Client class contains the business logic.
2. **Client Interface**: It describes a protocol that other classes must follow to be able to collaborate with the client class
3. **Service Class**: The Service is some useful class (usually 3rd-party or legacy). The client can’t use this class directly because it has an incompatible interface.
4. **Adapter Class**: The Adapter class acts as a mediator between the client and service object. It implements the client interface and wraps the service object, translating client calls into a format that the service object can understand.


### UML Diagram
![alt text](<Screenshot 2024-04-28 at 8.00.06 PM.png>)

## Example Code
1. `RoundHole.java` has a class with a method `fits` that has a parameter of type `RoundHole`.
2. The `fits` method is only compatible with the `RoundHole` class object.
3. `SquarePeg.java` has a class. We want to use this class object with the `fits` method of the `RoundHole` class.
4. The above point is not possible because the `fits` method only accepts `RoundPeg` type objects.
5. To make it work, we have an adapter class `SquarePegAdapter`. It extends `RoundPeg` class and uses `SquarePeg` class.
6. The object of the `SquarePegAdapter` class will have a type of `RoundPeg` and hence it is compatible with the `fit` method of `RoundHole` class.
7. `SquarePegAdapter` class object uses `SquarePeg` class object.
8. This way, `RoundHole` class can communicate with code of `SquarePeg` class.
 