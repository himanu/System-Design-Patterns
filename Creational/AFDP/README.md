# Abstract Factory Design Pattern
1. It is used when we need to create a family of objects.
2. One example of a family of objects is a family of GUI Components. The GUI Component family contains a cursor, button, textbox etc. Objects in a family work together to accomplish some task. 
3. Objects in each family are compatible with each other.
4. **Note** Objects in a family don't need a common interface/parent.

[**Above Example Guide**](#example-code)

### Example GUI Components
1. GUI components are like buttons, cursors, textboxes etc.
2. A Mac button is only compatible with a Mac cursor. The Same applies to other OS.
3. So when we create a Mac button then we only want to create a Mac cursor.
4. **The family type (either Mac or Windows) is decided when we start our application, this info is mainly stored in environment variables**

## What Problem does it solve?
1. Consider a GUI Application. It has multiple classes like Button, Cursor, Checkbox TextBox etc.
2. Each GUI component class can have a different version like one for Windows, the other for Linux etc.
3. At a time, our application would like to have only one version of all the components.
4. Without this pattern, the application would use conditions to create a specific version of the component. Wherever we need a specific version component, there would be these conditions.
5. This approach is prone to errors and not scalable. Because of repetition of conditions.

Abstract Factory Design Pattern solves this problem.

## Solution
1. This pattern suggests to create different classes for each version of GUI Components.
2. These classes are known as Factory Classes.
3. Each Factory class will be responsible for creating all GUI components of a version.
4. The number of Factory classes is equal to the number of versions of GUI components.
5. These Factory classes would have an Interface so that the Client doesn't couple to concrete Factory classes.
6. For the above example, there would be two factory classes, one would create GUI components for Mac and the other for Windows.
7. The factory type (Windows or Mac) is decided at the start of the application using environment variables config.


## Class Structure

### Different Classes/Interfaces
1. **Product Interfaces**: Interfaces representing each Product. In the case of GUI Component example, for each component(button, cursor, checkbox) there is an Interface.
2. **Concrete Product Classes**: Classes that represent a version of a Product. For each product's version, there would be a concrete product class implementing the Product Interface.
4. **Abstract Factory Interface**: The Abstract Factory interface declares a set of methods for creating each of the abstract products.
5. **Concrete Factories**: Concrete Factories implement creation methods of the abstract factory. Each concrete factory corresponds to a specific variant of products and creates only those product variants.

## UML Diagram
![alt Abstract_Factory_Design_Pattern](<Screenshot 2024-04-26 at 9.44.45 PM.png>)

## Example Code
The example code is of a GUI application. It contains two components Button and Cursor. GUI application comes in two variations, one for Windows and the other for Mac.

For each variation, AFDP says to have a Concrete Factory. In the example, we have `WindowsGUIFactory` to produce GUI components for Windows and `MacGUIFactory` to produce GUI components for Mac.

For each variation of a component, there is a class, like for Mac's button class is `MacButton`

`App.java` decides which factory to use (Mac or Windows), it is mainly decided by the environment variables. The created factory object is passed to the `Client.java`.
Now our client would use this object to create components of one family (Mac or Windows).
