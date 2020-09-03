package strategy;

public class GameUnitTank extends GameUnit {
    public GameUnitTank() {
        orders = new Attack();
        weapon = new Cannon();
    }
}
