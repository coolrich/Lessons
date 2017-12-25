package lesson5.exercise7;

public class BinaryLightBulbs {
    public static void blink(int lightBulbs, int count) {
        for (int i = 0; i < count; i++) {
            lightBulbs = ~lightBulbs;
            formattedStatusPrint(lightBulbs);
        }
    }

    public static void turnOnTickerMode(int lightBulbs, boolean toRight, int shift) {
        for (int i = 0; i < 32; i++) {
            formattedStatusPrint(lightBulbs);
            if (toRight) {
                lightBulbs = lightBulbs >>> shift;
            } else {
                lightBulbs = lightBulbs << shift;
            }
        }
    }

    public static boolean isFirstOn(int lightBulbs) {
        return (lightBulbs & 1) == 1;
    }

    public static void formattedStatusPrint(int lightBulbs) {
        String s = Integer.toBinaryString(lightBulbs);
        String initial = new String(s);
        for (int i = 0; i < 32 - initial.length(); i++) {
            s = "0" + s;
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        int lightBulbs = 0b00000000000000000000000000000001;
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
