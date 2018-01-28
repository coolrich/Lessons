package lesson12.ex6;

public class Person {
    private String fullName;
    int age;

    public Person() {

    }

    public Person(String aFullName, int anAge) {
        fullName = aFullName;
        age = anAge;
    }

    public void move() {
        System.out.println(fullName + " is moving");
    }

    public void talk() {
        System.out.println((fullName + " is talking"));
    }

    @Override
    public String toString() {
        return String.format("Person fullName = %s, age = %d", fullName, age);
    }

    public static void main(String[] args) {
        System.out.println(new Person("I", 19));
    }
}
