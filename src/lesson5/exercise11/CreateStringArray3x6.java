package lesson5.exercise11;

public class CreateStringArray3x6 {
    public static void printString(String[][] s) {
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                System.out.print(s[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static String[][] init(String[][] m) {
        char c = 'a';
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = "" + c + (j + 1);
            }
            c++;
        }
        return m;
    }

    public static void main(String[] args) {
        String[][] s = new String[3][6];
        init(s);
        printString(s);
    }
}
