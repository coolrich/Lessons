package lesson16.atHome.ex10.animals;

import lesson16.atHome.ex10.behaviors.MoveBehavior;
import lesson16.atHome.ex10.behaviors.VoiceBehavior;

public class Parrot extends Pet {
    private boolean canSpeak;

    public Parrot(int weight, int age, String name, VoiceBehavior voiceBehavior, MoveBehavior moveBehavior, boolean isSpeak) {
        super(weight, age, name, voiceBehavior, moveBehavior);
        this.canSpeak = isSpeak;
    }
}
