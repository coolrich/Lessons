package lesson10.ex3;

public enum Seasons {
    WINTER(-15), SPRING(5), SUMMER(23) {
        @Override
        public String getDescription() {
            return "Warm season";
        }
    }, AUTUMN(7);
    private int averageTemp;

    Seasons(int averageTemp) {
        this.averageTemp = averageTemp;
    }

    public int getAverageTemp() {
        return averageTemp;
    }

    public String getDescription() {
        return "Cold season";
    }

    public static void printString(Seasons seasons) {
        switch (seasons) {
            case AUTUMN:
                System.out.println("I like " + seasons.name());
                break;
            case SPRING:
                System.out.println("I like " + seasons.name());
                break;
            case SUMMER:
                System.out.println("I like " + seasons.name());
                break;
            case WINTER:
                System.out.println("I like " + seasons.name());
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

    public static void main(String[] args) {
        Seasons season = Seasons.SUMMER;
        System.out.println(season);
        Seasons.printString(season);
        for (Seasons s : Seasons.values()) {
            System.out.println("Season: " + s.name() + "\nAverage temperature " + s.getAverageTemp() + "\nDescription: " + s.getDescription());
        }
    }
}
