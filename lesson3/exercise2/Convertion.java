package lesson3.exercise2;

public class Convertion {

    public static void byteToShort(byte b) {
        short s = b;
    }

    public static void byteToInt(byte b) {
        int i = b;
    }

    public static void byteToLong(byte b) {
        long l = b;
    }

    public static void byteTofloat(byte b) {
         float f = b;
    }

    public static void byteToDouble(byte b) {
        double d = b;
    }


    public static void shortToInt(short s) {
        int i = s;
    }

    public static void shortToLong(short s) {
        long l = s;
    }

    public static void shortToFloat(short s) {
        float f = s;
    }

    public static void shortToDouble(short s) {
        double d = s;
    }


    public static void intToLong(int i) {
        long l = i;
    }

    public static void intTofloat(int i) {
        float f = i;
    }

    public static void intToDouble(int i) {
        double d = i;
    }


    public static void charToInt(char c) {
        int i = c;
    }

    public static void charToLong(char c) {
        long l = c;
    }

    public static void charToFloat(char c) {
        float f = c;
    }

    public static void charToDouble(char c) {
        double d = c;
    }


    public static void longToFloat(long l) {
        float f = l;
    }

    public static void longToDouble(long l) {
        double d = l;
    }


    public static void floatToDouble(float f) {
        double d = f;
    }


    public static void shortToByte(short s) {
        byte b = (byte) s;
    }


    public static void intToByte(int i) {
        byte b = (byte) i;
    }

    public static void intToShort(int i) {
        short s = (short) i;
    }

    public static void intToChar(int i) {
        char c = (char) i;
    }


    public static void floatToInt(float f) {
        int i = (int) f;
    }

    public static void floatToChar(float f) {
        char c = (char) f;
    }

    public static void floatToShort(float f) {
        short s = (short) f;
    }

    public static void floatToByte(float f) {
        byte b = (byte) f;
    }


    public static void longToInt(long l) {
        int i = (int) l;
    }

    public static void longToChar(long l) {
        char c = (char) l;
    }

    public static void longToShort(long l) {
        short s = (short) l;
    }

    public static void longToByte(long l) {
        byte b = (byte) l;
    }


    public static void doubleToFloat(float f) {
        double d = (double) f;
    }

    public static void doubleToLong(double d) {
        long l = (long) d;
    }

    public static void doubleToInt(double d) {
        int i = (int) d;
    }

    public static void doubleToChar(double d) {
        char c = (char) d;
    }

    public static void doubleToShort(double d) {
        short s = (short) d;
    }

    public static void doubleToByte(double d) {
        byte b = (byte) d;
    }

    public static void main(String[] args) {
        byte b = 0;
        short s = 1;
        int i = 2;
        long l = 3;
        float f = 4;
        double d = 5;
        char c = 6;

        doubleToByte(d);
        doubleToShort(d);
        doubleToChar(d);
        doubleToInt(d);
        doubleToLong(d);
        doubleToFloat(f);

        longToByte(l);
        longToShort(l);
        longToChar(l);
        longToInt(l);

        floatToByte(f);
        floatToShort(f);
        floatToChar(f);
        floatToInt(f);

        intToChar(i);
        intToShort(i);
        intToByte(i);

        shortToByte(s);

        floatToDouble(f);

        longToDouble(l);
        longToFloat(l);

        charToDouble(c);
        charToFloat(c);
        charToLong(c);
        charToInt(c);

        intToDouble(i);
        intTofloat(i);
        intToLong(i);

        shortToDouble(s);
        shortToFloat(s);
        shortToLong(s);
        shortToInt(s);

        byteToDouble(b);
        byteTofloat(b);
        byteToLong(b);
        byteToInt(b);
        byteToShort(b);
    }
}