package strategy;

public class GameUnitGrunt extends GameUnit {
    public GameUnitGrunt() {
        orders = new Attack();
        weapon = new Axe();
    }
}
