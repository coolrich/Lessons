package lesson12.ex7;

public class Report {

    public void generateReport(Employee[] employees) {
        System.out.println("#***Name**********Salary");
        int i = 0;
        for (Employee e : employees) {
            System.out.printf("%d%7s%16.2f\n", ++i, e.getFullname(), e.getSalary());
        }
    }

    public static void main(String[] args) {
        new Report().generateReport(Employee.createEmployees("Adam", "Carl", "John"));
    }
}
