package strategy;

public abstract class GameUnit {
    UnitOrders orders;
    UnitWeapon weapon;

    public GameUnit() {
    }

    public void followOrders() {
        orders.follow();
    }

    public void whichWeapon() {
        weapon.whichOne();
    }

    public void newOrder(UnitOrders newCommand){
        orders = newCommand;
    }

    public void newWeapon(UnitWeapon newWeapon){
        weapon = newWeapon;
    }
}
