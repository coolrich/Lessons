package lesson10.ex2;

public class InstrumentDemo {
    public static void start() {
        Instrument[] instruments = {new Drum("MEDIUM"), new Guitar("SEVEN"), new Tube(5)};
        for (Instrument i : instruments) {
            i.play();
        }
    }

    public static void main(String[] args) {
        start();
    }
}
