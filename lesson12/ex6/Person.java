package lesson12.ex6;

public class Person implements Comparable<Person>{
    private String fullName;
    int age;

    public Person() {

    }

    public Person(String aFullName, int anAge) {
        fullName = aFullName;
        age = anAge;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    @Override
    public int compareTo(Person o) {
        return this.age-o.age;
    }
}
