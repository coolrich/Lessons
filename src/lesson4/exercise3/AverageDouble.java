package lesson4.exercise3;

public class AverageDouble {
    public static void init(double[] dArgs, String[] sArgs) {
        for (int i = 0; i < sArgs.length; i++) {
            dArgs[i] = Double.parseDouble(sArgs[i]);
        }
    }

    public static double calculateAverage(String[] sArgs) {
        double[] dArgs = new double[sArgs.length];
        init(dArgs, sArgs);
        double average = 0;
        int n = 0;

        for (; n < dArgs.length; n++) {
            average += dArgs[n];
        }

        return average / n;
    }

    public static void main(String[] args) {
        System.out.println(calculateAverage(args));
    }
}
