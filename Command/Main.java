package command;

// Client
public class Main {

    public static void main(String[] args){

        Player player = new Player(); // Invoker

        Pawn pawn = new Pawn(); // Receiver
        Knight knight = new Knight(); // Receiver

        MovePawn pawnMove = new MovePawn(pawn); // Command
        MoveKnight knightMove = new MoveKnight(knight); // Command

        // Set the commands
        player.setCommand(0, pawnMove);
        player.setCommand(1, knightMove);

        // Test the plays
        player.makePlay(0);
        player.makePlay(1);
        player.makePlay(0);
        player.makePlay(0);
        player.undoPlay(0);
        player.undoPlay(1);
    }
}
