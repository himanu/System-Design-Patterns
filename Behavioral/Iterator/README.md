# Iterator Design Pattern
It allows clients to traverse elements of a collection using different traversal algorithms.

[**Above Example Guide**](#example-code)

## What Problem does it solve?
1. Consider a collection class representing a binary tree.
2. The Client wants to traverse the Binary Tree.
3. If the Client wants to use only one traversal algorithm logic then adding that in the collection class is not a problem.
4. But if the client wants to use multiple traversal algorithms, then it would be messy if we add all algorithms to the collection class.
5. Multiple Algorithm implementation can hide the main function of the collection class which is to store data.
6. Also, some algorithms might be needed in only some applications, so including them in a generic collection class would be weird.

## Solution
1. Instead of defining traversal algorithms in the collection, this pattern focuses on creating separate classes for each traversal algorithm.
2. These different classes are known as Iterator Classes.
3. All iterator classes implement an Interface, known as the Iterator Interface.

## Class Structure

### Different Classes/Interfaces
1. **Collection Class**: It has logic to store data. It must have at least a method to return its iterator.
2. **Iterator Interface**: It is the interface that each iterator class implements. It defines basic methods like `hasMore()`, `getNext()`  which each iterator class implements.
3. **Concrete Iterator Classes**: These classes implement the Iterator Interface and have collection traversal logic. They store a collection class object.
4. **Client Class**: Contains client code to use pattern.

### UML Diagram
![alt text](<Screenshot 2024-04-28 at 4.18.47 PM.png>)

## Example Code
In the above example, the `MyList` class represents a collection to store string data. It implements the `IterableCollection` interface and has a method to return its iterator.
The `ListIterator` class is for traversing elements of `MyList` collection objects. It implements the `Iterator` interface.

The `Application.java` initializes the `MyList` class, adds data to it and uses the `Iterator` to traverse.