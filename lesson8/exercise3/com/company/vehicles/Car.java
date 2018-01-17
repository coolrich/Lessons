package lesson8.exercise3.com.company.vehicles;

import lesson8.exercise3.com.company.details.Engine;
import lesson8.exercise3.com.company.professions.Driver;

/**
 * марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine.
 * Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать: "Поехали",
 * "Останавливаемся", "Поворот направо" или "Поворот налево".
 * А также метод printInfo(), который выводит полную информацию об автомобиле, ее водителе и моторе.
 * Создать производный от Car класс  - Lorry (грузовик), характеризуемый также грузоподъемностью кузова.
 * Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью. Пусть класс Driver расширяет класс Person.
 */
public class Car {
    private String brand;
    private String carClass;
    private int weight;
    private Driver driver;
    private Engine engine;

    public Car(String brand, String carClass, int weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {

        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public void printInfo() {
        System.out.println("\nBrand: " + brand +
                "\nClass of car: " + carClass +
                "\nWeight of car: " + weight +
                "\nDriver's name: " + driver.getFirstName() + " " + driver.getLastName() +
                "\nDriver's experience: " + driver.getExperience() +
                "\nEngine power: " + engine.getPower() +
                "\nEngine manufacturer: " + engine.getManufacturer()
        );
    }

    public static void main(String[] args) {
        Driver d1,d2,d3;
        new Car("Subaru", "sedan", 1200, d1=new Driver("John", "Tanner", 32, 14), new Engine(305, "Gunma Oizumi Plant")).printInfo();
        new Lorry("Scania", "lorry", 3000, d2=new Driver("Jerico", "Castle", 35, 17), new Engine(450, "GM"), 400).printInfo();
        new Sportcar("Mitsubishi", "sedan", 1300, d3=new Driver("Carl", "Johnson", 22, 4), new Engine(450, "MM"), 250).printInfo();
        d1.move();
        d1.talk();
        d2.move();
        d2.talk();
        d3.move();
        d3.talk();
    }
}
