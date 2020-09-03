package exercise;

public class bike extends vehicle {

    private boolean kickstand;
    private boolean started;

    public bike(){
        this.setWheels(2);
        this.setKickstand(false);
    }

    public bike(int wheels, String color, String name, boolean kickstand){
        super(wheels, color, name);
        this.setKickstand(kickstand);
    }

    public boolean isKickstand() {
        return kickstand;
    }

    public void setKickstand(boolean kickstand) {
        this.kickstand = kickstand;
    }
}
