# Command
The Command pattern encapsulates requests as objects, which allows you to parameterize other objects with different requests, queue or log requests, and support undoable operations. There is one command interface that all individual actions implement in their own class. This allows the code that uses the commands to interact solely with the interface and not know or care about the individual classes. This increases cohesion by having each class responsible for one discrete set of logic, and it decreases coupling because the code calling the command only deals with the interface.

## The Example
In this example I implemented the movements of two chess pieces (pawn and knight). The knight has had its movement simplified to being forward 2 and to the left 1. The pawn is starting on A2, and the knight is starting on F1. This program could easily be extended to implement a full chess game, giving the pieces their full spectrum of movements across a board. Since this is just to demonstrate the Command pattern though I am leaving it simplified for the time being. There is also an option for players to undo their moves.

In this case, the Main class is the client responsible for creating the command object, the Player is the invoker that will be passed command objects that can be used to make requests, the Pawn and Knight are the receivers that receive the request, the MovePawn and MoveKnight classes are the commands that implement the Command interface and get the receivers passed to them, with NoCommand being a null default value for the command. In the main program the invoker and receivers are created, then the commands are made and passed the receivers, the commands are set, and the plays are made by the player. Earlier I said that this could be extended to a whole Chess game. That would be easily done with the Command pattern by adding new move actions for new pieces. The player doesn't need to know how the pieces are making their moves, just that if they want to move a piece to a place they just need to request that and it will be done.

In order to run this simply download all the files into a package called command and run the main function of the Main class (I did this using the IntelliJ IDE).

### Expected Output
Pawn position is now A3 <br/>
Knight position is now E3<br/>
Pawn position is now A4<br/>
Pawn position is now A5<br/>
Pawn position returned to A4<br/>
Knight position returned to F1
