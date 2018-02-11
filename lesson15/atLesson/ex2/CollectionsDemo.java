package lesson15.atLesson.ex2;

import lesson12.ex6.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Student on 07.02.2018.
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        List<Person> arrayList = new ArrayList<>();
        arrayList.add(new Person());
        arrayList.add(new Person("John", 25));
        Person p = new Person();
        arrayList.add(p);
        System.out.println("Collection's size: " + arrayList.size());
        enumerateCollection(arrayList);
        System.out.println("\n");
        Person p1 = arrayList.get(1);
        p1.setAge(18);
        arrayList.set(1, p1);
        enumerateCollection(arrayList);
        System.out.println("size "+arrayList.size());
        arrayList.remove(arrayList.size()-1);
        System.out.println("size "+arrayList.size());
        System.out.println(arrayList);
        Object[] objects=arrayList.toArray();
        for (Object object:objects){
            System.out.println(object);
        }
        System.out.println("\n");
        Person[] persons=new Person[arrayList.size()];
        arrayList.toArray(persons);
        for (Person person:persons){
            System.out.println(person.getFullName());
        }
        recievePersonArray2(arrayList);
        arrayList.clear();
    }

    public static void enumerateCollection(List<Person> arrayList) {
        for (Person person : arrayList) {
            System.out.println("Element of arrayList " + person);
        }
    }
    public static void recievePersonArray2(List<Person> arrayList){
        Person[] persons = arrayList.toArray(new Person[0]);
        for (Person p: persons){
            System.out.println("El of arrList: "+p.getFullName());
        }
    }
}
