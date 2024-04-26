# Factory Design Pattern
1. It is a creational design pattern
2. Factory class used to create objects of similar classes

## Use Cases
1. When we have multiple classes of similar type then we can use FDP.

## Example
Example: In case of Uber, ride can be of three type bike_ride, car_ride, luxury_ride.

### Without FDP
1. Without FDP, client would decide conditionally which ride object to create.
2. Client code is closely coupled with different type of rides.
3. If in future, uber introduces a new type of ride then the client code needs update. 
4. Such approach is prone to error due to coupling.
5. The solution is to not create objects in the client class.
6. Use a another class for creating objects aka Factory Class.

## UML Diagram
![alt text](<Screenshot 2024-04-26 at 9.51.12 PM.png>)

 
