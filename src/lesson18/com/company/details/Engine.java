package src.lesson18.com.company.details;

public class Engine {
    private String power;
    private String manufacturer;

    @Override
    public String toString() {
        return "мощность двигателя: " + power + " л.с.\n" +
                "производитель двигателя: " + manufacturer;
    }

    public Engine() {
    }

    public Engine(String power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }

    public String getFullName() {
        return power;
    }

    public void setFullName(String power) {
        this.power = power;
    }

    public String getDrivingExperience() {
        return manufacturer;
    }

    public void setDrivingExperience(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
