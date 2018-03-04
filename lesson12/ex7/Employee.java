package lesson12.ex7;

/**
 * Создать класс Employee, у которого есть переменные
 * класса - fullname, salary. Создать массив содержащий
 * несколько объектов этого типа. Создать класс Report,
 * который будет содержать статический метод generateReport, в
 * котором выводится информация о зарплате всех сотрудников.
 * Используйте форматировании строк. Пусть salary будет
 * выровнено по правому краю, десятичное значение имеет 2
 * знака после запятой и можете добавить что-нибудь свое.
 */
public class Employee {
    private static Employee[] employees;
    private String fullname;
    private double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public static Employee[] getEmployees() {
        return employees;
    }

    public static void setEmployees(Employee[] employees) {
        Employee.employees = employees;
    }

    public static Employee[] createEmployees(String... names) {
        employees = new Employee[names.length];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee(names[i], (int) (Math.random() * 1000));
        }
        return employees;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
