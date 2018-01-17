package lesson8.exercise3.com.company.professions;

public class Person {
    private String firstName;
    private String lastName;
    int age;

    public Person() {
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move() {
        System.out.println(getFirstName() + " " + getLastName() + " is moving");
    }

    public void talk() {
        System.out.println(getFirstName() + " " + getLastName() + " is talking");
    }

    public static void main(String[] args) {
        new Person().move();
        new Person("Someone1", "Someone1", 30).talk();
    }
}
