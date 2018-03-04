package lesson7.exercise2;

public class Person {
    int age;
    private String fullName;

    public Person() {

    }

    public Person(String aFullName, int anAge) {
        fullName = aFullName;
        age = anAge;
    }

    public static void main(String[] args) {
        new Person().move();
        new Person("Someone", 30).talk();
    }

    public void move() {
        System.out.println(fullName + " is moving");
    }

    public void talk() {
        System.out.println((fullName + " is talking"));
    }
}
