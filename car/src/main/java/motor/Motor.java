package motor;

public class Motor {

    public enum FuelType {
        Petrol,
        Diesel
    }

    public enum HorsePower {
        Low,
        Mid,
        High
    }

    private final FuelType FUEL;
    private final HorsePower HORSEPOWER;
    private int distanceDriven = 0;

    public Motor(FuelType fuelType, HorsePower ps) {
        FUEL = fuelType;
        HORSEPOWER = ps;
    }



}
