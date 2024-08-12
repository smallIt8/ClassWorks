package src.lesson13;

public class Apple extends Fruit {
    double price;
    double finaliPrice;

    @Override
    public Double priceFruit() {
        if (weight > 0 || price > 0) {
            System.out.println(finaliPrice = weight * price);
        } else {
            System.out.println("Яблок нет");
        }
        return finaliPrice;
    }

    public Apple() {
    }

    public Apple(double price, double weight) {
        super(weight);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
