package lesson8.exercise4;

/**
 * Создать класс Flower, который содержит переменные страна производитель, срок хранения в днях, цена.
 * Создать классы расширяющие класс Flower (для примера, пусть это будут розы, гвоздики, тюльпаны и... что-то на свой вкус).
 * Собрать 3 букета (используем массив) с определением их стоимости.
 * В букет может входить несколько цветов разного типа.
 * Также подсчитать количество проданных цветов (используем статическую переменную).
 */
public abstract class Flower {
    private String manufacturerCountry;
    private int shelfLife;
    private int cost;
    private static int cntrOfAllFlwrs = 0;
    private static int costOfAllFlwrs = 0;

    public Flower(String manufacturerCountry, int shelfLife, int cost) {
        this.manufacturerCountry = manufacturerCountry;
        this.shelfLife = shelfLife;
        this.cost = cost;
        cntrOfAllFlwrs++;
        costOfAllFlwrs += cost;
    }

    public static int getCntrOfAllFlwrs() {
        return cntrOfAllFlwrs;
    }

    public static int getCostOfAllFlwrs() {
        return costOfAllFlwrs;
    }

    public abstract String printInfo();

    public void printPriceOfFlowers() {
        System.out.println(costOfAllFlwrs);
    }

    public void setManufacturerCountry(String manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife > 0 ? shelfLife : 0;
    }

    public void setCost(int cost) {
        this.cost = cost > 0 ? cost : 0;
    }

    public String getManufacturerCountry() {
        return manufacturerCountry;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public int getCost() {
        return cost;
    }


    public static void initRandomFlowers(Flower[][] flowers) {
        for (int i = 0; i < flowers.length; i++) {
            for (int j = 0; j < flowers[i].length; j++) {
                byte n = (byte) (Math.random() * 5);
                if (n <= 1) {
                    flowers[i][j] = new Carnation("Ukraine", 365 * 2, 25);
                } else if (n <= 2) {
                    flowers[i][j] = new Tulip("Ukraine", 450, 50);
                } else if (n <= 3) {
                    flowers[i][j] = new Rose("Ukraine", 365 * 2, 75, true);
                } else if (n <= 4) {
                    flowers[i][j] = new Middledames("Ukraine", 365 * 2, 100);
                }
            }
        }
    }

    public static void printFlowers(Flower[][] flowers) {
        int numOfBouquet = 1;
        for (Flower[] fl :
                flowers) {
            System.out.println("\nNumber of bouquet: " + numOfBouquet++);
            for (Flower f : fl) {
                System.out.println(
                        "\nName: " + f.printInfo() +
                                "\nShelf life: " + f.getShelfLife() +
                                "\nManufacturer country: " + f.getManufacturerCountry() +
                                "\nCost: " + f.getCost());
            }
        }
        System.out.println("\n\nNumber of sold flowers: " + getCntrOfAllFlwrs());
        System.out.println("Cost of sold flowers: " + getCostOfAllFlwrs());
    }

    public static void main(String[] args) {
        Flower[][] flowers = new Flower[3][4];
        initRandomFlowers(flowers);
        printFlowers(flowers);
    }
}
