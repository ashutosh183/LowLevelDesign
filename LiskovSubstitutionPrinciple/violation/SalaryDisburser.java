package violation;

import java.util.List;

public class SalaryDisburser {
    public void disburseSalary(List<Employee> employees){
        for(Employee employee: employees){
            employee.calculateSalary();
        }
    }
}
