package lesson10.ex2;

public class Tube implements Instrument {
    private int diameter;

    public Tube(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Thu tube plays key " + KEY + ". It has diameter" + ".");
    }
}
