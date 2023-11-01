package violation;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUtility {
    public static void main(String[] args) {
        ContractualEmployee ce = new ContractualEmployee(90);
        Intern intern = new Intern(9);
        FullTimeEmployee fte = new FullTimeEmployee(18);
        Volunteer volunteer = new Volunteer(10000);
        List<Employee> employees = new ArrayList<>();
        employees.add(ce);
        employees.add(intern);
        employees.add(fte);
        employees.add(volunteer);
        SalaryDisburser salaryDisburser = new SalaryDisburser();
        salaryDisburser.disburseSalary(employees);
    }
}
