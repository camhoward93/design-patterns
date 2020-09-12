# Strategy
The Strategy design pattern identifies the behaviors or algorithms that vary and separates them from the what stays the same. The varying behaviors or algorithms are then encapsulated in classes that implement a common interface, which enables the developer to program to an interface instead of an implementation.

## The Example
For this example, I have a very simplistic "game" that contains game units which have varying weapons and orders. The GameUnit abstract class allows me to make multiple types of units (the examples here are grunt and tank) for the game that have their own weapon and orders, and can follow orders, display which weapon they have, or receive a new order or new weapon.

So, using Strategy, I first separate what varies from what stays the same. What varies are the orders and weapons, so I need to separate those from the game unit and encapsulate them in classes implementing their interfaces. So, I make an interface for the UnitWeapon and an interface for the UnitOrders, as well as an abstract class for the GameUnit (the part of the system that stays the same). Then, for each order or weapon the game units can have I make a class that implements its respective interface. The class Game is where I demonstrate that this works in the main function by creating a default grunt and tank and following their orders / displaying which weapon they have, then assigning new ones and following and displaying again.

In order to run this simply download all the files into a package called strategy and run the main function of the Game class (I did this using the IntelliJ IDE).

### Expected Output
Following order: Attack<br/>
Following order: Attack<br/>
Current weapon: Axe<br/>
Current weapon: Cannon<br/>
Following order: Flee<br/>
Following order: Self Destruct<br/>
Current weapon: Pistol<br/>
Current weapon: Rocket
