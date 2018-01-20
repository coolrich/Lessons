package Lesson9.AtHome.ex5.p1;

public class SomeClass {
    public static void main(String[] args) {
        System.out.println("defaultObj " + AccessLevel.defaultObj + "\npublicObj " + AccessLevel.publicObj + "\nprivateObj " + /*AccessLevel.privateObj*/ "\nprotectedObj " + AccessLevel.protectedObj);
        AccessLevel.defaultMethod();
        AccessLevel.publicMethod();
        //AccessLevel.privateMethod();
        AccessLevel.protectedMethod();
    }
}
