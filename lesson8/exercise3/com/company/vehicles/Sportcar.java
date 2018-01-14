package lesson8.exercise3.com.company.vehicles;

import lesson8.exercise3.com.company.details.Engine;
import lesson8.exercise3.com.company.professions.Driver;

public class Sportcar extends Car {
    private int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Sportcar(String brand, String carClass, int weight, Driver driver, Engine engine, int maxSpeed) {

        super(brand, carClass, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }
}
