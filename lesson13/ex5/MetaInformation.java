package lesson13.ex5;

import java.util.Arrays;

public class MetaInformation {
    public static void getMetaInfOf(Class someClass) {
        System.out.println(someClass.getClass());
        System.out.println(someClass.getSuperclass());
        System.out.println(someClass.getPackage());
        System.out.println(someClass.getModifiers());
        System.out.println(someClass.isArray());
        System.out.println(someClass.isInterface());
        System.out.println(someClass.isPrimitive());
        System.out.println(Arrays.deepToString(someClass.getDeclaredClasses()) + "\n\n\n");
        System.out.println(Arrays.deepToString(someClass.getDeclaredMethods()) + "\n\n\n");
        System.out.println(Arrays.deepToString(someClass.getDeclaredConstructors()) + "\n\n\n");
        System.out.println(Arrays.deepToString(someClass.getDeclaredFields()) + "\n\n\n");
        System.out.println(Arrays.deepToString(someClass.getClasses()) + "\n\n\n");
        System.out.println(Arrays.deepToString(someClass.getConstructors()) + "\n\n\n");
        System.out.println(Arrays.deepToString(someClass.getMethods()) + "\n\n\n");
        System.out.println(Arrays.deepToString(someClass.getFields()) + "\n\n\n");
    }

    public static void main(String[] args) {
        getMetaInfOf("".getClass());
    }
}
