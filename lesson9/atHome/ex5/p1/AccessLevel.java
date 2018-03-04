package lesson9.atHome.ex5.p1;

public class AccessLevel {
    static public Object publicObj = new Object();
    static protected Object protectedObj = new Object();
    static Object defaultObj = new Object();
    static private Object privateObj = new Object();

    static void defaultMethod() {
        System.out.println("In defaultMethod");
    }

    public static void publicMethod() {
        System.out.println("In publicMethod");
    }

    private static void privateMethod() {
        System.out.println("In privateMethod");
    }

    protected static void protectedMethod() {
        System.out.println("In protectedMethod");
    }

    public static void main(String[] args) {
        System.out.println("defaultObj " + defaultObj + "\npublicObj " + publicObj + "\nprivateObj " + privateObj + "\nprotectedObj " + protectedObj);
        defaultMethod();
        publicMethod();
        privateMethod();
        protectedMethod();
    }
}
