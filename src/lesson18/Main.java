package src.lesson18;

import src.lesson18.com.company.details.Engine;
import src.lesson18.com.company.vehicles.Car;
import src.lesson18.com.company.details.Lorry;
import src.lesson18.com.company.details.SportCar;
import src.lesson18.com.company.professions.Drivers;

public class Main {

    public static void main(String[] args) {
        Drivers drivers = new Drivers("Мужчина", "Иван Иванов", 10);
        Engine engine = new Engine("150", "Renault");
        Lorry lorry = new Lorry("Lada Largus", "Универсал", 1400, drivers, engine, 500);

        lorry.start();
        lorry.turnLeft();
        lorry.turnRight();
        lorry.stop();
        System.out.println(lorry.toString());
    }
}
