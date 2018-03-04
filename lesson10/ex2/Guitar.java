package lesson10.ex2;

public class Guitar implements Instrument {
    private NumberOfStrings numberOfStrings = NumberOfStrings.valueOf("SIX");

    public Guitar(String numberOfStrings) {
        for (NumberOfStrings s : NumberOfStrings.values()) {
            if (numberOfStrings.equals(s.name())) {
                this.numberOfStrings = NumberOfStrings.valueOf(numberOfStrings);
            }
        }
    }

    @Override
    public void play() {
        System.out.println("The guitar plays key " + KEY + ". It has " + numberOfStrings.name() + " strings.");
    }

    enum NumberOfStrings {SIX, SEVEN}
}
