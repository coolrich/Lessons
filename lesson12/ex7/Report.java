package lesson12.ex7;

public class Report {
    public static void generateReport(Employee[] employees){
        System.out.println("#***Name**********Salary");
        int i=0;
        for (Employee e:employees){
            System.out.printf("%d---%s----------%.2f\n",++i,e.getFullname(),e.getSalary());
        }
    }

    public static void main(String[] args) {
        generateReport(Employee.createEmployees("Adam","Carl","John"));
    }
}
