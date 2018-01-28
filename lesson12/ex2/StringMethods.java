package lesson12.ex2;

/**
 * Created by Student on 24.01.2018.
 */
public class StringMethods {
    public static void stringMethodsTest(String s) {
        if (s == null) {
            s = "I like java!!!";
        }
        System.out.println(s.startsWith("I like"));
        System.out.println(s.endsWith("!!!"));
    }

    public static void stringMethodsTest() {
        String s = "I like java!!!";
        System.out.println(s.startsWith("I like"));
        System.out.println(s.endsWith("!!!"));
    }

    public static void testCharAt() {
        String s = "I like java";
        System.out.println(s.charAt(s.length() - 1));
    }

    public static void testLIOF() {
        System.out.println("I like java".lastIndexOf("java"));
    }

    public static void testReplace() {
        System.out.println("I like java".replace("a", "o"));
    }

    public static void testToUpperCase() {
        System.out.println("I like java".toUpperCase());
    }

    public static void testToLowerCase() {
        System.out.println("I like java".toLowerCase());
    }

    public static void testSubstring() {
        System.out.println("I like java".substring("I like java".lastIndexOf("java")));
    }

    public static void main(String[] args) {
        stringMethodsTest();
        testCharAt();
        testLIOF();
        testReplace();
        testToLowerCase();
        testToUpperCase();
        testSubstring();
    }
}
