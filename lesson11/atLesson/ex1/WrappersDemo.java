package lesson11.atLesson.ex1;


/**
 * Created by Student on 24.01.2018.
 */
public class WrappersDemo {
    public static void main(String[] args) {
        Double d = 1.0;
        System.out.println(d = 0.0);
        System.out.println(d = new Double("-0.0"));
        System.out.println(Double.valueOf(19734682));
        System.out.println(Double.valueOf("-19734682"));
        double d3 = Double.parseDouble("123789654");
        String s = Double.toString(d3);
        Double d1 = d3;
        System.out.println(d1.byteValue());
        System.out.println(d1.shortValue());
        System.out.println(d1.intValue());
        System.out.println(d1.longValue());
        System.out.println(d1.doubleValue());
        Integer i = 1;
    }
}
