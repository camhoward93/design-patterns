package command;

public class MoveKnight implements Command {
    private Knight knight;

    MoveKnight(Knight knight) {
        this.knight = knight;
    }

    @Override
    public void execute() {
        knight.jump();
    }

    @Override
    public void undo() {
        knight.back();
    }
}
