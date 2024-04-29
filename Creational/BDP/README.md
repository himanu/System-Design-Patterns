# Builder Design Pattern
This pattern helps in creating complex objects in multiple steps.

[**Above Example Guide**](#example-code)

## What Problem does it solve?
1. Consider a Car Class. The Application wants to produce cars with different characteristics like some with a metallic body, some with a strong engine, some with two doors etc.
2. One way is to use the constructor parameters to control car features. This approach is not scalable if the number of parameters needed for car customization is very large.
3. Another way is to define subclasses for each type of car. This approach is also not good if the Application wants more control over car production.

## Solution
1. The Pattern says to have a separate class (aka Builder class) with **multiple methods to customize the object creation logic**.
2. This pattern doesn't need a parameters-heavy constructor or subclasses for each object type.

## Class Structure

### Different Classes/Interfaces
1. **Builder Class**: It contains different methods to configure the class object.
2. **Product Class**: The class of which we want to create objects.
3. **Client Class**: The client class that needs product class objects

### UML Diagram
![alt Builder_Design_Pattern](<Screenshot 2024-04-26 at 10.11.01 PM.png>)

## Example Code
The example is of a Home Builder application. `App.java` wants to create homes with different settings.
`Builder.java` provides methods to create `Home` objects in multiple steps.