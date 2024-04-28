# Iterator Design Pattern
It solves the problem when a client needs different iteration algorithm to iterate over data stored in a collection class object.

## What Problem it solves?
1. Consider a collection class representing a binary tree.
2. Client wants to traverse Binary Tree.
3. If the Client wants to use only one traversal algorithm logic then adding that in the collection class is not a problem.
4. But if client wants to use multiple traversal algoritm, then it would be messy if we add all algorithm to the collection class.
5. Also some alogrithm might be needed in only some application, so including them into a generic collection class would be weird.

## Solution
1. Instead of defining traversal algorithms in the collection, this pattern focus on creating a separate classes to store each traversal algorithm.
2. These different classes are known as Iterator Classes.
3. All interator classes implements an Interface, known as Iterator Interface.

## Class Structure

### Different Classes/Interfaces
1. **Collection Class**: It has logic to store data.
2. **Iterator Interface**: It is the interfaces which each iterator classes gonna implement. It defines basics method like `hasMore()`, `getNext()`  which each iterator class implements.
3. **Concreate Iterator Classes**: These classes implements the Iterator Interface and has collection traversal logic.
4. **Client Class**: Contains client code to use pattern.