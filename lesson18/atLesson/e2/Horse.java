package lesson18.atLesson.e2;

import java.io.Serializable;

/**
 * Created by student on 25.02.2018.
 */
public class Horse extends Animal implements Serializable {
    private Halter halter;
    private String name;

    public Horse(Halter halter, String s) {
        this.halter = halter;
        name = s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Horse horse = (Horse) o;

        if (halter != null ? !halter.equals(horse.halter) : horse.halter != null) return false;
        return name != null ? name.equals(horse.name) : horse.name == null;

    }

    @Override
    public int hashCode() {
        int result = halter != null ? halter.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
