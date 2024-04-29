# Singleton Desgin Pattern
It is used when we want to create only one instance of a class.

[**Above Example Guide**](#example-code)

## What Problem does it solve?
1. Consider a Database Connection Class. Its main purpose is to set up a connection to DB, run Queries and return results.
2. Ask yourself, How many objects of this class does our application need? 
3. Should the application create a new object for each DB Query?
4. Creating an object for each db call is not a good approach. Since it takes time and resources.

## Solution
1. To restrict the number of objects of a class to 1, we use Singleton Design Pattern.

## Class Structure

### Different Classes
1. **Singleton Class**: The class of which we want only one object. To do so we need to make the constructor of the class private and declare a static method that will return either a new object or an already created object.

### UML Diagram
![alt text](<Screenshot 2024-04-26 at 10.13.12 PM.png>)

## Example Code
The example contains a `database` class. It has a static method `getDataBaseObject` that makes sure only one object is created. During the first call, it creates a new object by calling the private constructor and in subsequent calls, it would return the object which was created before.

The Client can't call the constructor of the `database` class because it is declared as private method.

