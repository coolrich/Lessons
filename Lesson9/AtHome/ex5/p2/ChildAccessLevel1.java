package Lesson9.AtHome.ex5.p2;

import Lesson9.AtHome.ex5.p1.AccessLevel;

public class ChildAccessLevel1 extends AccessLevel{
    public static void main(String[] args) {
        System.out.println("defaultObj " + /*defaultObj*/"\npublicObj " + publicObj + "\nprivateObj " + /*privateObj*/ "\nprotectedObj " + protectedObj);
        //defaultMethod();
        publicMethod();
        //privateMethod();
        protectedMethod();
    }
}
