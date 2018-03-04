package lesson13.ex3;

import lesson12.ex7.Employee;

import java.util.Calendar;
import java.util.Date;

public class ModifiedEmployee extends Employee {
    public static ModifiedEmployee[] modifiedEmployees;
    private Date salaryDate;

    public ModifiedEmployee(String fullname, double salary, Date salaryDate) {
        super(fullname, salary);
        this.salaryDate = salaryDate;
    }

    public static ModifiedEmployee[] createEmployees(String... names) {
        modifiedEmployees = new ModifiedEmployee[names.length];
        for (int i = 0; i < modifiedEmployees.length; i++) {
            modifiedEmployees[i] = new ModifiedEmployee(names[i], (double) (Math.random() * 1000), new Date());
        }
        return modifiedEmployees;
    }

    public Date getSalaryDate() {
        return salaryDate;
    }

    public void setSalaryDate(Calendar calendar) {
        this.salaryDate = calendar.getTime();

    }
}
