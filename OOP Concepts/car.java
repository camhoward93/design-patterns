package exercise;

public class car extends vehicle {

    private String motor;
    private boolean started;

    public car(){
        this.setWheels(4);
        this.setMotor("none");
    }

    public car(int wheels, String color, String name, String motor){
        super(wheels, color, name);
        this.setMotor(motor);
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
}
