package Game;

public class Game {
    public static void main(String[] args) {
        GameUnit grunt = new GameUnitGrunt();
        GameUnit tank = new GameUnitTank();
        grunt.followOrders();
        tank.followOrders();
        grunt.whichWeapon();
        tank.whichWeapon();
        grunt.newOrder(new Flee());
        grunt.newWeapon(new Pistol());
        tank.newOrder(new SelfDestruct());
        tank.newWeapon(new Rocket());
        grunt.followOrders();
        tank.followOrders();
        grunt.whichWeapon();
        tank.whichWeapon();
    }
}
