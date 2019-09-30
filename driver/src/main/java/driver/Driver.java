package driver;
import car.Car;

public class Driver {

    public static void main(String[] args) {
        Car car= new Car("BMW");
        System.out.print(car.getBrand());
    }
}
