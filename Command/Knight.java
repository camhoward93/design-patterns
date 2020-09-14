package command;

// Receiver
class Knight {
    private char posAlpha;
    private int posNum;

    Knight() {
        this.posAlpha = 'F';
        this.posNum = 1;
    }

    void jump() {
        posAlpha -= 1;
        posNum += 2;
        System.out.println("Knight position is now " + posAlpha + posNum);
    }

    void back() {
        posAlpha += 1;
        posNum -= 2;
        System.out.println("Knight position returned to " + posAlpha + posNum);
    }
}
