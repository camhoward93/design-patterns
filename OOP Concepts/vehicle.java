package exercise;

public class vehicle {
    private wheels wheels;
    private String color;
    private String name;

    public vehicle(){
        this.setWheels(0);
        this.setColor("Black");
        this.setName("V_E_H_I_C_L_E");
    }

    public vehicle(int wheels, String color, String name){
        this.setWheels(wheels);
        this.setColor(color);
        this.setName(name);
    }

    public int getWheels() {
        return wheels.getCount();
    }

    public void setWheels(int numWheels) {
        wheels = new wheels();
        this.wheels.setCount(numWheels);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}