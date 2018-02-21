package lesson16.atHome.ex10.animals;

import lesson16.atHome.ex10.behaviors.MoveBehavior;
import lesson16.atHome.ex10.behaviors.VoiceBehavior;

public class Pet {
    private int weight;
    private int age;
    private String name;
    private VoiceBehavior voiceBehavior;
    private MoveBehavior moveBehavior;

    public Pet(int weight, int age, String name, VoiceBehavior voiceBehavior, MoveBehavior moveBehavior) {
        this.weight = weight;
        this.age = age;
        this.name = name;
        this.voiceBehavior = voiceBehavior;
        this.moveBehavior = moveBehavior;
    }

    public VoiceBehavior getVoiceBehavior() {
        return voiceBehavior;
    }

    public void setVoiceBehavior(VoiceBehavior voiceBehavior) {
        this.voiceBehavior = voiceBehavior;
    }

    public MoveBehavior getMoveBehavior() {
        return moveBehavior;
    }

    public void setMoveBehavior(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void performVoice() {
        voiceBehavior.voice();
    }

    public void performMove() {
        moveBehavior.move();
    }
}
