package lesson8.exercise3.com.company.vehicles;

import lesson8.exercise3.com.company.details.Engine;
import lesson8.exercise3.com.company.professions.Driver;

public class Lorry extends Car {
    private int carryingCapacity;

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public Lorry(String brand, String carClass, int weight, Driver driver, Engine engine, int carryingCapacity) {

        super(brand, carClass, weight, driver, engine);
        this.carryingCapacity = carryingCapacity;
    }
}
