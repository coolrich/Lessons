package lesson20.atHome.e5;

public class Fork {
    private static int forkId = 0;
    private final int id = ++forkId;
    private boolean onTable;
    public Fork() {
        onTable=true;
    }

    public static void setForkId(int forkId) {
        Fork.forkId = forkId;
    }

    public boolean isOnTable() {
        return onTable;
    }

    public void setOnTable(boolean onTable) {
        this.onTable = onTable;
    }

    public static int getForkId() {
        return forkId;
    }

    public int getId() {
        return id;
    }
}
