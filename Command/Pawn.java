package command;

// Receiver
class Pawn {
    private char posAlpha;
    private int posNum;

    Pawn() {
        this.posAlpha = 'A';
        this.posNum = 2;
    }

    void move() {
        posNum += 1;
        System.out.println("Pawn position is now " + posAlpha + posNum);
    }

    void back() {
        posNum -= 1;
        System.out.println("Pawn position returned to " + posAlpha + posNum);
    }
}
