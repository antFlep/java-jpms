package car;

import motor.Motor;

public class Car {

    private final Motor MOTOR;
    private String brand;

    public Car(String brand){
        this.MOTOR = new Motor(Motor.FuelType.Diesel, Motor.HorsePower.Low);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
