package lesson18.atHome.e6InternetShopWithReport.shopParts;

/**
 * Created by student on 11.02.2018.
 */
public class Product implements Comparable<Product> {
    private String name;
    private double price;
    private int rating;

    public Product(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (Double.compare(product.getPrice(), getPrice()) != 0) return false;
        if (getRating() != product.getRating()) return false;
        return getName() != null ? getName().equals(product.getName()) : product.getName() == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getName() != null ? getName().hashCode() : 0;
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getRating();
        return result;
    }

    @Override
    public String toString() {
        return "Product: " + name +
                " Price: " + price +
                " Rating:" + rating +
                "\n";
    }

    @Override
    public int compareTo(Product o) {
        if (this.getRating() != o.getRating()) {
            return o.getRating() - this.getRating();
        } else {
            return this.getName().compareTo(o.getName());
        }
    }

}
