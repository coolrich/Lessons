package lesson10.ex2;

public class Drum implements Instrument {
    enum Size {SMALL, MEDIUM, HUGE}

    private Size size = Size.valueOf("SMALL");

    public Drum(String size) {
        for (Size s : Size.values()) {
            if (size.equals(s.name())) {
                this.size = Size.valueOf(size);
            }
        }
    }

    @Override
    public void play() {
        System.out.println("The drum plays. It has " + size.name() + " size.");
    }


}
