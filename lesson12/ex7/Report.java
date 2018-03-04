package lesson12.ex7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Report {

    public static void main(String[] args) {
        try {
            new Report().generateReport(Employee.createEmployees("Adam", "Carl", "John"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void generateReport(Employee[] employees) throws FileNotFoundException {
        String title = "#***Name**********Salary\n";
        PrintWriter pw = new PrintWriter(new File("D:\\programming\\java\\Java Projects\\UIS\\Git\\Lessons1\\lesson12\\e4\\report.txt"));
        pw.write(title);
        System.out.print(title);
        int i = 0;
        for (Employee e : employees) {
            System.out.printf("%d%7s%16.2f\n", ++i, e.getFullname(), e.getSalary());
            pw.format("%d%7s%16.2f\n", i, e.getFullname(), e.getSalary());
        }
        pw.close();
    }
}
