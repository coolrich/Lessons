package lesson15.atLesson.ex1;

import lesson8.exercise5.Animal;
import lesson8.exercise5.Cat;

import java.io.Serializable;

/**
 * Created by Student on 07.02.2018.
 */
public class ThreeGen<T extends Comparable, V extends Animal & Serializable, K extends Number> {
    private T ob1;
    private V ob2;
    private K ob3;

    public ThreeGen(T ob1, V ob2, K ob3) {
        this.ob1 = ob1;
        this.ob2 = ob2;
        this.ob3 = ob3;
    }

    public static void main(String[] args) {
//        ThreeGen<Integer, Double, GameCharacter> threeGen1 = new ThreeGen<>(1, 2.0, '3');
//        threeGen1.showTypes();
//        new ThreeGen<Person,Car,Food>(new Person("A",19), new Car(1000,"white"), new Food()).showTypes();
        new ThreeGen<>(new String(""), new Cat("", ""), 5.0).showTypes();
    }

    public T getOb1() {
        return ob1;
    }

    public void setOb1(T ob1) {
        this.ob1 = ob1;
    }

    public V getOb2() {
        return ob2;
    }

    public void setOb2(V ob2) {
        this.ob2 = ob2;
    }

    public K getOb3() {
        return ob3;
    }

    public void setOb3(K ob3) {
        this.ob3 = ob3;
    }

    public void showTypes() {
        System.out.println("ob1: " + getOb1().getClass().getName());
        System.out.println("ob2: " + getOb2().getClass().getName());
        System.out.println("ob3: " + getOb3().getClass().getName());
    }
}
