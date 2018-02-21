package lesson16.atHome.ex10;

import lesson16.atHome.ex10.animals.Cat;
import lesson16.atHome.ex10.animals.Dog;
import lesson16.atHome.ex10.animals.Parrot;
import lesson16.atHome.ex10.animals.Pet;
import lesson16.atHome.ex10.behaviors.*;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestPet {
    public static void main(String[] args) {
        Map<String, Pet> petMap = new LinkedHashMap<>();
        createPets(petMap);
    }

    public static void createPets(Map<String, Pet> petMap) {
        petMap.put("Scooby",new Dog(10,2,"Scooby",new DogVoiceBehavior(),new OnGroundMoveBehavior()) );
        petMap.put("Tom",new Cat(4,3,"Tom",new CatVoiceBehavior(),new OnGroundMoveBehavior()) );
        petMap.put("Perry",new Parrot(4,3,"Perry",new ParrotVoiceBehavior(), new AirMoveBehavior(),true) );
    }
}
