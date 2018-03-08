package lesson18.atHome.e6InternetShopWithReport.usersData.report;

import lesson18.atHome.e6InternetShopWithReport.shopParts.Product;
import lesson18.atHome.e6InternetShopWithReport.usersData.Basket;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigDecimal;

public class Report {
    public void writeReport(Basket basket) {
        String path = "lesson18/atHome/e6InternetShopWithReport/usersData/report/report.txt";
        try (PrintWriter pw = new PrintWriter(new File(path))) {
            int count = 1;
            pw.format("*#****Name*****Price******Rating*\n");
            String sep = "*";
            for (Product p : basket.getProductList()) {
                String name = p.getName();
                String price = String.valueOf(p.getPrice());
                String rating = String.valueOf(p.getRating());
                int interval1 = 5;
                int indent1 = Math.abs(interval1 - Integer.toString(count).length());
                int interval2 = 9;
                int indent2 = Math.abs(interval2 - name.length());
                int interval3 = 3;
                int priceLength = new BigDecimal(price).scale() == 1 ? price.length() + 1 : price.length();
                int indent3 = Math.abs(interval3 - priceLength);
                System.out.println();
                int interval4 = 7;
                int indent4 = Math.abs(interval4 - rating.length());
                pw.format("%s%d%" + (indent1 == 0 ? "" : indent1) + "s%s%" + (indent2 == 0 ? "" : indent2) + "s%.2f%" + (indent3 == 0 ? "" : indent3) + "s%d%" + ((indent4 == 0 ? "" : indent4)) + "s\n", sep, count++, sep, name, sep, Float.valueOf(price), sep, Integer.valueOf(rating), sep);
            }
            pw.format("*********************************");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
