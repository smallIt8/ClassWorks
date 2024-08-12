package src.lesson18.com.company.details;

import src.lesson18.com.company.professions.Drivers;
import src.lesson18.com.company.vehicles.Car;

public class SportCar extends Car {
    private int speed;

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Скорость: " + speed;
    }

    public SportCar(String carBrand, String carClass, int weight, Drivers driver, Engine engine) {
        super(carBrand, carClass, weight, driver, engine);
    }

    public SportCar(String carBrand, String carClass, int weight, Drivers driver, Engine engine, int speed) {
        super(carBrand, carClass, weight, driver, engine);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
