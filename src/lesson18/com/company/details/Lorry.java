package src.lesson18.com.company.details;

import src.lesson18.com.company.professions.Drivers;
import src.lesson18.com.company.vehicles.Car;

public class Lorry extends Car {
    private int loadCapacity;

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Грузоподъемность: " + loadCapacity;
    }

    public Lorry(String carBrand, String carClass, int weight, Drivers driver, Engine engine) {
        super(carBrand, carClass, weight, driver, engine);
    }

    public Lorry(String carBrand, String carClass, int weight, Drivers driver, Engine engine, int loadCapacity) {
        super(carBrand, carClass, weight, driver, engine);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
