# Iterator Design Pattern
It allows clients to traverse elements of a collection using different traversal algorithm.

[**Above Example Guide**](#example-code)

## What Problem it solves?
1. Consider a collection class representing a binary tree.
2. Client wants to traverse the Binary Tree.
3. If the Client wants to use only one traversal algorithm logic then adding that in the collection class is not a problem.
4. But if client wants to use multiple traversal algoritm, then it would be messy if we add all algorithm to the collection class.
5. Multiple Algorithm implementation can hide the main function of the collection class which is to store data.
6. Also some alogrithm might be needed in only some application, so including them into a generic collection class would be weird.

## Solution
1. Instead of defining traversal algorithms in the collection, this pattern focus on creating separate classes for each traversal algorithm.
2. These different classes are known as Iterator Classes.
3. All interator classes implements an Interface, known as Iterator Interface.

## Class Structure

### Different Classes/Interfaces
1. **Collection Class**: It has logic to store data. It must have atleast a method to return its iterator.
2. **Iterator Interface**: It is the interface which each iterator class implements. It defines basics method like `hasMore()`, `getNext()`  which each iterator class implements.
3. **Concreate Iterator Classes**: These classes implements the Iterator Interface and has collection traversal logic. They stores a collection class object.
4. **Client Class**: Contains client code to use pattern.

### UML Diagram
![alt text](<Screenshot 2024-04-28 at 4.18.47 PM.png>)

## Example Code
Example have below files for each type of class.
1. `Aggregate.java` representing `IterableCollection` interface in the above UML Diagram Image.
2. Similarly `MyList.java` representing `ConcreteCollection` class.
3. Similarly `Iterator.java` representing `Iterator` interface.
4. Similarly `ListIterator.java` representing `ConcreteIterator` class.
5. Similarly `Application.java` representing `Client` class.