package lesson20.atHome.e4MyQueue2;

public class Producer implements Runnable {
    private MyQueue2 myQueue2;

    public Producer(MyQueue2 aMyQueue2) {
        myQueue2 = aMyQueue2;
    }

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            myQueue2.put("i:" + i + " ");
        }
    }
}
