# Factory Design Pattern
1. It is a creational design pattern
2. Factory class used to create objects of similar classes

## Use Cases
1. When we have multiple classes of similar type then we can use FDP.

### Example
Example: In case of Uber, ride can be of three type bike_ride, car_ride, luxury_ride.

#### Without FDP
Without FDP, client would decide conditionally which ride object to create.
Client code is closely coupled with different type of rides.
If in future, uber introduces a new type of ride then the client code needs update. 
Such approach is prone to error due to coupling.
The solution is to not create objects in the client class.
Use a another class for creating objects aka Factory Class.


 
