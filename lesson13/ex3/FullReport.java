package lesson13.ex3;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;


public class FullReport {

    public static void main(String[] args) {
        try {
            System.out.println("RU:");
            new FullReport().generateReport(ModifiedEmployee.createEmployees("Adam", "Carl", "John"), new Locale("ru", "RU"));
            System.out.println("US:");
            new FullReport().generateReport(ModifiedEmployee.createEmployees("Adam", "Carl", "John"), new Locale("en", "US"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public void generateReport(ModifiedEmployee[] employees, Locale l) throws UnsupportedEncodingException {
        int i = 0;
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, l);
        ResourceBundle rb = ResourceBundle.getBundle("TitleNames", l);
        System.out.printf("%s***%s**********%s*****%s\n",
                new String((rb.getString("number"))
                        .getBytes("ISO-8859-1"), "windows-1251"),
                new String((rb.getString("name"))
                        .getBytes("ISO-8859-1"), "windows-1251"),
                new String((rb.getString("salary"))
                        .getBytes("ISO-8859-1"), "windows-1251"),
                new String((rb.getString("salaryDate"))
                        .getBytes("ISO-8859-1"), "windows-1251"));
        for (ModifiedEmployee e : employees) {
            System.out.printf("%d%7s%15s%12s\n", ++i, e.getFullname(), nf.format(e.getSalary()), dateFormat.format(e.getSalaryDate()));
        }
    }
}
