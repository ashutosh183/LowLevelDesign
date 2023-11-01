package violation;

public abstract class Employee {
    public final Integer employeeId;

    Employee(int employeeId){
        this.employeeId = employeeId;
    }

    protected abstract double calculateSalary();
}
