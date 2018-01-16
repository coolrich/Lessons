package lesson8.exercise5;

/**
 * Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
 * Класс Animal содержит переменные food, location и методы makeNoise,
 * eat, sleep. Dog, Cat, Horse переопределяют методы makeNoise, eat.
 * Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
 * Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
 * Пусть этот метод распечатывает food и location пришедшего на прием животного.
 * В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
 * В цикле отправляйте их на прием к ветеринару.
 */
public abstract class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public abstract void makeNoise();

    public abstract void eat();

    public void sleep() {
        System.out.println("sleeping");
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static void main(String[] args) {
        Animal[] animals = {new Cat("Cat food", "l1"), new Dog("Dog food", "l2"), new Horse("Horse food", "l3")};
        Veterinarian veterinarian = new Veterinarian();
        for (Animal a :
                animals) {
            veterinarian.treatAnimal(a);
        }
    }
}
