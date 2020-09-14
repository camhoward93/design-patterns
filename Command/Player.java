package command;

// Invoker
class Player {
    private Command[] plays;

    Player() {
        // Number of possible commands for this example is 2 (pawn move and knight move)
        plays = new Command[2];

        // Default the commands
        Command noCommand = new NoCommand();
        for (int i = 0; i < 2; i++) {
            plays[i] = noCommand;
        }
    }

    void setCommand(int index, Command command) {
        this.plays[index] = command;
    }

    void makePlay(int index) {
        plays[index].execute();
    }

    void undoPlay(int index) {
        plays[index].undo();
    }
}
