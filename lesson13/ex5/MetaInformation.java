package lesson13.ex5;

public class MetaInformation {
    public static void getMetaInfOf(Class someClass) {
        System.out.println(someClass.getClass());
        System.out.println(someClass.getSuperclass());
        System.out.println(someClass.getPackage());
        System.out.println(someClass.getModifiers());
        System.out.println(someClass.isArray());
        System.out.println(someClass.isInterface());
        System.out.println(someClass.isPrimitive());
        System.out.println(someClass.getDeclaredClasses());
        System.out.println(someClass.getDeclaredMethods());
        System.out.println(someClass.getDeclaredConstructors());
        System.out.println(someClass.getDeclaredFields());
        System.out.println(someClass.getClasses());
        System.out.println(someClass.getConstructors());
        System.out.println(someClass.getMethods());
        System.out.println(someClass.getFields());

    }

    public static void main(String[] args) {
        getMetaInfOf("".getClass());
    }
}
