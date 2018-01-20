package lesson9.atHome.ex5.p1;

public class ChildAccessLevel extends AccessLevel{
    public static void main(String[] args) {

        System.out.println("defaultObj " + defaultObj + "\npublicObj " + publicObj + "\nprivateObj " + /*privateObj*/ "\nprotectedObj " + protectedObj);
        defaultMethod();
        publicMethod();
        //privateMethod();
        protectedMethod();
    }
}
