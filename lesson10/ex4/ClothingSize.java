package lesson10.ex4;

public enum ClothingSize {
    XXS(1) {
        public String getDescription() {
            return "Child size";
        }
    }, XS(2), S(3), M(4), L(5);

    private int euroSize;

    ClothingSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription() {
        return "Adult size";
    }
}
