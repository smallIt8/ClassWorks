package src.lesson18.com.company.professions;

import src.lesson18.com.company.details.Person;

public class Drivers extends Person {
    private String fullName;
    private int drivingExperience;

    public Drivers(String gender) {
        super(gender);
    }

    @Override
    public String toString() {
        return "имя водителя: " + fullName + "\n" +
                "стаж вождения: " + drivingExperience + " лет" ;
    }

    public Drivers(String gender, String fullName, int drivingExperience) {
        super(gender);
        this.fullName = fullName;
        this.drivingExperience = drivingExperience;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }
}
