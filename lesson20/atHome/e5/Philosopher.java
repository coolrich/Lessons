package lesson20.atHome.e5;

import java.util.Scanner;

public class Philosopher implements Runnable {
    private static Philosopher[] philosophers = new Philosopher[5];
    private static int counter = 1;
    private final int phlsphrsNmbr = counter++;
    private boolean isEating;
    private Fork left;
    private Fork right;
    private static Table table = new Table();

    private Philosopher() {
    }

    public int getPhlsphrsNmbr() {
        return phlsphrsNmbr;
    }

    private void toThink() {
        if (left != null && right != null) {
            left.setOnTable(true);
            right.setOnTable(true);
        }
        isEating = false;
    }

    private void tryToEat() {
        isEating = getForks();
    }

    private boolean getForks() {
        Fork[] f = table.get(this);
        if (f != null) {
            left = f[0];
            right = f[1];
            return true;
        }
        return false;
    }

    private void action() {
        if (Math.random() < 0.5) {
            tryToEat();
        } else {
            toThink();
        }
    }

    private String getState() {
        if (isEating) {
            return Thread.currentThread().getName() + " is eating";
        } else {
            return Thread.currentThread().getName() + " is thinking";
        }
    }

    public static void getStates() {
        for (Philosopher p : philosophers) {
            System.out.println(p.getState());
        }
    }

    @Override
    public void run() {
        Scanner s = new Scanner(System.in);
        while (true) {
            action();
            System.out.println(getState());

        }
    }

    private static int getCounter() {
        return counter;
    }

    public static Thread[] create5PhilosopherThreads() {
        if (Philosopher.getCounter() <= 5) {
            return new Thread[]{
                    new Thread(philosophers[0] = new Philosopher(), philosophers[0].getPhlsphrsNmbr() + ""),
                    new Thread(philosophers[1] = new Philosopher(), philosophers[1].getPhlsphrsNmbr() + ""),
                    new Thread(philosophers[2] = new Philosopher(), philosophers[2].getPhlsphrsNmbr() + ""),
                    new Thread(philosophers[3] = new Philosopher(), philosophers[3].getPhlsphrsNmbr() + ""),
                    new Thread(philosophers[4] = new Philosopher(), philosophers[4].getPhlsphrsNmbr() + "")};
        } else {
            return null;
        }
    }
}
