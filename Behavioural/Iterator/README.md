# Iterator Design Pattern
It is used to traverse elements of a collection without exposing underlying representation.

## Problem it solves?
1. Consider a collection class.
2. Client needs to iterate class objects.
3. One way is to implement the iteration logic in collection itself. It is ok in some situations.
4. But if client wants to use multiple iteration algoritm, then it would be messy if we add more iteration logic to the collection.
5. Also some alogrithm might be needed in only some application, so including them into a generic collection class would be weird. 

## Structure of it?
1. It has a base collection interface.
2. The collection interface must have a method to return an iterator.
3. There is an iterator interface too.
4. It recieves the collection class object through the constructor.
5. Concrete Iterator also stores the knowledge of traversal progress.