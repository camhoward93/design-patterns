package exercise;

public class Main{
    public static void main(String[] args) {
        vehicle vehicle = new vehicle();
        car pinto = new car(4, "Rusty", "Pinto", "trash");
        bike bmx = new bike(2, "Silver", "Garth's BMX Bike", false);

        System.out.println(vehicle.getName() + " " + vehicle.getWheels() + " " + vehicle.getColor());
        System.out.println(pinto.getName() + " " + pinto.getWheels() + " " + pinto.getColor() + " " + pinto.getMotor());
        System.out.println(bmx.getName() + " " + bmx.getWheels() + " " + bmx.getColor() + " " + bmx.isKickstand());

        vehicle car = new car();
        System.out.println(car.getWheels());
        car = new bike();
        System.out.println(car.getWheels());
        car.setWheels(99999);
        System.out.println(car.getWheels());
    }
}