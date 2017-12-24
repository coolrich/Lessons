package lesson6.exercise17;

public class BinaryLightBulbs {
    public static void blink(int[] lightBulbs, int count) {

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < lightBulbs.length; j++) {
                lightBulbs[j] = lightBulbs[j] == 0 ? 1 : 0;
            }
            formattedStatusPrint(lightBulbs);
        }
    }

    public static void turnOnTickerMode(int[] lightBulbs, boolean toRight, int cycles) {
        if (cycles > 0) {
            formattedStatusPrint(lightBulbs);
            for (int i = 1; i < lightBulbs.length * cycles; i++) {
                if (toRight) {
                    System.arraycopy(lightBulbs, i - 1, lightBulbs, i, 1);
                } else {
                    System.arraycopy(lightBulbs, lightBulbs.length - i, lightBulbs, lightBulbs.length - i - 1, 1);
                }
                formattedStatusPrint(lightBulbs);

            }
        } else {
            System.out.println("The number of cycles can not be less than one!");
        }


    }

    public static boolean isFirstOn(int[] lightBulbs) {
        return (lightBulbs[lightBulbs.length - 1] & 1) == 1;
    }

    public static void formattedStatusPrint(int[] lightBulbs) {
        for (int i = 0; i < lightBulbs.length; i++) {
            System.out.print(lightBulbs[i]);
        }
        System.out.println();
    }

    public static void init(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = i == 0 || i == a.length - 1 ? 1 : 0;
        }
    }

    public static void main(String[] args) {
        int[] lightBulbs = new int[32];
        init(lightBulbs);

        String choice = args[0];

        switch (choice) {
            case "blink":
                blink(lightBulbs, 5);
                break;
            case "ticker":
                turnOnTickerMode(lightBulbs, false, 1);
                break;
            case "checkFirst":
                isFirstOn(lightBulbs);
                break;
        }
    }
}
