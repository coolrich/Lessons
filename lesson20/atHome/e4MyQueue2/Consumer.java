package lesson20.atHome.e4MyQueue2;

public class Consumer implements Runnable {
    String name;
    private MyQueue2 myQueue2;

    public Consumer(MyQueue2 aMyQueue2, String aName) {
        myQueue2 = aMyQueue2;
        name = aName;
    }

    @Override
    public void run() {
        for (; ; ) {
            System.out.println("consumer " + name);
            myQueue2.get();
        }
    }
}
