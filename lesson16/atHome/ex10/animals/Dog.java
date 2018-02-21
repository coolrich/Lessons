package lesson16.atHome.ex10.animals;

import lesson16.atHome.ex10.behaviors.MoveBehavior;
import lesson16.atHome.ex10.behaviors.VoiceBehavior;

public class Dog extends Pet {
    public Dog(int weight, int age, String name, VoiceBehavior voiceBehavior, MoveBehavior moveBehavior) {
        super(weight, age, name, voiceBehavior, moveBehavior);
    }
}
