package src.lesson13;

public abstract class Fruit {
    double weight;

    public void printManufacturerInfo() {
        System.out.print("Made in Belarus");
    }

    public abstract Double priceFruit();

    public Fruit() {
    }

    public Fruit(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
