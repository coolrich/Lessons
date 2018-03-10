package lesson20.atHome.e5;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private List<Fork> forks;

    public Table() {
        forks = new ArrayList<>();
        forks.add(new Fork());
        forks.add(new Fork());
        forks.add(new Fork());
        forks.add(new Fork());
        forks.add(new Fork());
    }

    public synchronized Fork[] get(Philosopher p) {
        int philNum = p.getPhlsphrsNmbr();
        int leftFork = philNum - 1 == 0 ? 4 : philNum - 1;
        int rightFork = philNum;
        if (forks.size() > rightFork) {
            while (!forks.get(leftFork).isOnTable() || !forks.get(rightFork).isOnTable()) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
            return new Fork[]{forks.get(leftFork), forks.get(rightFork)};
        } else {
            return null;
        }
    }

    public synchronized void put(Fork[] f) {
        forks.add(f[0].getId(), f[0]);
        forks.add(f[1].getId(), f[1]);
        notifyAll();
    }
}
