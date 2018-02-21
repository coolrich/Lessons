package lesson16.atHome.ex10.animals;

import lesson16.atHome.ex10.behaviors.MoveBehavior;
import lesson16.atHome.ex10.behaviors.VoiceBehavior;

public class Cat extends Pet {
    public Cat(int weight, int age, String name, VoiceBehavior voiceBehavior, MoveBehavior moveBehavior) {
        super(weight, age, name, voiceBehavior, moveBehavior);
    }
}
