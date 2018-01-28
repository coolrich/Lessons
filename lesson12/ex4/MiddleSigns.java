package lesson12.ex4;

public class MiddleSigns {
    public static String getMiddleSigns(String s) {
        return s.substring((s.length() - 1) / 2, (s.length()) / 2 + 1);
    }

    public static void main(String[] args) {
        System.out.println(getMiddleSigns("string"));
        System.out.println(getMiddleSigns("code"));
        System.out.println(getMiddleSigns("Practice"));
    }
}
