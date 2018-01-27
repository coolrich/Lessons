package lesson12.ex2;

import java.util.Scanner;

public class StringBuilderTest {
    public static void main(String[] args) {
        startTest();
    }

    public static void startTest() {
        StringBuilder sb1 = new StringBuilder();
        append(sb1, "11+22=33");
        toPrint(sb1);
        deleteString(sb1);
        append(sb1, "10*10=100");
        toPrint(sb1);
        deleteString(sb1);
        append(sb1, "33-22=11");
        sb1.deleteCharAt(sb1.length() - 1 - 2);
        sb1.insert(sb1.length() - 1 - 1, " равно ");
        toPrint(sb1);
        deleteString(sb1);
        append(sb1, "123*1=123");
        toPrint(sb1);
        replace(sb1);
        toPrint(sb1);
    }

    public static void replace(StringBuilder sb1) {
        sb1.replace(sb1.length() - 1 - 3, sb1.length() - 1 - 2, " equals ");
    }

    public static void deleteString(StringBuilder sb1) {
        sb1.delete(0, sb1.length());
    }

    public static void toPrint(StringBuilder sb1) {
        System.out.println(sb1);
    }

    public static void append(StringBuilder sb1, String s) {
        sb1.append(s);
    }
}
