package lesson8.exercise3.com.company.professions;

public class Driver extends Person {

    private int experience;

    public Driver() {

    }

    public Driver(String firstName, String lastName, int age, int experience) {
        super(firstName, lastName, age);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
