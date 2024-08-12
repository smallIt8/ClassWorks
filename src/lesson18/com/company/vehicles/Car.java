package src.lesson18.com.company.vehicles;

import src.lesson18.com.company.details.Engine;
import src.lesson18.com.company.professions.Drivers;

public class Car {
    private String carBrand;
    private String carClass;
    private int weight;
    private Drivers driver;
    private Engine engine;

    public void start(){
        System.out.println("Поехали");
    }

    public void stop(){
        System.out.println("Останавливаемся");
    }

    public void turnRight(){
        System.out.println("Поворот направо");
    }

    public void turnLeft(){
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Марка автомобиля: " + carBrand + "\n" +
                "Класс автомобиля: " + carClass + "\n" +
                "Вес: " + weight + " кг\n" +
                "Водитель: " + "\n" + driver + "\n" +
                "Мотор: " + "\n" + engine;
    }

    public Car(String carBrand, String carClass, int weight, Drivers driver, Engine engine) {
        this.carBrand = carBrand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Drivers getDriver() {
        return driver;
    }

    public void setDriver(Drivers driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
