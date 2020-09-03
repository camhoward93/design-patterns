# Decorator
The Decorator pattern attaches additional responsibilities to an object dynamically. This provides a flexible alternative to subclassing for extending functionality, favoring composition over inheritance. This pattern follows the open-closed principle that classes should be open for extension but closed for modification.

## The Example
In this example I have made a Christmas tree cost generator that calculates the cost of any tree with any combination of decorations. This system is extensible in that if I need to add another decoration to the list, I will only have to add one class (that's the power of the Decorator). The tree can have any combinations of decorations except for the star, which it can only have one of and an error will print if another is added.

The abstract class Tree is extended by all possible tree types, as well as by the abstract class TreeDecorator. TreeDecorator is then extended by all possible types of decorations. Each Tree and TreeDecorator subclass have their own description and cost implemented, with the TreeDecorator subclasses building on what their Tree already has. The costs and descriptions are all compounded on by each respective decorator, so that the returned value to the tree object is the sum of its parts. The Main class demonstrates this by making two different trees and adding different decorations to them before printing their descriptions and total cost. Any time an attempt to add a star to a tree that already has a star is made an error prints to screen.

In order to run this simply download all the files into a package called decorator and run the main function of the Main class (I did this using the IntelliJ IDE).

### Expected Output
This tree already has a star!<br/>
Colorado Blue Spruce, Star, Ruffles, Ruffles costs $26.<br/>
This tree already has a star!<br/>
This tree already has a star!<br/>
Douglas Fir, Star, Ribbons, Balls - Silver, Balls - Red, L.E.D.'s, Balls - Blue, Ribbons, Ruffles costs $40.
