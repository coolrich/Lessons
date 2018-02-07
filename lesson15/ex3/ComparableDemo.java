package lesson15.ex3;

import lesson12.ex6.Person;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Student on 07.02.2018.
 */
public class ComparableDemo {
    public static void main(String[] args) {
        Set<Person> personSet = new TreeSet<Person>();
        personSet.add(new Person("Jack",20));
        personSet.add(new Person("Jack",19));
        personSet.add(new Person("Jack",21));
    }
}
