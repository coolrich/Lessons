package lesson13.ex3;

import lesson12.ex7.Employee;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class ModifiedEmployee extends Employee {
    private Date salaryDate;
    public static ModifiedEmployee[] modifiedEmployees;

    public ModifiedEmployee(String fullname, double salary, Date salaryDate) {
        super(fullname, salary);
        this.salaryDate = salaryDate;
    }

    public Date getSalaryDate() {
        return salaryDate;
    }

    public void setSalaryDate(Calendar calendar) {
        this.salaryDate = calendar.getTime();

    }

    public static ModifiedEmployee[] createEmployees(String... names) {
        modifiedEmployees = new ModifiedEmployee[names.length];
        for (int i = 0; i < modifiedEmployees.length; i++) {
            modifiedEmployees[i] = new ModifiedEmployee(names[i], (double) (Math.random() * 1000), new Date());
        }
        return modifiedEmployees;
    }
}
