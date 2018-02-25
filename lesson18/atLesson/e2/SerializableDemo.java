package lesson18.atLesson.e2;

import java.io.*;

/**
 * Created by student on 25.02.2018.
 */
public class SerializableDemo {

    public static final String FILE_NAME = "C:\\Users\\student\\Desktop\\temp\\src\\l18\\e5\\horse.ser";

    public static void main(String[] args) {
        Horse horse = new Horse(new Halter("Red"), "h1"), horse1;
        serialize(horse);
        horse1 = (Horse) deSerialize();
        System.out.println(horse.equals(horse1));
    }

    public static void serialize(Animal animal) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            outputStream.writeObject(animal);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Animal deSerialize() {
        Animal animal = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            animal = (Horse) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return animal;
    }
}
