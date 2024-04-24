# Builder Design Pattern

## Use Case
When a class objects have different possibilities then we can use BDP.

For eg: Consider a House Class, House can be of different type, 1 BHK, 1 BHK with Garden, 2 BHK with Garage, ....
One way to organize class is to have different subclass for each type of House. But it is not scalable if the number of different houses is large.

Second way is to use parameters of the constructor method to control house types. But it is also not scalable, since number of parameters would be very large.

To solve this we use BDP.

## Different classes in BDP 
1. Builder Class: It contains different methods to configure the class object.
2. Director Class: It has methods which invokes Builder class methods in some sequence. It is generally uses to store instructions to build commonly needed object. 
Director class has a reference to builder class object.