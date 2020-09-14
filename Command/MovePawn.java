package command;

public class MovePawn implements Command {
    private Pawn pawn;

    MovePawn(Pawn pawn) {
        this.pawn = pawn;
    }

    @Override
    public void execute() {
        pawn.move();
    }

    @Override
    public void undo() {
        pawn.back();
    }
}
